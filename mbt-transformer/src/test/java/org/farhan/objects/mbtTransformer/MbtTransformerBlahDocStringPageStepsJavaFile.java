package org.farhan.objects.mbtTransformer;

import java.util.HashMap;

import org.farhan.common.MbtTransformer;

public class MbtTransformerBlahDocStringPageStepsJavaFile extends MbtTransformer {
	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

}
