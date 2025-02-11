/*
 * generated by Xtext 2.37.0
 */
package org.farhan.mbt.serializer;

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
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.sheepDog.AbstractScenarioTags;
import org.farhan.mbt.sheepDog.And;
import org.farhan.mbt.sheepDog.Background;
import org.farhan.mbt.sheepDog.Cell;
import org.farhan.mbt.sheepDog.DocString;
import org.farhan.mbt.sheepDog.Examples;
import org.farhan.mbt.sheepDog.Feature;
import org.farhan.mbt.sheepDog.FeatureTags;
import org.farhan.mbt.sheepDog.Given;
import org.farhan.mbt.sheepDog.Row;
import org.farhan.mbt.sheepDog.Scenario;
import org.farhan.mbt.sheepDog.SheepDogPackage;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.StepDefinition;
import org.farhan.mbt.sheepDog.StepObject;
import org.farhan.mbt.sheepDog.StepParameters;
import org.farhan.mbt.sheepDog.Table;
import org.farhan.mbt.sheepDog.Then;
import org.farhan.mbt.sheepDog.When;

@SuppressWarnings("all")
public class SheepDogSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SheepDogGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SheepDogPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SheepDogPackage.ABSTRACT_SCENARIO_TAGS:
				sequence_AbstractScenarioTags(context, (AbstractScenarioTags) semanticObject); 
				return; 
			case SheepDogPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case SheepDogPackage.BACKGROUND:
				sequence_Background(context, (Background) semanticObject); 
				return; 
			case SheepDogPackage.CELL:
				sequence_Cell(context, (Cell) semanticObject); 
				return; 
			case SheepDogPackage.DOC_STRING:
				sequence_DocString(context, (DocString) semanticObject); 
				return; 
			case SheepDogPackage.EXAMPLES:
				sequence_Examples(context, (Examples) semanticObject); 
				return; 
			case SheepDogPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case SheepDogPackage.FEATURE_TAGS:
				sequence_FeatureTags(context, (FeatureTags) semanticObject); 
				return; 
			case SheepDogPackage.GIVEN:
				sequence_Given(context, (Given) semanticObject); 
				return; 
			case SheepDogPackage.ROW:
				sequence_Row(context, (Row) semanticObject); 
				return; 
			case SheepDogPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case SheepDogPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case SheepDogPackage.STEP_DEFINITION:
				sequence_StepDefinition(context, (StepDefinition) semanticObject); 
				return; 
			case SheepDogPackage.STEP_OBJECT:
				sequence_StepObject(context, (StepObject) semanticObject); 
				return; 
			case SheepDogPackage.STEP_PARAMETERS:
				sequence_StepParameters(context, (StepParameters) semanticObject); 
				return; 
			case SheepDogPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			case SheepDogPackage.THEN:
				sequence_Then(context, (Then) semanticObject); 
				return; 
			case SheepDogPackage.WHEN:
				sequence_When(context, (When) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractScenarioTags returns AbstractScenarioTags
	 *
	 * Constraint:
	 *     name=TAGWORD
	 * </pre>
	 */
	protected void sequence_AbstractScenarioTags(ISerializationContext context, AbstractScenarioTags semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SheepDogPackage.Literals.ABSTRACT_SCENARIO_TAGS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SheepDogPackage.Literals.ABSTRACT_SCENARIO_TAGS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAbstractScenarioTagsAccess().getNameTAGWORDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns And
	 *     And returns And
	 *
	 * Constraint:
	 *     (name=Title (theStepTable=Table | theDocString=DocString)?)
	 * </pre>
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractScenario returns Background
	 *     Background returns Background
	 *
	 * Constraint:
	 *     (tags=AbstractScenarioTags? name=Title statements+=Statement* steps+=Step*)
	 * </pre>
	 */
	protected void sequence_Background(ISerializationContext context, Background semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Cell returns Cell
	 *
	 * Constraint:
	 *     name=Title
	 * </pre>
	 */
	protected void sequence_Cell(ISerializationContext context, Cell semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SheepDogPackage.Literals.CELL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SheepDogPackage.Literals.CELL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCellAccess().getNameTitleParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DocString returns DocString
	 *
	 * Constraint:
	 *     name=RAWTEXT
	 * </pre>
	 */
	protected void sequence_DocString(ISerializationContext context, DocString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SheepDogPackage.Literals.DOC_STRING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SheepDogPackage.Literals.DOC_STRING__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDocStringAccess().getNameRAWTEXTTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Examples returns Examples
	 *
	 * Constraint:
	 *     (tags=AbstractScenarioTags? name=Title statements+=Statement* theExamplesTable=Table)
	 * </pre>
	 */
	protected void sequence_Examples(ISerializationContext context, Examples semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     FeatureTags returns FeatureTags
	 *
	 * Constraint:
	 *     name=TAGWORD
	 * </pre>
	 */
	protected void sequence_FeatureTags(ISerializationContext context, FeatureTags semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SheepDogPackage.Literals.FEATURE_TAGS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SheepDogPackage.Literals.FEATURE_TAGS__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFeatureTagsAccess().getNameTAGWORDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Feature
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (tags=FeatureTags? name=Title statements+=Statement* abstractScenarios+=AbstractScenario*)
	 * </pre>
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Given
	 *     Given returns Given
	 *
	 * Constraint:
	 *     (name=Title (theStepTable=Table | theDocString=DocString)?)
	 * </pre>
	 */
	protected void sequence_Given(ISerializationContext context, Given semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Row returns Row
	 *
	 * Constraint:
	 *     cells+=Cell+
	 * </pre>
	 */
	protected void sequence_Row(ISerializationContext context, Row semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     AbstractScenario returns Scenario
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (tags=AbstractScenarioTags? name=Title statements+=Statement* steps+=Step* examples+=Examples*)
	 * </pre>
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     name=Title
	 * </pre>
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SheepDogPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SheepDogPackage.Literals.STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStatementAccess().getNameTitleParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StepDefinition returns StepDefinition
	 *
	 * Constraint:
	 *     (name=Title statements+=Statement* stepParameters+=StepParameters*)
	 * </pre>
	 */
	protected void sequence_StepDefinition(ISerializationContext context, StepDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns StepObject
	 *     StepObject returns StepObject
	 *
	 * Constraint:
	 *     (name=Title statements+=Statement* stepDefinitions+=StepDefinition*)
	 * </pre>
	 */
	protected void sequence_StepObject(ISerializationContext context, StepObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StepParameters returns StepParameters
	 *
	 * Constraint:
	 *     (name=Title statements+=Statement* parametersTable=Table)
	 * </pre>
	 */
	protected void sequence_StepParameters(ISerializationContext context, StepParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     rows+=Row+
	 * </pre>
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns Then
	 *     Then returns Then
	 *
	 * Constraint:
	 *     (name=Title (theStepTable=Table | theDocString=DocString)?)
	 * </pre>
	 */
	protected void sequence_Then(ISerializationContext context, Then semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Step returns When
	 *     When returns When
	 *
	 * Constraint:
	 *     (name=Title (theStepTable=Table | theDocString=DocString)?)
	 * </pre>
	 */
	protected void sequence_When(ISerializationContext context, When semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
