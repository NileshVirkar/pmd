/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.io.Reader;
import java.io.StringReader;

import org.apache.commons.io.IOUtils;

import net.sourceforge.pmd.cpd.db.TokensDao;
import net.sourceforge.pmd.cpd.token.JavaCCTokenFilter;
import net.sourceforge.pmd.cpd.token.TokenFilter;
import net.sourceforge.pmd.lang.LanguageRegistry;
import net.sourceforge.pmd.lang.LanguageVersionHandler;
import net.sourceforge.pmd.lang.ast.TokenMgrError;
import net.sourceforge.pmd.lang.objectivec.ObjectiveCLanguageModule;
import net.sourceforge.pmd.lang.objectivec.ast.Token;

/**
 * The Objective-C Tokenizer
 */
public class ObjectiveCTokenizer implements Tokenizer {

    @Override
    public void tokenize(SourceCode sourceCode, TokensDao tokensDao) {
        StringBuilder buffer = sourceCode.getCodeBuffer();
        Reader reader = null;
        try {
            LanguageVersionHandler languageVersionHandler = LanguageRegistry.getLanguage(ObjectiveCLanguageModule.NAME)
                    .getDefaultVersion().getLanguageVersionHandler();
            reader = new StringReader(buffer.toString());
            final TokenFilter tokenFilter = new JavaCCTokenFilter(languageVersionHandler
                    .getParser(languageVersionHandler.getDefaultParserOptions())
                    .getTokenManager(sourceCode.getFileName(), reader));
            Token currentToken = (Token) tokenFilter.getNextToken();
            while (currentToken != null) {
                tokensDao.saveToken(new TokenEntry(currentToken.image, sourceCode.getFileName(), currentToken.beginLine));
                currentToken = (Token) tokenFilter.getNextToken();
            }
            tokensDao.saveToken(TokenEntry.getEOF());
            System.err.println("Added " + sourceCode.getFileName());
        } catch (TokenMgrError err) {
            err.printStackTrace();
            System.err.println("Skipping " + sourceCode.getFileName() + " due to parse error");
            tokensDao.saveToken(TokenEntry.getEOF());
        } finally {
            IOUtils.closeQuietly(reader);
        }
    }
}
