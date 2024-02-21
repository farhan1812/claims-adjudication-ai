package org.farhan.objects.mbtTransformer.impl;

import org.farhan.common.GoalObject;
import org.farhan.objects.mbtTransformer.GraphToUmlGoal;

public class GraphToUmlGoalImpl extends GoalObject implements GraphToUmlGoal {

	public void transition() {
		runGoal("org.farhan.mbt.graphuml.ConvertGraphToUML");
	}
}
