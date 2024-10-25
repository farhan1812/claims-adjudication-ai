package org.farhan.objects.mbttransformer.impl;

import java.util.HashMap;

import org.farhan.common.RestService;
import org.farhan.objects.mbttransformer.ProcessAsciidocFile;

public class ProcessAsciidocFileImpl extends RestService implements ProcessAsciidocFile {

	@Override
	public void assertContent(HashMap<String, String> keyMap) {
		addParameter("fileName", keyValue.get("path").replaceFirst("src/test/", ""));
		assertContent("getFileContents", keyMap.get("Content"));
	}

	@Override
	public void setContent(HashMap<String, String> keyMap) {
		addParameter("fileName", keyValue.get("path").replaceFirst("src/test/", ""));
		setContent("addFile", keyMap.get("Content"));
	}
}
