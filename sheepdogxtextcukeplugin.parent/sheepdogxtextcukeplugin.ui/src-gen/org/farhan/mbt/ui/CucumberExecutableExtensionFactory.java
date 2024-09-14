/*
 * generated by Xtext 2.36.0
 */
package org.farhan.mbt.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import sheepdogxtextcukeplugin.ui.internal.SheepdogxtextcukepluginActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CucumberExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SheepdogxtextcukepluginActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SheepdogxtextcukepluginActivator activator = SheepdogxtextcukepluginActivator.getInstance();
		return activator != null ? activator.getInjector(SheepdogxtextcukepluginActivator.ORG_FARHAN_MBT_CUCUMBER) : null;
	}

}
