package org.xtext.example.mydsl.formatting2;

import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.xtext.example.mydsl.myDsl.Row;
import org.xtext.example.mydsl.myDsl.StepTable;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class StepTableFormatter extends Formatter {

	protected boolean isLast;
	protected boolean isFirst;
	protected boolean isLastEOLDouble = true;

	private StepTable theStepTable;

	public StepTableFormatter(StepTable theStepTable) {
		this.theStepTable = theStepTable;
	}

	public void format(IFormattableDocument doc, MyDslGrammarAccess ga, MyDslFormatter df) {
		for (Row r : theStepTable.getRows()) {
			RowFormatter formatter = new RowFormatter(r);
			formatter.isLast(isLastElement(r, theStepTable.getRows()));
			formatter.isFirst(isFirstElement(r, theStepTable.getRows()));
			formatter.isLastEOLDouble(StepFormatter.isLast);
			formatter.setIndent(10);
			formatter.format(doc, ga, df);
		}
	}

}
