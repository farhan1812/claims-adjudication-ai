package org.farhan.common;

import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.cucumber.CucumberJavaWrapper;
import org.farhan.mbt.cucumber.CucumberProject;
import org.junit.jupiter.api.Assertions;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.stmt.Statement;

public class JavaFileObject extends FileObject {

	private CucumberProject project;
	private CucumberJavaWrapper wrapper;

	protected void assertImportExists(String importName) {
		CompilationUnit cu = (CompilationUnit) wrapper.get();
		ImportDeclaration importDeclaration = null;
		for (ImportDeclaration id : cu.getImports()) {
			id.getNameAsString();
			if (id.getNameAsString().contentEquals(importName)) {
				importDeclaration = id;
				break;
			}
		}
		Assertions.assertTrue(importDeclaration != null, "Import " + importName + " doesn't exist");
	}

	protected void assertInterfaceNameIs(String name) {
		Assertions.assertEquals(name, getType().getNameAsString());
	}

	protected void assertMethodExists(String methodName) {
		MethodDeclaration methodDeclaration = getMethod(methodName);
		Assertions.assertTrue(methodDeclaration != null, "Method " + methodName + " doesn't exist");
	}

	protected void assertMethodReturnTypeIs(String methodName, String returnType) {
		assertMethodExists(methodName);
		MethodDeclaration methodDeclaration = getMethod(methodName);
		Assertions.assertEquals(returnType, methodDeclaration.getTypeAsString());
	}

	protected void assertMethodVisibilityIs(String methodName, String visibility) {
		assertMethodExists(methodName);
		MethodDeclaration methodDeclaration = getMethod(methodName);
		Assertions.assertEquals(visibility, methodDeclaration.getAccessSpecifier().asString());
	}

	protected void assertObjectExists() {
		assertFileExists();
		project = new CucumberProject();
		try {
			wrapper = (CucumberJavaWrapper) project.createObject(getFile().getAbsolutePath());
			wrapper.load();
		} catch (Exception e) {
			Assertions.fail("There was an error executing the test step\n" + Utilities.getStackTraceAsString(e));
		}
	}

	protected void assertPackageIs(String packageName) {
		CompilationUnit cu = (CompilationUnit) wrapper.get();
		cu.getPackageDeclaration();
		Assertions.assertEquals(packageName, cu.getPackageDeclaration().get().getNameAsString());
	}

	private MethodDeclaration getMethod(String methodName) {
		for (MethodDeclaration m : getType().getMethods()) {
			if (m.getName().asString().contentEquals(methodName)) {
				return m;
			}
		}
		return null;
	}

	private ClassOrInterfaceDeclaration getType() {
		CompilationUnit cu = (CompilationUnit) wrapper.get();
		return (ClassOrInterfaceDeclaration) cu.getType(0);
	}

	protected void assertMethodParameterExists(String methodName, String parameterName) {
		assertMethodExists(methodName);
		Assertions.assertTrue(getMethod(methodName).getParameterByName(parameterName).get() != null,
				"Parameter Name " + parameterName + " doesn't exist");
	}

	protected void assertMethodParameterTypeIs(String methodName, String parameterName, String parameterType) {
		assertMethodExists(methodName);
		Assertions.assertEquals(parameterType,
				getMethod(methodName).getParameterByName(parameterName).get().getTypeAsString());
	}

	protected void assertMethodAnnotationExists(String methodName, String annotation) {
		assertMethodExists(methodName);
		Assertions.assertTrue(getAnnotation(methodName, annotation) != null,
				"Annotation " + annotation + " doesn't exist");
	}

	private AnnotationExpr getAnnotation(String methodName, String annotation) {
		for (AnnotationExpr a : getMethod(methodName).getAnnotations()) {
			if (a.toString().contentEquals(annotation)) {
				return a;
			}
		}
		return null;
	}

	protected void assertMethodStatementExists(String methodName, String statement) {
		assertMethodExists(methodName);
		Assertions.assertTrue(getStatement(methodName, statement) != null, "Statement " + statement + " doesn't exist");
	}

	private Statement getStatement(String methodName, String statement) {
		for (Statement s : getMethod(methodName).getBody().get().getStatements()) {
			s.toString();
			if (s.toString().contentEquals(statement)) {
				return s;
			}
		}
		return null;
	}
}
