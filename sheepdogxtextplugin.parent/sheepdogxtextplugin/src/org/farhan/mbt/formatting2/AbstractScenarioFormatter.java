package org.farhan.mbt.formatting2;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractParserRuleElementFinder;
import org.farhan.mbt.services.SheepDogGrammarAccess;
import org.farhan.mbt.sheepDog.AbstractScenario;
import org.farhan.mbt.sheepDog.And;
import org.farhan.mbt.sheepDog.Given;
import org.farhan.mbt.sheepDog.Statement;
import org.farhan.mbt.sheepDog.Step;
import org.farhan.mbt.sheepDog.Then;
import org.farhan.mbt.sheepDog.When;

public abstract class AbstractScenarioFormatter extends Formatter {
	protected AbstractScenario theAbstractScenario;

	public AbstractScenarioFormatter(AbstractScenario theAbstractScenario) {
		this.theAbstractScenario = theAbstractScenario;
	}

	protected StepFormatter newStepFormatter(Step theStep) {
		if (theStep instanceof Given) {
			return new GivenFormatter((Given) theStep);
		} else if (theStep instanceof When) {
			return new WhenFormatter((When) theStep);
		} else if (theStep instanceof Then) {
			return new ThenFormatter((Then) theStep);
		} else {
			return new AndFormatter((And) theStep);
		}
	}

	protected abstract AbstractParserRuleElementFinder getAccess(SheepDogGrammarAccess ga);

	protected abstract void formatExamples(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df);

	protected abstract Keyword getEqualsKeyword(AbstractParserRuleElementFinder a);

	protected abstract Keyword getKeyword(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getEOLRuleCall(AbstractParserRuleElementFinder a);

	protected abstract RuleCall getTitleRuleCall(AbstractParserRuleElementFinder a);

	public void format(IFormattableDocument doc, SheepDogGrammarAccess ga, SheepDogFormatter df) {
		AbstractParserRuleElementFinder a = getAccess(ga);
		if (theAbstractScenario.getTags() != null) {
			AbstractScenarioTagsFormatter formatter = new AbstractScenarioTagsFormatter(theAbstractScenario.getTags());
			formatter.format(doc, ga, df);
		}

		formatKeywordTrailingSpace(df.getRegion(theAbstractScenario, getEqualsKeyword(a)), doc);
		formatKeywordTrailingSpace(df.getRegion(theAbstractScenario, getKeyword(a)), doc);
		formatTitleNoSpace(df.getRegion(theAbstractScenario, getTitleRuleCall(a)), doc);
		formatEOL2RuleCall(df.getRegion(theAbstractScenario, getEOLRuleCall(a)), doc);
		for (Statement s : theAbstractScenario.getStatements()) {
			StatementFormatter formatter = new StatementFormatter(s);
			formatter.isLast(isLastElement(s, theAbstractScenario.getStatements()));
			formatter.format(doc, ga, df);
		}
		for (Step s : theAbstractScenario.getSteps()) {
			StepFormatter formatter = newStepFormatter(s);
			formatter.isLast(isLastElement(s, theAbstractScenario.getSteps()));
			// formatter.isLastEOLDouble(s.getTheStepTable() == null && s.getTheDocString() == null);
			formatter.format(doc, ga, df);
		}
		formatExamples(doc, ga, df);
	}
}
