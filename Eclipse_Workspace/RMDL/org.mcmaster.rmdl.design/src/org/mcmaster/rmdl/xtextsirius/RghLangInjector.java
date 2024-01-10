package org.mcmaster.rmdl.xtextsirius;

import org.xtext.mcmaster.requirements.gherkin.rgh.ui.internal.RghActivator;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;

public class RghLangInjector implements IXtextLanguageInjector {

	@Override
	public Injector getInjector() {
		return RghActivator.getInstance()
				.getInjector(RghActivator.ORG_XTEXT_MCMASTER_REQUIREMENTS_GHERKIN_RGH_RGH);
	}

}