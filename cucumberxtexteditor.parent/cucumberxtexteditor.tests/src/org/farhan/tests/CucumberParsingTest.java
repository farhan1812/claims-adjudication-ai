/*
 * generated by Xtext 2.32.0
 */
package org.farhan.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.farhan.cucumber.Feature;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(CucumberInjectorProvider.class)
public class CucumberParsingTest {
	@Inject
	private ParseHelper<Feature> parseHelper;
	
	@Test
	public void loadModel() throws Exception {
	}
}
