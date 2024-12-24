/*
 * generated by Xtext 2.36.0
 */
grammar InternalSheepDog;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.farhan.mbt.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.farhan.mbt.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.farhan.mbt.services.SheepDogGrammarAccess;

}

@parser::members {

 	private SheepDogGrammarAccess grammarAccess;

    public InternalSheepDogParser(TokenStream input, SheepDogGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SheepDogGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getModelAccess().getStepObjectParserRuleCall_0());
		}
		this_StepObject_0=ruleStepObject
		{
			$current = $this_StepObject_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getModelAccess().getFeatureParserRuleCall_1());
		}
		this_Feature_1=ruleFeature
		{
			$current = $this_Feature_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStepObject
entryRuleStepObject returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepObjectRule()); }
	iv_ruleStepObject=ruleStepObject
	{ $current=$iv_ruleStepObject.current; }
	EOF;

// Rule StepObject
ruleStepObject returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='='
		{
			newLeafNode(otherlv_0, grammarAccess.getStepObjectAccess().getEqualsSignKeyword_0());
		}
		otherlv_1='Object:'
		{
			newLeafNode(otherlv_1, grammarAccess.getStepObjectAccess().getObjectKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStepObjectAccess().getNameTitleParserRuleCall_2_0());
				}
				lv_name_2_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepObjectRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepObjectRule());
					}
					add(
						$current,
						"statements",
						lv_statements_4_0,
						"org.farhan.mbt.SheepDog.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_5_0());
				}
				lv_stepDefinitions_5_0=ruleStepDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepObjectRule());
					}
					add(
						$current,
						"stepDefinitions",
						lv_stepDefinitions_5_0,
						"org.farhan.mbt.SheepDog.StepDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleStepDefinition
entryRuleStepDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepDefinitionRule()); }
	iv_ruleStepDefinition=ruleStepDefinition
	{ $current=$iv_ruleStepDefinition.current; }
	EOF;

// Rule StepDefinition
ruleStepDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='=='
		{
			newLeafNode(otherlv_0, grammarAccess.getStepDefinitionAccess().getEqualsSignEqualsSignKeyword_0());
		}
		otherlv_1='Definition:'
		{
			newLeafNode(otherlv_1, grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStepDefinitionAccess().getNameTitleParserRuleCall_2_0());
				}
				lv_name_2_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
					}
					add(
						$current,
						"statements",
						lv_statements_4_0,
						"org.farhan.mbt.SheepDog.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_5_0());
				}
				lv_stepParameters_5_0=ruleStepParameters
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepDefinitionRule());
					}
					add(
						$current,
						"stepParameters",
						lv_stepParameters_5_0,
						"org.farhan.mbt.SheepDog.StepParameters");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleStepParameters
entryRuleStepParameters returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepParametersRule()); }
	iv_ruleStepParameters=ruleStepParameters
	{ $current=$iv_ruleStepParameters.current; }
	EOF;

// Rule StepParameters
ruleStepParameters returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='==='
		{
			newLeafNode(otherlv_0, grammarAccess.getStepParametersAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
		}
		otherlv_1='Parameters:'
		{
			newLeafNode(otherlv_1, grammarAccess.getStepParametersAccess().getParametersKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStepParametersAccess().getNameTitleParserRuleCall_2_0());
				}
				lv_name_2_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepParametersRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_4_0());
				}
				lv_statements_4_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepParametersRule());
					}
					add(
						$current,
						"statements",
						lv_statements_4_0,
						"org.farhan.mbt.SheepDog.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getStepParametersAccess().getParametersTableTableParserRuleCall_5_0());
				}
				lv_parametersTable_5_0=ruleTable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepParametersRule());
					}
					set(
						$current,
						"parametersTable",
						lv_parametersTable_5_0,
						"org.farhan.mbt.SheepDog.Table");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getTagsFeatureTagsParserRuleCall_0_0());
				}
				lv_tags_0_0=ruleFeatureTags
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"tags",
						lv_tags_0_0,
						"org.farhan.mbt.SheepDog.FeatureTags");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getEqualsSignKeyword_1());
		}
		otherlv_2='Feature:'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getNameTitleParserRuleCall_3_0());
				}
				lv_name_3_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_5_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.farhan.mbt.SheepDog.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_6_0());
				}
				lv_abstractScenarios_6_0=ruleAbstractScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"abstractScenarios",
						lv_abstractScenarios_6_0,
						"org.farhan.mbt.SheepDog.AbstractScenario");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAbstractScenario
entryRuleAbstractScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractScenarioRule()); }
	iv_ruleAbstractScenario=ruleAbstractScenario
	{ $current=$iv_ruleAbstractScenario.current; }
	EOF;

// Rule AbstractScenario
ruleAbstractScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0());
		}
		this_Background_0=ruleBackground
		{
			$current = $this_Background_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1());
		}
		this_Scenario_1=ruleScenario
		{
			$current = $this_Scenario_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBackground
entryRuleBackground returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBackgroundRule()); }
	iv_ruleBackground=ruleBackground
	{ $current=$iv_ruleBackground.current; }
	EOF;

// Rule Background
ruleBackground returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
				}
				lv_tags_0_0=ruleAbstractScenarioTags
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					set(
						$current,
						"tags",
						lv_tags_0_0,
						"org.farhan.mbt.SheepDog.AbstractScenarioTags");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='=='
		{
			newLeafNode(otherlv_1, grammarAccess.getBackgroundAccess().getEqualsSignEqualsSignKeyword_1());
		}
		otherlv_2='Background:'
		{
			newLeafNode(otherlv_2, grammarAccess.getBackgroundAccess().getBackgroundKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getNameTitleParserRuleCall_3_0());
				}
				lv_name_3_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_5_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.farhan.mbt.SheepDog.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_6_0());
				}
				lv_steps_6_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBackgroundRule());
					}
					add(
						$current,
						"steps",
						lv_steps_6_0,
						"org.farhan.mbt.SheepDog.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleScenario
entryRuleScenario returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScenarioRule()); }
	iv_ruleScenario=ruleScenario
	{ $current=$iv_ruleScenario.current; }
	EOF;

// Rule Scenario
ruleScenario returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
				}
				lv_tags_0_0=ruleAbstractScenarioTags
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"tags",
						lv_tags_0_0,
						"org.farhan.mbt.SheepDog.AbstractScenarioTags");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='=='
		{
			newLeafNode(otherlv_1, grammarAccess.getScenarioAccess().getEqualsSignEqualsSignKeyword_1());
		}
		otherlv_2='Scenario:'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getNameTitleParserRuleCall_3_0());
				}
				lv_name_3_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_5_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.farhan.mbt.SheepDog.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_6_0());
				}
				lv_steps_6_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"steps",
						lv_steps_6_0,
						"org.farhan.mbt.SheepDog.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getExamplesExamplesParserRuleCall_7_0());
				}
				lv_examples_7_0=ruleExamples
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"examples",
						lv_examples_7_0,
						"org.farhan.mbt.SheepDog.Examples");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExamples
entryRuleExamples returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExamplesRule()); }
	iv_ruleExamples=ruleExamples
	{ $current=$iv_ruleExamples.current; }
	EOF;

// Rule Examples
ruleExamples returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getExamplesAccess().getTagsAbstractScenarioTagsParserRuleCall_0_0());
				}
				lv_tags_0_0=ruleAbstractScenarioTags
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExamplesRule());
					}
					set(
						$current,
						"tags",
						lv_tags_0_0,
						"org.farhan.mbt.SheepDog.AbstractScenarioTags");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_1='==='
		{
			newLeafNode(otherlv_1, grammarAccess.getExamplesAccess().getEqualsSignEqualsSignEqualsSignKeyword_1());
		}
		otherlv_2='Examples:'
		{
			newLeafNode(otherlv_2, grammarAccess.getExamplesAccess().getExamplesKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExamplesAccess().getNameTitleParserRuleCall_3_0());
				}
				lv_name_3_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExamplesRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_5_0());
				}
				lv_statements_5_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExamplesRule());
					}
					add(
						$current,
						"statements",
						lv_statements_5_0,
						"org.farhan.mbt.SheepDog.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getExamplesAccess().getTheExamplesTableTableParserRuleCall_6_0());
				}
				lv_theExamplesTable_6_0=ruleTable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExamplesRule());
					}
					set(
						$current,
						"theExamplesTable",
						lv_theExamplesTable_6_0,
						"org.farhan.mbt.SheepDog.Table");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStep
entryRuleStep returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStepRule()); }
	iv_ruleStep=ruleStep
	{ $current=$iv_ruleStep.current; }
	EOF;

// Rule Step
ruleStep returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStepAccess().getGivenParserRuleCall_0());
		}
		this_Given_0=ruleGiven
		{
			$current = $this_Given_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getWhenParserRuleCall_1());
		}
		this_When_1=ruleWhen
		{
			$current = $this_When_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getThenParserRuleCall_2());
		}
		this_Then_2=ruleThen
		{
			$current = $this_Then_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStepAccess().getAndParserRuleCall_3());
		}
		this_And_3=ruleAnd
		{
			$current = $this_And_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGiven
entryRuleGiven returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGivenRule()); }
	iv_ruleGiven=ruleGiven
	{ $current=$iv_ruleGiven.current; }
	EOF;

// Rule Given
ruleGiven returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='==='
		{
			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
		}
		otherlv_1='Given'
		{
			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGivenAccess().getNameTitleParserRuleCall_2_0());
				}
				lv_name_2_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGivenRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getGivenAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGivenAccess().getTheStepTableTableParserRuleCall_4_0_0());
					}
					lv_theStepTable_4_0=ruleTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGivenRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_4_0,
							"org.farhan.mbt.SheepDog.Table");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
					}
					lv_theDocString_5_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGivenRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_5_0,
							"org.farhan.mbt.SheepDog.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleWhen
entryRuleWhen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWhenRule()); }
	iv_ruleWhen=ruleWhen
	{ $current=$iv_ruleWhen.current; }
	EOF;

// Rule When
ruleWhen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='==='
		{
			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
		}
		otherlv_1='When'
		{
			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWhenAccess().getNameTitleParserRuleCall_2_0());
				}
				lv_name_2_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWhenRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getWhenAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getWhenAccess().getTheStepTableTableParserRuleCall_4_0_0());
					}
					lv_theStepTable_4_0=ruleTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhenRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_4_0,
							"org.farhan.mbt.SheepDog.Table");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
					}
					lv_theDocString_5_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getWhenRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_5_0,
							"org.farhan.mbt.SheepDog.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleThen
entryRuleThen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThenRule()); }
	iv_ruleThen=ruleThen
	{ $current=$iv_ruleThen.current; }
	EOF;

// Rule Then
ruleThen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='==='
		{
			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
		}
		otherlv_1='Then'
		{
			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getThenAccess().getNameTitleParserRuleCall_2_0());
				}
				lv_name_2_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThenRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getThenAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getThenAccess().getTheStepTableTableParserRuleCall_4_0_0());
					}
					lv_theStepTable_4_0=ruleTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThenRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_4_0,
							"org.farhan.mbt.SheepDog.Table");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
					}
					lv_theDocString_5_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThenRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_5_0,
							"org.farhan.mbt.SheepDog.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	iv_ruleAnd=ruleAnd
	{ $current=$iv_ruleAnd.current; }
	EOF;

// Rule And
ruleAnd returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='==='
		{
			newLeafNode(otherlv_0, grammarAccess.getAndAccess().getEqualsSignEqualsSignEqualsSignKeyword_0());
		}
		otherlv_1='And'
		{
			newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAndAccess().getNameTitleParserRuleCall_2_0());
				}
				lv_name_2_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAndRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getAndAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getTheStepTableTableParserRuleCall_4_0_0());
					}
					lv_theStepTable_4_0=ruleTable
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						set(
							$current,
							"theStepTable",
							lv_theStepTable_4_0,
							"org.farhan.mbt.SheepDog.Table");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_4_1_0());
					}
					lv_theDocString_5_0=ruleDocString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndRule());
						}
						set(
							$current,
							"theDocString",
							lv_theDocString_5_0,
							"org.farhan.mbt.SheepDog.DocString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDocString
entryRuleDocString returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDocStringRule()); }
	iv_ruleDocString=ruleDocString
	{ $current=$iv_ruleDocString.current; }
	EOF;

// Rule DocString
ruleDocString returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='----'
		{
			newLeafNode(otherlv_0, grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_0());
		}
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0());
				}
				lv_lines_2_0=ruleLine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDocStringRule());
					}
					add(
						$current,
						"lines",
						lv_lines_2_0,
						"org.farhan.mbt.SheepDog.Line");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3='----'
		{
			newLeafNode(otherlv_3, grammarAccess.getDocStringAccess().getHyphenMinusHyphenMinusHyphenMinusHyphenMinusKeyword_3());
		}
		this_EOL_4=RULE_EOL
		{
			newLeafNode(this_EOL_4, grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[options="header"]'
		{
			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getOptionsHeaderKeyword_0());
		}
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getTableAccess().getEOLTerminalRuleCall_1());
		}
		otherlv_2='|==='
		{
			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_2());
		}
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getTableAccess().getEOLTerminalRuleCall_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTableAccess().getRowsRowParserRuleCall_4_0());
				}
				lv_rows_4_0=ruleRow
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTableRule());
					}
					add(
						$current,
						"rows",
						lv_rows_4_0,
						"org.farhan.mbt.SheepDog.Row");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_5='|==='
		{
			newLeafNode(otherlv_5, grammarAccess.getTableAccess().getVerticalLineEqualsSignEqualsSignEqualsSignKeyword_5());
		}
		this_EOL_6=RULE_EOL
		{
			newLeafNode(this_EOL_6, grammarAccess.getTableAccess().getEOLTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleRow
entryRuleRow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRowRule()); }
	iv_ruleRow=ruleRow
	{ $current=$iv_ruleRow.current; }
	EOF;

// Rule Row
ruleRow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0());
				}
				lv_cells_0_0=ruleCell
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRowRule());
					}
					add(
						$current,
						"cells",
						lv_cells_0_0,
						"org.farhan.mbt.SheepDog.Cell");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getRowAccess().getEOLTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleFeatureTags
entryRuleFeatureTags returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureTagsRule()); }
	iv_ruleFeatureTags=ruleFeatureTags
	{ $current=$iv_ruleFeatureTags.current; }
	EOF;

// Rule FeatureTags
ruleFeatureTags returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':tags:'
		{
			newLeafNode(otherlv_0, grammarAccess.getFeatureTagsAccess().getTagsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_WORD
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFeatureTagsAccess().getNameWORDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFeatureTagsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.farhan.mbt.SheepDog.WORD");
				}
			)
		)
		this_EOL_2=RULE_EOL
		{
			newLeafNode(this_EOL_2, grammarAccess.getFeatureTagsAccess().getEOLTerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleAbstractScenarioTags
entryRuleAbstractScenarioTags returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractScenarioTagsRule()); }
	iv_ruleAbstractScenarioTags=ruleAbstractScenarioTags
	{ $current=$iv_ruleAbstractScenarioTags.current; }
	EOF;

// Rule AbstractScenarioTags
ruleAbstractScenarioTags returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='[tags="'
		{
			newLeafNode(otherlv_0, grammarAccess.getAbstractScenarioTagsAccess().getTagsKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_WORD
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAbstractScenarioTagsAccess().getNameWORDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractScenarioTagsRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.farhan.mbt.SheepDog.WORD");
				}
			)
		)
		otherlv_2='"]'
		{
			newLeafNode(otherlv_2, grammarAccess.getAbstractScenarioTagsAccess().getQuotationMarkRightSquareBracketKeyword_2());
		}
		this_EOL_3=RULE_EOL
		{
			newLeafNode(this_EOL_3, grammarAccess.getAbstractScenarioTagsAccess().getEOLTerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleCell
entryRuleCell returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCellRule()); }
	iv_ruleCell=ruleCell
	{ $current=$iv_ruleCell.current; }
	EOF;

// Rule Cell
ruleCell returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='|'
		{
			newLeafNode(otherlv_0, grammarAccess.getCellAccess().getVerticalLineKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCellAccess().getNameTitleParserRuleCall_1_0());
				}
				lv_name_1_0=ruleTitle
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCellRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.farhan.mbt.SheepDog.Title");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTitle
entryRuleTitle returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTitleRule()); }
	iv_ruleTitle=ruleTitle
	{ $current=$iv_ruleTitle.current.getText(); }
	EOF;

// Rule Title
ruleTitle returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_WORD_0=RULE_WORD
		{
			$current.merge(this_WORD_0);
		}
		{
			newLeafNode(this_WORD_0, grammarAccess.getTitleAccess().getWORDTerminalRuleCall());
		}
	)+
;

// Entry rule entryRuleStatement
entryRuleStatement returns [String current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current.getText(); }
	EOF;

// Rule Statement
ruleStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_WORD_0=RULE_WORD
			{
				$current.merge(this_WORD_0);
			}
			{
				newLeafNode(this_WORD_0, grammarAccess.getStatementAccess().getWORDTerminalRuleCall_0());
			}
		)*
		this_EOL_1=RULE_EOL
		{
			$current.merge(this_EOL_1);
		}
		{
			newLeafNode(this_EOL_1, grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleLine
entryRuleLine returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLineRule()); }
	iv_ruleLine=ruleLine
	{ $current=$iv_ruleLine.current.getText(); }
	EOF;

// Rule Line
ruleLine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			this_WORD_0=RULE_WORD
			{
				$current.merge(this_WORD_0);
			}
			{
				newLeafNode(this_WORD_0, grammarAccess.getLineAccess().getWORDTerminalRuleCall_0());
			}
		)*
		this_EOL_1=RULE_EOL
		{
			$current.merge(this_EOL_1);
		}
		{
			newLeafNode(this_EOL_1, grammarAccess.getLineAccess().getEOLTerminalRuleCall_1());
		}
	)
;

RULE_TAGWORD : ~((' '|'\t'|'\r'|'\n'|'#'|'"'))+;

RULE_WORD : ~((' '|'\t'|'\r'|'\n'|'#'|'"'))+;

RULE_WS : (' '|'\t'|'\r')+;

RULE_SL_COMMENT : '#' ~('\n')* RULE_EOL;

RULE_EOL : '\n'+;
