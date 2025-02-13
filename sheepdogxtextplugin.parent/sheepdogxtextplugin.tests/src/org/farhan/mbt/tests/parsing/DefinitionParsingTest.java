/*
 * generated by Xtext 2.32.0
 */
package org.farhan.mbt.tests.parsing;

import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.farhan.mbt.tests.SheepDogInjectorProvider;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(SheepDogInjectorProvider.class)
public class DefinitionParsingTest extends ParsingTest {

	@Test
	public void parseScenarioOutlineWithName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");
		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithoutName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition:");
		assertStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithoutNameEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim");
		assertStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithTags() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithDescription() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("Basic EDI claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithMultilineDescription() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("Basic EDI claim\n");
		sb.append("No deductible\n");
		sb.append("=== Parameters: Describe what this data is about\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithoutDescriptionEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("Basic EDI claim");
		assertStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithSteps() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseScenarioOutlineWithEverything() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("Basic EDI claim\n");
		sb.append("No deductible\n");
		sb.append("=== Parameters: Describe what this data is about\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}
}
