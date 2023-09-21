/*
 * generated by Xtext 2.32.0
 */
grammar InternalCucumber;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.farhan.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.farhan.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.farhan.services.CucumberGrammarAccess;

}

@parser::members {

 	private CucumberGrammarAccess grammarAccess;

    public InternalCucumberParser(TokenStream input, CucumberGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Feature";
   	}

   	@Override
   	protected CucumberGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

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
					newCompositeNode(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0());
				}
				lv_tags_0_0=ruleTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"tags",
						lv_tags_0_0,
						"org.farhan.Cucumber.Tag");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_1());
		}
		otherlv_2='Feature:'
		{
			newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getFeatureKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_3_0());
				}
				lv_title_3_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"org.farhan.Cucumber.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_5_0());
				}
				lv_scenarios_5_0=ruleScenario
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFeatureRule());
					}
					add(
						$current,
						"scenarios",
						lv_scenarios_5_0,
						"org.farhan.Cucumber.Scenario");
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
					newCompositeNode(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0());
				}
				lv_tags_0_0=ruleTag
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"tags",
						lv_tags_0_0,
						"org.farhan.Cucumber.Tag");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		this_EOL_1=RULE_EOL
		{
			newLeafNode(this_EOL_1, grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_1());
		}
		otherlv_2='Scenario:'
		{
			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getScenarioKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_3_0());
				}
				lv_title_3_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"title",
						lv_title_3_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0());
				}
				lv_description_4_0=ruleDescription
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"org.farhan.Cucumber.Description");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0());
				}
				lv_steps_5_0=ruleStep
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScenarioRule());
					}
					add(
						$current,
						"steps",
						lv_steps_5_0,
						"org.farhan.Cucumber.Step");
					afterParserOrEnumRuleCall();
				}
			)
		)*
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
		(
			(
				(
					lv_keyword_0_1='Given'
					{
						newLeafNode(lv_keyword_0_1, grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
						setWithLastConsumed($current, "keyword", lv_keyword_0_1, null);
					}
					    |
					lv_keyword_0_2='When'
					{
						newLeafNode(lv_keyword_0_2, grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
						setWithLastConsumed($current, "keyword", lv_keyword_0_2, null);
					}
					    |
					lv_keyword_0_3='Then'
					{
						newLeafNode(lv_keyword_0_3, grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
						setWithLastConsumed($current, "keyword", lv_keyword_0_3, null);
					}
					    |
					lv_keyword_0_4='And'
					{
						newLeafNode(lv_keyword_0_4, grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
						setWithLastConsumed($current, "keyword", lv_keyword_0_4, null);
					}
					    |
					lv_keyword_0_5='But'
					{
						newLeafNode(lv_keyword_0_5, grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
						setWithLastConsumed($current, "keyword", lv_keyword_0_5, null);
					}
					    |
					lv_keyword_0_6='*'
					{
						newLeafNode(lv_keyword_0_6, grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStepRule());
						}
						setWithLastConsumed($current, "keyword", lv_keyword_0_6, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0());
				}
				lv_title_1_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStepRule());
					}
					set(
						$current,
						"title",
						lv_title_1_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescription
entryRuleDescription returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescriptionRule()); }
	iv_ruleDescription=ruleDescription
	{ $current=$iv_ruleDescription.current; }
	EOF;

// Rule Description
ruleDescription returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDescriptionAccess().getDescriptionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0());
				}
				lv_sentences_1_0=ruleSentence
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDescriptionRule());
					}
					add(
						$current,
						"sentences",
						lv_sentences_1_0,
						"org.farhan.Cucumber.Sentence");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTag
entryRuleTag returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTagRule()); }
	iv_ruleTag=ruleTag
	{ $current=$iv_ruleTag.current; }
	EOF;

// Rule Tag
ruleTag returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_title_0_0='@'
				{
					newLeafNode(lv_title_0_0, grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTagRule());
					}
					setWithLastConsumed($current, "title", lv_title_0_0, "@");
				}
			)
		)
		this_ID_1=RULE_ID
		{
			newLeafNode(this_ID_1, grammarAccess.getTagAccess().getIDTerminalRuleCall_1());
		}
		(
			this_WS_2=RULE_WS
			{
				newLeafNode(this_WS_2, grammarAccess.getTagAccess().getWSTerminalRuleCall_2());
			}
		)?
	)
;

// Entry rule entryRuleSentence
entryRuleSentence returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSentenceRule()); }
	iv_ruleSentence=ruleSentence
	{ $current=$iv_ruleSentence.current.getText(); }
	EOF;

// Rule Sentence
ruleSentence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
				newLeafNode(this_WORD_0, grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0());
			}
		)+
		this_EOL_1=RULE_EOL
		{
			$current.merge(this_EOL_1);
		}
		{
			newLeafNode(this_EOL_1, grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1());
		}
	)
;

RULE_WS : (' '|'\t')+;

RULE_EOL : ('\r\n'|'\n')+;

RULE_ID : ('a'..'z'|'A'..'Z'|'0'..'9')+;

RULE_WORD : RULE_WS RULE_ID;
