package org.farhan.mbt.maven;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.farhan.mbt.convert.ConvertAsciidoctorToUML;

/**
 * Converts Ascii Doctor files to Graph model paths
 *
 */
@Mojo(name = "asciidoctor-to-uml", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class AsciiDoctorToUMLMojo extends MBTMojo {

	public void execute() throws MojoExecutionException {
		super.execute(new ConvertAsciidoctorToUML());
	}
}