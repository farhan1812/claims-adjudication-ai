package org.farhan.conv.core;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Message;

public abstract class OtherLayerLinker extends LayerLinker {

	@Override
	protected void addNextLayerInteractionMessages(Interaction targetInteraction, Message m) {
		// TODO reference 4th layer and call set attribute value or assert attribute
		// value such as Inquiry.setElementValue(String xpath, String value)
		// It's at this point that getNextLayerClassQualifiedName would be used
	}

	@Override
	protected String getNextLayerClassQualifiedName(Interaction targetInteraction) {

		Class interactionOwner = (Class) targetInteraction.getOwner();
		return interactionOwner.getQualifiedName()
				.replace(Project.secondLayerPackageName, Project.thirdLayerPackageName).replace("Steps", "");
	}

}
