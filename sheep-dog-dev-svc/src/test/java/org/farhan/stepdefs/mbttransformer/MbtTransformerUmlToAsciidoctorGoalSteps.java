package org.farhan.stepdefs.mbttransformer;

import org.farhan.common.TestSteps;
import org.farhan.objects.mbttransformer.UmlToAsciidoctorGoal;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

public class MbtTransformerUmlToAsciidoctorGoalSteps extends TestSteps {

	public MbtTransformerUmlToAsciidoctorGoalSteps(UmlToAsciidoctorGoal object) {
		super(object);
	}

	@Given("^The mbt-transformer plugin, uml-to-asciidoctor goal is executed$")
	public void theMbtTransformerPluginUmlToAsciidoctorGoalIsExecuted() {
		object.setComponent("mbt-transformer");
		object.setPath("uml-to-asciidoctor");
		object.transition();
	}

	@Given("^The mbt-transformer plugin, uml-to-asciidoctor goal is executed with$")
	public void theMbtTransformerPluginUmlToAsciidoctorGoalIsExecutedWith(DataTable dataTable) {
		object.setComponent("mbt-transformer");
		object.setPath("uml-to-asciidoctor");
		object.setInputOutputs(dataTable);
		object.transition();
	}
}
