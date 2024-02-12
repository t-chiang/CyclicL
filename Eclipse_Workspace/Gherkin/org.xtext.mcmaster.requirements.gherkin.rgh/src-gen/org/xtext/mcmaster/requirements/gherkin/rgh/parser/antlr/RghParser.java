/*
 * generated by Xtext 2.32.0
 */
package org.xtext.mcmaster.requirements.gherkin.rgh.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mcmaster.requirements.gherkin.rgh.parser.antlr.internal.InternalRghParser;
import org.xtext.mcmaster.requirements.gherkin.rgh.services.RghGrammarAccess;

public class RghParser extends AbstractAntlrParser {

	@Inject
	private RghGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRghParser createParser(XtextTokenStream stream) {
		return new InternalRghParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public RghGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RghGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
