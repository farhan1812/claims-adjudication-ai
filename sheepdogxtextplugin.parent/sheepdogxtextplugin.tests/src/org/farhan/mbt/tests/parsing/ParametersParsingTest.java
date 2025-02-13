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
public class ParametersParsingTest extends ParsingTest {

	@Test
	public void parseExamplesWithName() throws Exception {
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
	public void parseExamplesWithoutName() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters:\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertStepObjectErrors(sb);
	}

	@Test
	public void parseExamplesWithoutNameEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about");
		assertStepObjectErrors(sb);
	}

	@Test
	public void parseExamplesWithTags() throws Exception {
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
	public void parseExamplesWithDescription() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");
		sb.append("Basic EDI claim\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseExamplesWithMultilineDescription() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");
		sb.append("Basic EDI claim\n");
		sb.append("No deductible\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseExamplesWithoutDescriptionEOL() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Given: do step one\n");
		sb.append("=== Parameters: Describe what this data is about\n");
		sb.append("Basic EDI claim");
		assertStepObjectErrors(sb);
	}

	@Test
	public void parseExamplesWithRows() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");
		sb.append("Basic EDI claim\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|   data1 |   data2 \n");
		sb.append("|   data3 |   data4 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}

	@Test
	public void parseExamplesWithEverything() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("= Object: This is a test StepObject\n");
		sb.append("== Definition: Submit a claim\n");
		sb.append("=== Parameters: Describe what this data is about\n");
		sb.append("Basic EDI claim\n");
		sb.append("No deductible\n");

		sb.append("|===\n");
		sb.append("| Header1 | Header2 \n");
		sb.append("|   data1 |   data2 \n");
		sb.append("|   data3 |   data4 \n");
		sb.append("|===\n");
		assertNoStepObjectErrors(sb);
	}
}
