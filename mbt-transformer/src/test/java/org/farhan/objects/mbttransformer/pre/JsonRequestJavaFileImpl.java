package org.farhan.objects.mbttransformer.pre;

import java.util.HashMap;

import org.farhan.common.JavaFileObject;
import org.farhan.objects.mbttransformer.JsonRequestJavaFile;

public class JsonRequestJavaFileImpl extends JavaFileObject implements JsonRequestJavaFile {

	public void assertContent(HashMap<String, String> keyMap) {
		assertContent(keyMap.get("Content"));
	}

	@Override
	public void assertFieldsSectionMethodName(HashMap<String, String> keyMap) {
		assertMethodExists(keyMap.get("Method Name"));
	}

	@Override
	public void assertFieldsSectionParameterName(HashMap<String, String> keyMap) {
		assertMethodParameterExists(keyMap.get("Method Name"), keyMap.get("Parameter Name"));
	}

	@Override
	public void assertFieldsSectionParameterType(HashMap<String, String> keyMap) {
		assertMethodParameterTypeIs(keyMap.get("Method Name"), keyMap.get("Parameter Name"),
				keyMap.get("Parameter Type"));
	}

	@Override
	public void assertFieldsSectionReturnType(HashMap<String, String> keyMap) {
		assertMethodReturnTypeIs(keyMap.get("Method Name"), keyMap.get("Return Type"));
	}

	@Override
	public void assertFieldsSectionVisibility(HashMap<String, String> keyMap) {
		assertMethodVisibilityIs(keyMap.get("Method Name"), keyMap.get("Visibility"));
	}

	@Override
	public void assertObjectSectionImport(HashMap<String, String> keyMap) {
		assertImportExists(keyMap.get("Import"));
	}

	@Override
	public void assertObjectSectionInterfaceName(HashMap<String, String> keyMap) {
		assertInterfaceNameIs(keyMap.get("Interface Name"));
	}

	@Override
	public void assertObjectSectionPackage(HashMap<String, String> keyMap) {
		assertPackageIs(keyMap.get("Package"));
	}

	@Override
	public void assertPresent(HashMap<String, String> keyMap) {
		assertObjectExists();
	}

	public void setContent(HashMap<String, String> keyMap) {
		setContent(keyMap.get("Content"));
	}
}
