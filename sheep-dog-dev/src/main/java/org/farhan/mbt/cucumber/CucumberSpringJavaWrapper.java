package org.farhan.mbt.cucumber;

import org.farhan.helper.StepHelper;

import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ConstructorDeclaration;

public class CucumberSpringJavaWrapper extends CucumberJavaWrapper {

	public CucumberSpringJavaWrapper(String thePath) {
		super(thePath);
		if (!isStepObj()) {
			getType().addExtendedType("TestSteps");
			theJavaClass.addImport("org.farhan.common.TestSteps");
			// TODO create a test for constructor creation
			ConstructorDeclaration constructor = getType().addConstructor(Modifier.Keyword.PUBLIC);
			String[] pathParts = thePath.split("/");
			constructor.addAndGetParameter(pathParts[pathParts.length - 1].replace("Steps.java", ""), "object");
			constructor.createBody().addStatement("super(object);");
		}
	}

	protected String getFactoryImport(String step) {
		String name = StepHelper.getComponentName(step);
		if (name.isEmpty()) {
			name = lastComponent;
		} else {
			lastComponent = name;
		}
		name = removeSpecialChars(name).toLowerCase();
		return "org.farhan.objects." + name + "." + getInterfaceName(step);
	}

	protected String getCallForFactory(String step) {
		return "object";
	}

}
