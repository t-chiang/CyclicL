/*
 * generated by Xtext 2.30.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RghAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/mcmaster/requirements/gherkin/rgh/parser/antlr/internal/InternalRgh.tokens");
	}
}
