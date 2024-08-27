/*
 * generated by Xtext 2.36.0
 */
package org.farhan.ui;

import com.google.inject.Injector;
import cucumberxtexteditor.ui.internal.CucumberxtexteditorActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CucumberExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(CucumberxtexteditorActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		CucumberxtexteditorActivator activator = CucumberxtexteditorActivator.getInstance();
		return activator != null ? activator.getInjector(CucumberxtexteditorActivator.ORG_FARHAN_CUCUMBER) : null;
	}

}
