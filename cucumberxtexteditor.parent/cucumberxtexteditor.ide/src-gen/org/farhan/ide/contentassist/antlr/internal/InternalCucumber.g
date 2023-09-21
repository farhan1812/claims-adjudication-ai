/*
 * generated by Xtext 2.32.0
 */
grammar InternalCucumber;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.farhan.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.farhan.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.farhan.services.CucumberGrammarAccess;

}
@parser::members {
	private CucumberGrammarAccess grammarAccess;

	public void setGrammarAccess(CucumberGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleFeature
entryRuleFeature
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFeatureAccess().getGroup()); }
		(rule__Feature__Group__0)
		{ after(grammarAccess.getFeatureAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBackground
entryRuleBackground
:
{ before(grammarAccess.getBackgroundRule()); }
	 ruleBackground
{ after(grammarAccess.getBackgroundRule()); } 
	 EOF 
;

// Rule Background
ruleBackground 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBackgroundAccess().getGroup()); }
		(rule__Background__Group__0)
		{ after(grammarAccess.getBackgroundAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleScenario
entryRuleScenario
:
{ before(grammarAccess.getScenarioRule()); }
	 ruleScenario
{ after(grammarAccess.getScenarioRule()); } 
	 EOF 
;

// Rule Scenario
ruleScenario 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScenarioAccess().getGroup()); }
		(rule__Scenario__Group__0)
		{ after(grammarAccess.getScenarioAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStep
entryRuleStep
:
{ before(grammarAccess.getStepRule()); }
	 ruleStep
{ after(grammarAccess.getStepRule()); } 
	 EOF 
;

// Rule Step
ruleStep 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStepAccess().getGroup()); }
		(rule__Step__Group__0)
		{ after(grammarAccess.getStepAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescription
entryRuleDescription
:
{ before(grammarAccess.getDescriptionRule()); }
	 ruleDescription
{ after(grammarAccess.getDescriptionRule()); } 
	 EOF 
;

// Rule Description
ruleDescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescriptionAccess().getGroup()); }
		(rule__Description__Group__0)
		{ after(grammarAccess.getDescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTag
entryRuleTag
:
{ before(grammarAccess.getTagRule()); }
	 ruleTag
{ after(grammarAccess.getTagRule()); } 
	 EOF 
;

// Rule Tag
ruleTag 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTagAccess().getGroup()); }
		(rule__Tag__Group__0)
		{ after(grammarAccess.getTagAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSentence
entryRuleSentence
:
{ before(grammarAccess.getSentenceRule()); }
	 ruleSentence
{ after(grammarAccess.getSentenceRule()); } 
	 EOF 
;

// Rule Sentence
ruleSentence 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSentenceAccess().getGroup()); }
		(rule__Sentence__Group__0)
		{ after(grammarAccess.getSentenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__KeywordAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); }
		'Given'
		{ after(grammarAccess.getStepAccess().getKeywordGivenKeyword_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); }
		'When'
		{ after(grammarAccess.getStepAccess().getKeywordWhenKeyword_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); }
		'Then'
		{ after(grammarAccess.getStepAccess().getKeywordThenKeyword_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); }
		'And'
		{ after(grammarAccess.getStepAccess().getKeywordAndKeyword_0_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); }
		'But'
		{ after(grammarAccess.getStepAccess().getKeywordButKeyword_0_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); }
		'*'
		{ after(grammarAccess.getStepAccess().getKeywordAsteriskKeyword_0_0_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__0__Impl
	rule__Feature__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTagsAssignment_0()); }
	(rule__Feature__TagsAssignment_0)*
	{ after(grammarAccess.getFeatureAccess().getTagsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__1__Impl
	rule__Feature__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_1()); }
	RULE_EOL
	{ after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__2__Impl
	rule__Feature__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getFeatureKeyword_2()); }
	'Feature:'
	{ after(grammarAccess.getFeatureAccess().getFeatureKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__3__Impl
	rule__Feature__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getTitleAssignment_3()); }
	(rule__Feature__TitleAssignment_3)
	{ after(grammarAccess.getFeatureAccess().getTitleAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__4__Impl
	rule__Feature__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getDescriptionAssignment_4()); }
	(rule__Feature__DescriptionAssignment_4)
	{ after(grammarAccess.getFeatureAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__5__Impl
	rule__Feature__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); }
	(rule__Feature__BackgroundAssignment_5)?
	{ after(grammarAccess.getFeatureAccess().getBackgroundAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Feature__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); }
	(rule__Feature__ScenariosAssignment_6)*
	{ after(grammarAccess.getFeatureAccess().getScenariosAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Background__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Background__Group__0__Impl
	rule__Background__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); }
	'Background:'
	{ after(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Background__Group__1__Impl
	rule__Background__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); }
	(rule__Background__TitleAssignment_1)
	{ after(grammarAccess.getBackgroundAccess().getTitleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Background__Group__2__Impl
	rule__Background__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBackgroundAccess().getDescriptionAssignment_2()); }
	(rule__Background__DescriptionAssignment_2)
	{ after(grammarAccess.getBackgroundAccess().getDescriptionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Background__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBackgroundAccess().getStepsAssignment_3()); }
	(rule__Background__StepsAssignment_3)*
	{ after(grammarAccess.getBackgroundAccess().getStepsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__0__Impl
	rule__Scenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getTagsAssignment_0()); }
	(rule__Scenario__TagsAssignment_0)*
	{ after(grammarAccess.getScenarioAccess().getTagsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__1__Impl
	rule__Scenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_1()); }
	RULE_EOL
	{ after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__2__Impl
	rule__Scenario__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getScenarioKeyword_2()); }
	'Scenario:'
	{ after(grammarAccess.getScenarioAccess().getScenarioKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__3__Impl
	rule__Scenario__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getTitleAssignment_3()); }
	(rule__Scenario__TitleAssignment_3)
	{ after(grammarAccess.getScenarioAccess().getTitleAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__4__Impl
	rule__Scenario__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getDescriptionAssignment_4()); }
	(rule__Scenario__DescriptionAssignment_4)
	{ after(grammarAccess.getScenarioAccess().getDescriptionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Scenario__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); }
	(rule__Scenario__StepsAssignment_5)*
	{ after(grammarAccess.getScenarioAccess().getStepsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Step__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__0__Impl
	rule__Step__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getKeywordAssignment_0()); }
	(rule__Step__KeywordAssignment_0)
	{ after(grammarAccess.getStepAccess().getKeywordAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Step__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStepAccess().getTitleAssignment_1()); }
	(rule__Step__TitleAssignment_1)
	{ after(grammarAccess.getStepAccess().getTitleAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Description__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Description__Group__0__Impl
	rule__Description__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); }
	()
	{ after(grammarAccess.getDescriptionAccess().getDescriptionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Description__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); }
	(rule__Description__SentencesAssignment_1)*
	{ after(grammarAccess.getDescriptionAccess().getSentencesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Tag__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tag__Group__0__Impl
	rule__Tag__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTagAccess().getTitleAssignment_0()); }
	(rule__Tag__TitleAssignment_0)
	{ after(grammarAccess.getTagAccess().getTitleAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tag__Group__1__Impl
	rule__Tag__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTagAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getTagAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tag__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTagAccess().getWSTerminalRuleCall_2()); }
	(RULE_WS)?
	{ after(grammarAccess.getTagAccess().getWSTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Sentence__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sentence__Group__0__Impl
	rule__Sentence__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Sentence__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); }
		(RULE_WORD)
		{ after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); }
	)
	(
		{ before(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); }
		(RULE_WORD)*
		{ after(grammarAccess.getSentenceAccess().getWORDTerminalRuleCall_0()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Sentence__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Sentence__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Sentence__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); }
	RULE_EOL
	{ after(grammarAccess.getSentenceAccess().getEOLTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__TagsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); }
		ruleTag
		{ after(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__TitleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_3_0()); }
		ruleSentence
		{ after(grammarAccess.getFeatureAccess().getTitleSentenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0()); }
		ruleDescription
		{ after(grammarAccess.getFeatureAccess().getDescriptionDescriptionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__BackgroundAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); }
		ruleBackground
		{ after(grammarAccess.getFeatureAccess().getBackgroundBackgroundParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ScenariosAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0()); }
		ruleScenario
		{ after(grammarAccess.getFeatureAccess().getScenariosScenarioParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__TitleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0()); }
		ruleSentence
		{ after(grammarAccess.getBackgroundAccess().getTitleSentenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__DescriptionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0()); }
		ruleDescription
		{ after(grammarAccess.getBackgroundAccess().getDescriptionDescriptionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Background__StepsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0()); }
		ruleStep
		{ after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__TagsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); }
		ruleTag
		{ after(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__TitleAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_3_0()); }
		ruleSentence
		{ after(grammarAccess.getScenarioAccess().getTitleSentenceParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__DescriptionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0()); }
		ruleDescription
		{ after(grammarAccess.getScenarioAccess().getDescriptionDescriptionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__StepsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); }
		ruleStep
		{ after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__KeywordAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); }
		(rule__Step__KeywordAlternatives_0_0)
		{ after(grammarAccess.getStepAccess().getKeywordAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Step__TitleAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0()); }
		ruleSentence
		{ after(grammarAccess.getStepAccess().getTitleSentenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Description__SentencesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); }
		ruleSentence
		{ after(grammarAccess.getDescriptionAccess().getSentencesSentenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tag__TitleAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); }
		(
			{ before(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); }
			'@'
			{ after(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); }
		)
		{ after(grammarAccess.getTagAccess().getTitleCommercialAtKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_WS : (' '|'\t')+;

RULE_EOL : ('\r\n'|'\n')+;

RULE_ID : ('a'..'z'|'A'..'Z'|'0'..'9'|'\'')+;

RULE_WORD : RULE_WS RULE_ID;
