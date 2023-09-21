/*
 * generated by Xtext 2.32.0
 */
package org.farhan.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class CucumberGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTagsParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFeatureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTitleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTitleSentenceParserRuleCall_2_0 = (RuleCall)cTitleAssignment_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cBackgroundAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cBackgroundBackgroundParserRuleCall_4_0 = (RuleCall)cBackgroundAssignment_4.eContents().get(0);
		private final Assignment cScenariosAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cScenariosScenarioParserRuleCall_5_0 = (RuleCall)cScenariosAssignment_5.eContents().get(0);
		
		//Feature:
		//    Tags
		//    'Feature:' title=Sentence
		//    description=Description
		//    background=Background?
		//    // this is a 0 or more list of Scenario
		//    (scenarios+=Scenario)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Tags
		//'Feature:' title=Sentence
		//description=Description
		//background=Background?
		//// this is a 0 or more list of Scenario
		//(scenarios+=Scenario)*
		public Group getGroup() { return cGroup; }
		
		//Tags
		public RuleCall getTagsParserRuleCall_0() { return cTagsParserRuleCall_0; }
		
		//'Feature:'
		public Keyword getFeatureKeyword_1() { return cFeatureKeyword_1; }
		
		//title=Sentence
		public Assignment getTitleAssignment_2() { return cTitleAssignment_2; }
		
		//Sentence
		public RuleCall getTitleSentenceParserRuleCall_2_0() { return cTitleSentenceParserRuleCall_2_0; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//background=Background?
		public Assignment getBackgroundAssignment_4() { return cBackgroundAssignment_4; }
		
		//Background
		public RuleCall getBackgroundBackgroundParserRuleCall_4_0() { return cBackgroundBackgroundParserRuleCall_4_0; }
		
		//// this is a 0 or more list of Scenario
		//(scenarios+=Scenario)*
		public Assignment getScenariosAssignment_5() { return cScenariosAssignment_5; }
		
		//Scenario
		public RuleCall getScenariosScenarioParserRuleCall_5_0() { return cScenariosScenarioParserRuleCall_5_0; }
	}
	public class BackgroundElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Background");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBackgroundKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTitleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTitleSentenceParserRuleCall_1_0 = (RuleCall)cTitleAssignment_1.eContents().get(0);
		private final Assignment cDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptionDescriptionParserRuleCall_2_0 = (RuleCall)cDescriptionAssignment_2.eContents().get(0);
		private final Assignment cStepsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStepsStepParserRuleCall_3_0 = (RuleCall)cStepsAssignment_3.eContents().get(0);
		
		//Background:
		//    'Background:' title=Sentence
		//    description=Description
		//    // this is a 0 or more list of Step
		//    (steps+=Step)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'Background:' title=Sentence
		//description=Description
		//// this is a 0 or more list of Step
		//(steps+=Step)*
		public Group getGroup() { return cGroup; }
		
		//'Background:'
		public Keyword getBackgroundKeyword_0() { return cBackgroundKeyword_0; }
		
		//title=Sentence
		public Assignment getTitleAssignment_1() { return cTitleAssignment_1; }
		
		//Sentence
		public RuleCall getTitleSentenceParserRuleCall_1_0() { return cTitleSentenceParserRuleCall_1_0; }
		
		//description=Description
		public Assignment getDescriptionAssignment_2() { return cDescriptionAssignment_2; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_2_0() { return cDescriptionDescriptionParserRuleCall_2_0; }
		
		//// this is a 0 or more list of Step
		//(steps+=Step)*
		public Assignment getStepsAssignment_3() { return cStepsAssignment_3; }
		
		//Step
		public RuleCall getStepsStepParserRuleCall_3_0() { return cStepsStepParserRuleCall_3_0; }
	}
	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTagsParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cScenarioKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTitleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTitleSentenceParserRuleCall_2_0 = (RuleCall)cTitleAssignment_2.eContents().get(0);
		private final Assignment cDescriptionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDescriptionDescriptionParserRuleCall_3_0 = (RuleCall)cDescriptionAssignment_3.eContents().get(0);
		private final Assignment cStepsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStepsStepParserRuleCall_4_0 = (RuleCall)cStepsAssignment_4.eContents().get(0);
		
		//Scenario:
		//    Tags
		//    'Scenario:' title=Sentence
		//    description=Description
		//    // this is a 0 or more list of Step
		//    (steps+=Step)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Tags
		//'Scenario:' title=Sentence
		//description=Description
		//// this is a 0 or more list of Step
		//(steps+=Step)*
		public Group getGroup() { return cGroup; }
		
		//Tags
		public RuleCall getTagsParserRuleCall_0() { return cTagsParserRuleCall_0; }
		
		//'Scenario:'
		public Keyword getScenarioKeyword_1() { return cScenarioKeyword_1; }
		
		//title=Sentence
		public Assignment getTitleAssignment_2() { return cTitleAssignment_2; }
		
		//Sentence
		public RuleCall getTitleSentenceParserRuleCall_2_0() { return cTitleSentenceParserRuleCall_2_0; }
		
		//description=Description
		public Assignment getDescriptionAssignment_3() { return cDescriptionAssignment_3; }
		
		//Description
		public RuleCall getDescriptionDescriptionParserRuleCall_3_0() { return cDescriptionDescriptionParserRuleCall_3_0; }
		
		//// this is a 0 or more list of Step
		//(steps+=Step)*
		public Assignment getStepsAssignment_4() { return cStepsAssignment_4; }
		
		//Step
		public RuleCall getStepsStepParserRuleCall_4_0() { return cStepsStepParserRuleCall_4_0; }
	}
	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Step");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cKeywordAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cKeywordAlternatives_0_0 = (Alternatives)cKeywordAssignment_0.eContents().get(0);
		private final Keyword cKeywordGivenKeyword_0_0_0 = (Keyword)cKeywordAlternatives_0_0.eContents().get(0);
		private final Keyword cKeywordWhenKeyword_0_0_1 = (Keyword)cKeywordAlternatives_0_0.eContents().get(1);
		private final Keyword cKeywordThenKeyword_0_0_2 = (Keyword)cKeywordAlternatives_0_0.eContents().get(2);
		private final Keyword cKeywordAndKeyword_0_0_3 = (Keyword)cKeywordAlternatives_0_0.eContents().get(3);
		private final Keyword cKeywordButKeyword_0_0_4 = (Keyword)cKeywordAlternatives_0_0.eContents().get(4);
		private final Keyword cKeywordAsteriskKeyword_0_0_5 = (Keyword)cKeywordAlternatives_0_0.eContents().get(5);
		private final Assignment cTitleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTitleSentenceParserRuleCall_1_0 = (RuleCall)cTitleAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cTableAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cTableTableParserRuleCall_2_0_0 = (RuleCall)cTableAssignment_2_0.eContents().get(0);
		private final Assignment cTextAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cTextDocStringParserRuleCall_2_1_0 = (RuleCall)cTextAssignment_2_1.eContents().get(0);
		
		//Step:
		//    keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*') title=Sentence
		//    (table=Table | text=DocString)?;
		@Override public ParserRule getRule() { return rule; }
		
		//keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*') title=Sentence
		//(table=Table | text=DocString)?
		public Group getGroup() { return cGroup; }
		
		//keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*')
		public Assignment getKeywordAssignment_0() { return cKeywordAssignment_0; }
		
		//('Given' | 'When' | 'Then' | 'And' | 'But' | '*')
		public Alternatives getKeywordAlternatives_0_0() { return cKeywordAlternatives_0_0; }
		
		//'Given'
		public Keyword getKeywordGivenKeyword_0_0_0() { return cKeywordGivenKeyword_0_0_0; }
		
		//'When'
		public Keyword getKeywordWhenKeyword_0_0_1() { return cKeywordWhenKeyword_0_0_1; }
		
		//'Then'
		public Keyword getKeywordThenKeyword_0_0_2() { return cKeywordThenKeyword_0_0_2; }
		
		//'And'
		public Keyword getKeywordAndKeyword_0_0_3() { return cKeywordAndKeyword_0_0_3; }
		
		//'But'
		public Keyword getKeywordButKeyword_0_0_4() { return cKeywordButKeyword_0_0_4; }
		
		//'*'
		public Keyword getKeywordAsteriskKeyword_0_0_5() { return cKeywordAsteriskKeyword_0_0_5; }
		
		//title=Sentence
		public Assignment getTitleAssignment_1() { return cTitleAssignment_1; }
		
		//Sentence
		public RuleCall getTitleSentenceParserRuleCall_1_0() { return cTitleSentenceParserRuleCall_1_0; }
		
		//(table=Table | text=DocString)?
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//table=Table
		public Assignment getTableAssignment_2_0() { return cTableAssignment_2_0; }
		
		//Table
		public RuleCall getTableTableParserRuleCall_2_0_0() { return cTableTableParserRuleCall_2_0_0; }
		
		//text=DocString
		public Assignment getTextAssignment_2_1() { return cTextAssignment_2_1; }
		
		//DocString
		public RuleCall getTextDocStringParserRuleCall_2_1_0() { return cTextDocStringParserRuleCall_2_1_0; }
	}
	public class TableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Table");
		private final Assignment cRowsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRowsTableRowParserRuleCall_0 = (RuleCall)cRowsAssignment.eContents().get(0);
		
		//Table:
		//    rows+=TableRow+;
		@Override public ParserRule getRule() { return rule; }
		
		//rows+=TableRow+
		public Assignment getRowsAssignment() { return cRowsAssignment; }
		
		//TableRow
		public RuleCall getRowsTableRowParserRuleCall_0() { return cRowsTableRowParserRuleCall_0; }
	}
	public class TableRowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.TableRow");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCellsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCellsRowCellParserRuleCall_0_0 = (RuleCall)cCellsAssignment_0.eContents().get(0);
		private final Keyword cVerticalLineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cEOLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//TableRow:
		//    cells+=RowCell+ '|' EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//cells+=RowCell+ '|' EOL
		public Group getGroup() { return cGroup; }
		
		//cells+=RowCell+
		public Assignment getCellsAssignment_0() { return cCellsAssignment_0; }
		
		//RowCell
		public RuleCall getCellsRowCellParserRuleCall_0_0() { return cCellsRowCellParserRuleCall_0_0; }
		
		//'|'
		public Keyword getVerticalLineKeyword_1() { return cVerticalLineKeyword_1; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_2() { return cEOLTerminalRuleCall_2; }
	}
	public class RowCellElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.RowCell");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCellAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cCellVerticalLineKeyword_0_0 = (Keyword)cCellAssignment_0.eContents().get(0);
		private final RuleCall cSentenceParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//RowCell:
		//    cell='|' Sentence;
		@Override public ParserRule getRule() { return rule; }
		
		//cell='|' Sentence
		public Group getGroup() { return cGroup; }
		
		//cell='|'
		public Assignment getCellAssignment_0() { return cCellAssignment_0; }
		
		//'|'
		public Keyword getCellVerticalLineKeyword_0_0() { return cCellVerticalLineKeyword_0_0; }
		
		//Sentence
		public RuleCall getSentenceParserRuleCall_1() { return cSentenceParserRuleCall_1; }
	}
	public class DocStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.DocString");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDocStringAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cQuotationMarkQuotationMarkQuotationMarkKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cSentenceParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cQuotationMarkQuotationMarkQuotationMarkKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cEOLTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//DocString:
		//    {DocString}
		//    ('"""' Sentence* '"""')
		//    EOL;
		@Override public ParserRule getRule() { return rule; }
		
		//{DocString}
		//('"""' Sentence* '"""')
		//EOL
		public Group getGroup() { return cGroup; }
		
		//{DocString}
		public Action getDocStringAction_0() { return cDocStringAction_0; }
		
		//('"""' Sentence* '"""')
		public Group getGroup_1() { return cGroup_1; }
		
		//'"""'
		public Keyword getQuotationMarkQuotationMarkQuotationMarkKeyword_1_0() { return cQuotationMarkQuotationMarkQuotationMarkKeyword_1_0; }
		
		//Sentence*
		public RuleCall getSentenceParserRuleCall_1_1() { return cSentenceParserRuleCall_1_1; }
		
		//'"""'
		public Keyword getQuotationMarkQuotationMarkQuotationMarkKeyword_1_2() { return cQuotationMarkQuotationMarkQuotationMarkKeyword_1_2; }
		
		//EOL
		public RuleCall getEOLTerminalRuleCall_2() { return cEOLTerminalRuleCall_2; }
	}
	public class DescriptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Description");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDescriptionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cSentencesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSentencesSentenceParserRuleCall_1_0 = (RuleCall)cSentencesAssignment_1.eContents().get(0);
		
		//// make this optional
		//Description:
		//    {Description} (sentences+=Sentence)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{Description} (sentences+=Sentence)*
		public Group getGroup() { return cGroup; }
		
		//{Description}
		public Action getDescriptionAction_0() { return cDescriptionAction_0; }
		
		//(sentences+=Sentence)*
		public Assignment getSentencesAssignment_1() { return cSentencesAssignment_1; }
		
		//Sentence
		public RuleCall getSentencesSentenceParserRuleCall_1_0() { return cSentencesSentenceParserRuleCall_1_0; }
	}
	public class TagsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Tags");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTAGTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Tags:
		//    TAG* EOL?;
		@Override public ParserRule getRule() { return rule; }
		
		//TAG* EOL?
		public Group getGroup() { return cGroup; }
		
		//TAG*
		public RuleCall getTAGTerminalRuleCall_0() { return cTAGTerminalRuleCall_0; }
		
		//EOL?
		public RuleCall getEOLTerminalRuleCall_1() { return cEOLTerminalRuleCall_1; }
	}
	public class SentenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.Sentence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEOLTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Sentence:
		//    WORD+ EOL?;
		@Override public ParserRule getRule() { return rule; }
		
		//WORD+ EOL?
		public Group getGroup() { return cGroup; }
		
		//WORD+
		public RuleCall getWORDTerminalRuleCall_0() { return cWORDTerminalRuleCall_0; }
		
		//EOL?
		public RuleCall getEOLTerminalRuleCall_1() { return cEOLTerminalRuleCall_1; }
	}
	
	
	private final FeatureElements pFeature;
	private final BackgroundElements pBackground;
	private final ScenarioElements pScenario;
	private final StepElements pStep;
	private final TableElements pTable;
	private final TableRowElements pTableRow;
	private final RowCellElements pRowCell;
	private final DocStringElements pDocString;
	private final DescriptionElements pDescription;
	private final TagsElements pTags;
	private final SentenceElements pSentence;
	private final TerminalRule tWS;
	private final TerminalRule tEOL;
	private final TerminalRule tCOMMENT;
	private final TerminalRule tWORD;
	private final TerminalRule tTAG;
	
	private final Grammar grammar;

	@Inject
	public CucumberGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pFeature = new FeatureElements();
		this.pBackground = new BackgroundElements();
		this.pScenario = new ScenarioElements();
		this.pStep = new StepElements();
		this.pTable = new TableElements();
		this.pTableRow = new TableRowElements();
		this.pRowCell = new RowCellElements();
		this.pDocString = new DocStringElements();
		this.pDescription = new DescriptionElements();
		this.pTags = new TagsElements();
		this.pSentence = new SentenceElements();
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.WS");
		this.tEOL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.EOL");
		this.tCOMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.COMMENT");
		this.tWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.WORD");
		this.tTAG = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.farhan.Cucumber.TAG");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.farhan.Cucumber".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Feature:
	//    Tags
	//    'Feature:' title=Sentence
	//    description=Description
	//    background=Background?
	//    // this is a 0 or more list of Scenario
	//    (scenarios+=Scenario)*;
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//Background:
	//    'Background:' title=Sentence
	//    description=Description
	//    // this is a 0 or more list of Step
	//    (steps+=Step)*;
	public BackgroundElements getBackgroundAccess() {
		return pBackground;
	}
	
	public ParserRule getBackgroundRule() {
		return getBackgroundAccess().getRule();
	}
	
	//Scenario:
	//    Tags
	//    'Scenario:' title=Sentence
	//    description=Description
	//    // this is a 0 or more list of Step
	//    (steps+=Step)*;
	public ScenarioElements getScenarioAccess() {
		return pScenario;
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}
	
	//Step:
	//    keyword=('Given' | 'When' | 'Then' | 'And' | 'But' | '*') title=Sentence
	//    (table=Table | text=DocString)?;
	public StepElements getStepAccess() {
		return pStep;
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}
	
	//Table:
	//    rows+=TableRow+;
	public TableElements getTableAccess() {
		return pTable;
	}
	
	public ParserRule getTableRule() {
		return getTableAccess().getRule();
	}
	
	//TableRow:
	//    cells+=RowCell+ '|' EOL;
	public TableRowElements getTableRowAccess() {
		return pTableRow;
	}
	
	public ParserRule getTableRowRule() {
		return getTableRowAccess().getRule();
	}
	
	//RowCell:
	//    cell='|' Sentence;
	public RowCellElements getRowCellAccess() {
		return pRowCell;
	}
	
	public ParserRule getRowCellRule() {
		return getRowCellAccess().getRule();
	}
	
	//DocString:
	//    {DocString}
	//    ('"""' Sentence* '"""')
	//    EOL;
	public DocStringElements getDocStringAccess() {
		return pDocString;
	}
	
	public ParserRule getDocStringRule() {
		return getDocStringAccess().getRule();
	}
	
	//// make this optional
	//Description:
	//    {Description} (sentences+=Sentence)*;
	public DescriptionElements getDescriptionAccess() {
		return pDescription;
	}
	
	public ParserRule getDescriptionRule() {
		return getDescriptionAccess().getRule();
	}
	
	//Tags:
	//    TAG* EOL?;
	public TagsElements getTagsAccess() {
		return pTags;
	}
	
	public ParserRule getTagsRule() {
		return getTagsAccess().getRule();
	}
	
	//Sentence:
	//    WORD+ EOL?;
	public SentenceElements getSentenceAccess() {
		return pSentence;
	}
	
	public ParserRule getSentenceRule() {
		return getSentenceAccess().getRule();
	}
	
	//terminal WS:
	//    (' ' | '\t')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal EOL:
	//    ('\r' | '\n')+;
	public TerminalRule getEOLRule() {
		return tEOL;
	}
	
	//// single line comment
	//terminal COMMENT:
	//    '#' !('\r' | '\n')* EOL;
	public TerminalRule getCOMMENTRule() {
		return tCOMMENT;
	}
	
	//// .. needs the ecore import
	//// need to add punctuation and commas etc
	//// this covers Given When Then and might create problems?
	//terminal WORD:
	//    ('a'..'z' | 'A'..'Z' | '0'..'9' | "'")+;
	public TerminalRule getWORDRule() {
		return tWORD;
	}
	
	//terminal TAG:
	//    '@' WORD;
	public TerminalRule getTAGRule() {
		return tTAG;
	}
}
