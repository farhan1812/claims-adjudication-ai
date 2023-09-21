/*
 * generated by Xtext 2.32.0
 */
package org.farhan.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.farhan.cucumber.Background;
import org.farhan.cucumber.CucumberPackage;
import org.farhan.cucumber.Description;
import org.farhan.cucumber.DocString;
import org.farhan.cucumber.Feature;
import org.farhan.cucumber.RowCell;
import org.farhan.cucumber.Scenario;
import org.farhan.cucumber.Step;
import org.farhan.cucumber.Table;
import org.farhan.cucumber.TableRow;
import org.farhan.services.CucumberGrammarAccess;

@SuppressWarnings("all")
public class CucumberSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CucumberGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CucumberPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CucumberPackage.BACKGROUND:
				sequence_Background(context, (Background) semanticObject); 
				return; 
			case CucumberPackage.DESCRIPTION:
				sequence_Description(context, (Description) semanticObject); 
				return; 
			case CucumberPackage.DOC_STRING:
				sequence_DocString(context, (DocString) semanticObject); 
				return; 
			case CucumberPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case CucumberPackage.ROW_CELL:
				sequence_RowCell(context, (RowCell) semanticObject); 
				return; 
			case CucumberPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case CucumberPackage.STEP:
				sequence_Step(context, (Step) semanticObject); 
				return; 
			case CucumberPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			case CucumberPackage.TABLE_ROW:
				sequence_TableRow(context, (TableRow) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Background returns Background
	 *
	 * Constraint:
	 *     (title=Sentence description=Description steps+=Step*)
	 * </pre>
	 */
	protected void sequence_Background(ISerializationContext context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Description returns Description
	 *
	 * Constraint:
	 *     sentences+=Sentence*
	 * </pre>
	 */
	protected void sequence_Description(ISerializationContext context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DocString returns DocString
	 *
	 * Constraint:
	 *     {DocString}
	 * </pre>
	 */
	protected void sequence_DocString(ISerializationContext context, DocString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (title=Sentence description=Description background=Background? scenarios+=Scenario*)
	 * </pre>
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RowCell returns RowCell
	 *
	 * Constraint:
	 *     cell='|'
	 * </pre>
	 */
	protected void sequence_RowCell(ISerializationContext context, RowCell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CucumberPackage.Literals.ROW_CELL__CELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CucumberPackage.Literals.ROW_CELL__CELL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRowCellAccess().getCellVerticalLineKeyword_0_0(), semanticObject.getCell());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (title=Sentence description=Description steps+=Step*)
	 * </pre>
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Step
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             keyword='Given' | 
	 *             keyword='When' | 
	 *             keyword='Then' | 
	 *             keyword='And' | 
	 *             keyword='But' | 
	 *             keyword='*'
	 *         ) 
	 *         title=Sentence 
	 *         (table=Table | text=DocString)?
	 *     )
	 * </pre>
	 */
	protected void sequence_Step(ISerializationContext context, Step semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     TableRow returns TableRow
	 *
	 * Constraint:
	 *     cells+=RowCell+
	 * </pre>
	 */
	protected void sequence_TableRow(ISerializationContext context, TableRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     rows+=TableRow+
	 * </pre>
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
