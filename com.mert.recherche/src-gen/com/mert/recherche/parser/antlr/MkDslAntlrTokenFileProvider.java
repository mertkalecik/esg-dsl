/*
 * generated by Xtext 2.25.0
 */
package com.mert.recherche.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MkDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/mert/recherche/parser/antlr/internal/InternalMkDsl.tokens");
	}
}
