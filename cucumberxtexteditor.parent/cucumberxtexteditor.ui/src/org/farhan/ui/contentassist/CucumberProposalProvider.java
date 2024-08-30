/*
 * generated by Xtext 2.32.0
 */
package org.farhan.ui.contentassist;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.TreeSet;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.farhan.cucumber.And;
import org.farhan.cucumber.Asterisk;
import org.farhan.cucumber.But;
import org.farhan.cucumber.Given;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Then;
import org.farhan.cucumber.When;
import org.farhan.generator.CucumberOutputConfigurationProvider;
import org.farhan.helper.StepDefinitionHelperOld;
import org.farhan.helper.StepHelper;

/**
 * See
 * https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class CucumberProposalProvider extends AbstractCucumberProposalProvider {

	public void completeGiven_Name(Given step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeGiven_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeWhen_Name(When step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeWhen_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeThen_Name(Then step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeThen_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeAnd_Name(And step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeAnd_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeBut_Name(But step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeBut_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	public void completeAsterisk_Name(Asterisk step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeAsterisk_Name(step, assignment, context, acceptor);
		completeName(step, assignment, context, acceptor);
	}

	private static void logError(Exception e, String name) {
		// TODO inject the logger instead
		System.out.println("There was a problem listing directories for: " + name);
		StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		System.out.println(sw.toString());
	}

	private void completeName(Step step, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		String component;
		String object;
		if (step.getName() == null) {
			component = "";
			object = "";
		} else {
			component = StepHelper.getComponent(step.getName());
			object = StepHelper.getObject(step.getName());
		}
		if (object.isEmpty()) {
			// if there's no object do the following
			if (component.isEmpty()) {
				// get a list of previous objects
				TreeSet<String> previousObjects = StepDefinitionHelperOld.getPreviousObjects(step);
				for (String previousObject : previousObjects) {
					acceptor.accept(createCompletionProposal("The " + previousObject, context));
				}
				// get a list of applications
				for (IResource stepDefComponent : getComponents(step)) {
					acceptor.accept(createCompletionProposal("The " + stepDefComponent.getName() + ",", context));
				}
			} else {
				// get a list of objects
				for (IResource stepDefObjectResource : getComponentObjects(getProject(step).getFolder(
						CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory() + "/" + component))) {

					// ([^\/]+)\/([^\/]+)\/(.*).feature group 3
					String stepDefObject = stepDefObjectResource.getProjectRelativePath().toString()
							.split("/" + component + "/")[1].replace(".feature", "");
					acceptor.accept(createCompletionProposal("The " + component + ", " + stepDefObject, stepDefObject,
							null, context));
				}
			}
		} else {
			// else if there's an object get a list of keywords for the suggestions
			for (String stepDef : StepDefinitionHelperOld.getObjectDefinitions(step)) {
				// TODO maybe step defs shouldn't need the component and object parts, just the
				// section and predicate
				acceptor.accept(createCompletionProposal(stepDef, context));
			}
		}
	}

	private IProject getProject(Step step) {
		return ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(step.eResource().getURI().toPlatformString(true))).getProject();

	}

	// TODO change IResource to String
	// TODO move to StepDefGenerator
	private IResource[] getComponents(Step step) {
		try {
			IFolder folder = getProject(step)
					.getFolder(CucumberOutputConfigurationProvider.stepDefsOutput.getOutputDirectory());
			return folder.members();
		} catch (CoreException e) {
			logError(e, step.getName());
			return null;
		}
	}

	// TODO change IResource to String
	// TODO move to StepDefGenerator
	private ArrayList<IResource> getComponentObjects(IFolder folder) {
		ArrayList<IResource> files = new ArrayList<IResource>();
		try {
			for (IResource r : folder.members()) {
				if (r instanceof IFolder) {
					files.addAll(getComponentObjects((IFolder) r));
				} else {
					files.add(r);
				}
			}
		} catch (CoreException e) {
			logError(e, folder.getName());
		}
		return files;
	}
}
