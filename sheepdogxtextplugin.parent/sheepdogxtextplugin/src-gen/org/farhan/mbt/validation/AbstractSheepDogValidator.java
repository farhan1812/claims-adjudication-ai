/*
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractSheepDogValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.farhan.mbt.sheepDog.SheepDogPackage.eINSTANCE);
		return result;
	}
}
