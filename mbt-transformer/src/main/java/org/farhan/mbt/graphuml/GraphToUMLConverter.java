package org.farhan.mbt.graphuml;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.ValueSpecification;
import org.farhan.cucumber.Tag;
import org.farhan.mbt.core.ConvertibleObject;
import org.farhan.mbt.core.ToUMLGherkinConverter;
import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.core.Validator;
import org.farhan.mbt.graph.JGraphTProject;
import org.farhan.mbt.graph.JGraphTGraphWrapper;
import org.farhan.mbt.graph.MBTEdge;
import org.farhan.mbt.graph.MBTGraph;
import org.farhan.mbt.graph.MBTPath;
import org.farhan.mbt.graph.MBTVertex;
import org.farhan.mbt.uml.UMLClassWrapper;
import org.farhan.mbt.uml.UMLProject;

public class GraphToUMLConverter extends ToUMLGherkinConverter {

	private UMLClassWrapper tgtWrp;
	private JGraphTProject srcPrj;

	public GraphToUMLConverter(String layer, JGraphTProject source, UMLProject target) {
		this.layer = layer;
		this.srcPrj = source;
		this.tgtPrj = target;
	}

	@Override
	protected void selectObjects() throws Exception {

		ArrayList<File> files = Utilities.recursivelyListFiles(srcPrj.getDir(srcPrj.FIRST_LAYER),
				srcPrj.getFileExt(srcPrj.FIRST_LAYER));
		srcPrj.getObjects(srcPrj.FIRST_LAYER).clear();
		for (File f : files) {
			srcPrj.createObject(f.getAbsolutePath()).load();
		}
	}

	@Override
	protected ArrayList<ConvertibleObject> getObjects(String layer) {
		return srcPrj.getObjects(layer);
	}

	@Override
	protected void convertObject(ConvertibleObject theObject) throws Exception {

		JGraphTGraphWrapper jgw = (JGraphTGraphWrapper) theObject;
		String qualifiedName = convertObjectName(jgw.getFile().getAbsolutePath());
		tgtWrp = (UMLClassWrapper) tgtPrj.createObject(qualifiedName);
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) jgw.get();
		createAnnotation((Class) tgtWrp.get(), "title", g.getLabel());
		for (String t : g.getTag().split(",")) {
			createAnnotation((Class) tgtWrp.get(), "tags", t);
		}
		((Class) tgtWrp.get()).createOwnedComment().setBody(g.getDescription());

	}

	@Override
	protected void convertImports(ConvertibleObject theObject) throws Exception {
	}

	@Override
	protected void convertBehaviours(ConvertibleObject theObject) throws Exception {

		JGraphTGraphWrapper jgw = (JGraphTGraphWrapper) theObject;
		MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) jgw.get();
		ArrayList<MBTPath> paths = getPathsFromVertex(g, g.getStartVertex());
		for (int i = 0; i < paths.size(); i++) {
			resetCurrentMachineAndState();
			Interaction anInteraction = createInteraction((Class) tgtWrp.get(), paths.get(i).getLabel());
			anInteraction.createOwnedComment().setBody(paths.get(i).getDescription());
			convertTagsToParameters(anInteraction, paths.get(i).getTags().split(","));
			convertInteractionMessages(anInteraction, paths.get(i).getPath());
		}
	}

	private void convertTagsToParameters(Interaction anInteraction, String[] tags) {
		for (String t : tags) {
			createParameter(anInteraction, t, "", "in");
		}
	}

	@Override
	protected void convertInteractionMessages(Interaction anInteraction, List<?> steps) throws Exception {

		boolean isField = false;
		boolean isKeyword = true;
		HashMap<String, String> dataTable = null;
		// use loop with counters
		// ignore 0, it's start
		// ignore 1, it's blank edge
		// ignore size -1, it's end
		for (int i = 2; i < steps.size() - 1; i++) {
			// for each i
			String cs = getLabel(steps.get(i));
			if (cs.contentEquals("start")) {
				// if it's start, make empty map, set isField to true, is Keyword to false, skip
				// empty edge
				dataTable = new HashMap<String, String>();
				isField = true;
				isKeyword = false;
				i++;
			} else if (cs.contentEquals("end")) {
				// if it's end, convert map to table, set isField to false, isKeyword to true
				convertDataTableToArgument(dataTable, anInteraction.getMessages().getLast());
				isField = false;
				isKeyword = true;
			} else if (isKeyword) {
				// if isKeyword, then make it a step
				if (Validator.validateStepText(cs)) {
					setCurrentMachineAndState(cs);
					convertMessage(anInteraction, cs);
				} else {
					throw new Exception("Step (" + cs + ") is not valid, use Xtext editor to correct it first. ");
				}
				// skip the next element since it's an edge
				if (!getLabel(steps.get(i + 1)).contentEquals("start")) {
					i++;
				}
			} else if (isField) {
				// if isField, then add map element for i and i+1, then i++
				dataTable.put(cs, getLabel(steps.get(i + 1)));
				i++;
			}
		}
	}

	@Override
	protected void convertMessage(Interaction anInteraction, Object o) {
		String s = (String) o;
		String messageName = s;
		Class nextLayerClass = createClassImport(getSecondLayerClassName(), anInteraction);
		Message theMessage = getMessage(anInteraction, nextLayerClass, messageName);
		createAnnotation(theMessage, "Step", "Keyword", "Asterisk");
	}

	@Override
	protected String convertObjectName(String fullName) {
		String qualifiedName = fullName.trim();
		qualifiedName = qualifiedName.replace(srcPrj.getFileExt(srcPrj.FIRST_LAYER), "");
		qualifiedName = qualifiedName.replace(srcPrj.getDir(srcPrj.FIRST_LAYER).getAbsolutePath(), "");
		qualifiedName = qualifiedName.replace(File.separator, "::");
		qualifiedName = "pst::specs" + qualifiedName;
		return qualifiedName;
	}

	private String getLabel(Object o) {
		if (o instanceof MBTVertex) {
			return ((MBTVertex) o).getLabel();
		} else {
			return ((MBTEdge) o).getLabel();
		}
	}

	private void convertDataTableToArgument(HashMap<String, String> dataTable, Message theMessage) {
		ValueSpecification vs = createArgument(theMessage, "dataTable", "");

		String headerRow = "";
		String valueRow = "";
		for (String columnName : dataTable.keySet()) {
			headerRow += columnName + " |";
			valueRow += dataTable.get(columnName) + " |";
		}
		createAnnotation(vs, "dataTable", String.valueOf(0), headerRow);
		createAnnotation(vs, "dataTable", String.valueOf(1), valueRow);
	}

	private String getSecondLayerClassName() {
		String secondLayerClassName = "";
		secondLayerClassName = convertNextLayerClassName(getFSMName() + getFSMState() + "Steps");
		secondLayerClassName = "pst::" + srcPrj.SECOND_LAYER + "::" + Utilities.toLowerCamelCase(getFSMName()) + "::"
				+ secondLayerClassName;
		return secondLayerClassName;
	}

	private static ArrayList<MBTPath> getPathsFromVertex(MBTGraph<MBTVertex, MBTEdge> g, MBTVertex vertex) {
		ArrayList<MBTPath> graphPaths = new ArrayList<MBTPath>();
		Set<MBTEdge> edges = g.outgoingEdgesOf(vertex);
		if (edges.isEmpty()) {
			graphPaths.add(new MBTPath());
			return graphPaths;
		} else {
			for (MBTEdge e : edges) {
				ArrayList<MBTPath> vertexPaths = getPathsFromVertex(g, g.getEdgeTarget(e));
				// if this edge target vertex is the end vertex in the graph then it'll have the
				// scenario info
				if (g.getEdgeTarget(e).getLabel().contentEquals(g.getEndVertex().getLabel())) {
					// TODO temp hack for now, when testing for scenario ordering and other RTE
					// stuff consider creating the interaction instead at this point?
					MBTPath path = vertexPaths.getLast();
					path.setLabel(e.getLabel());
					path.setTags(e.getTag());
					path.setDescription(e.getDescription());
				}
				ArrayList<MBTPath> edgePaths = getPathsFromEdge(e);
				combinePaths(g, e, vertex, graphPaths, vertexPaths, edgePaths);
			}
			return graphPaths;
		}
	}

	private static void combinePaths(MBTGraph<MBTVertex, MBTEdge> g, MBTEdge e, MBTVertex vertex,
			ArrayList<MBTPath> graphPaths, ArrayList<MBTPath> vertexPaths, ArrayList<MBTPath> edgePaths) {
		for (MBTPath vp : vertexPaths) {
			if (edgePaths.isEmpty()) {
				vp.getPath().add(0, g.getEdgeTarget(e));
				vp.getPath().add(0, e);
				if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
					vp.getPath().add(0, vertex);
				}
				graphPaths.add(vp);
			} else {
				for (int i = 0; i < edgePaths.size(); i++) {

					MBTPath pe = edgePaths.get(i);
					MBTPath expandedPath = new MBTPath();
					// TODO the use of i here is a temp measure. I forgot that multi-row Asciidoc
					// tables create as many test cases. If I want multiple rows of data for one
					// step, then I need to use merged cells but that's not ready yet. So for now to
					// keep the names unique, I'm just adding the index
					expandedPath.setLabel(vp.getLabel() + "." + i);
					expandedPath.setTags(vp.getTags());
					expandedPath.setDescription(vp.getDescription());
					expandedPath.getPath().addAll(0, vp.getPath());
					expandedPath.getPath().add(0, g.getEdgeTarget(e));
					expandedPath.getPath().addAll(0, pe.getPath());
					if (vertex.getLabel().contentEquals(g.getStartVertex().getLabel())) {
						expandedPath.getPath().add(0, vertex);
					}
					graphPaths.add(expandedPath);
				}
			}
		}
	}

	private static ArrayList<MBTPath> getPathsFromEdge(MBTEdge e) {
		if (e.getValue() != null) {
			if (e.getValue() instanceof MBTGraph<?, ?>) {
				MBTGraph<MBTVertex, MBTEdge> g = (MBTGraph<MBTVertex, MBTEdge>) e.getValue();
				return getPathsFromVertex(g, g.getStartVertex());
			}
		}
		return new ArrayList<MBTPath>();
	}

}
