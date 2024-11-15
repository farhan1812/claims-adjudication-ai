package org.farhan.mbt.convert;

import org.farhan.mbt.core.FileAccessor;
import org.farhan.mbt.cucumber.CucumberGuiceProject;
import org.farhan.mbt.uml.UMLProject;

public class ConvertUMLToCucumberGuice extends ConvertUMLToCucumber {

	public ConvertUMLToCucumberGuice(String tags, FileAccessor fa) {
		super(tags, fa);
	}

	@Override
	public void initProjects() throws Exception {
		srcPrj = new UMLProject(this.tags, this.fa);
		tgtPrj = new CucumberGuiceProject(this.tags, this.fa);
	}
}
