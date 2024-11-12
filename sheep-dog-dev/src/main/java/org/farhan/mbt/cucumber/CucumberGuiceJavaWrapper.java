package org.farhan.mbt.cucumber;

import java.io.File;

import org.farhan.helper.StepHelper;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ConstructorDeclaration;

public class CucumberGuiceJavaWrapper extends CucumberJavaWrapper {

	public CucumberGuiceJavaWrapper(File theFile) {
		super(theFile);
		if (!isStepObj()) {
			getType().addExtendedType("TestSteps");
			theJavaClass.addImport("org.farhan.common.TestSteps");
			theJavaClass.addImport("io.cucumber.guice.ScenarioScoped");
			getType().addMarkerAnnotation("ScenarioScoped");

			ConstructorDeclaration constructor = getType().addConstructor(Modifier.Keyword.PUBLIC);
			constructor.addAndGetParameter(theFile.getName().replace("Steps.java", ""), "object");
			constructor.createBody().addStatement("super(object);");
			theJavaClass.addImport("com.google.inject.Inject");
			constructor.addMarkerAnnotation("Inject");
		}
	}

	protected String getFactoryImport(String step) {
		String name = StepHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			lastComponent = name;
		}
		return "org.farhan.objects." + lastComponent + "." + getInterfaceName(step);
	}

	protected String getCallForFactory(String step) {
		return "object";
	}

}
