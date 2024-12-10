package org.farhan.mbt.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.springframework.stereotype.Component;

/**
 * Converts tagged Cucumber scenarios to a UML model using Eclipse Xtext and EMF
 *
 */
@Mojo(name = "uml-to-cucumber", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
@Component
public class UMLToCucumberMojo extends MBTMojo {

	public void execute() throws MojoExecutionException {
		super.execute("ConvertUMLToCucumber");
	}
}