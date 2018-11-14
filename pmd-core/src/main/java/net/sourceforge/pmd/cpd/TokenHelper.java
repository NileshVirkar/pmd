package net.sourceforge.pmd.cpd;

import java.util.List;

import net.sourceforge.pmd.cpd.db.TokensDao;

public class TokenHelper {

    public static int getLineCount(TokenEntry mark, Match match, TokensDao tokensDao, List<TokenEntry> tokens) {
        TokenEntry endTok = tokens.get(mark.getIndex() + match.getTokenCount() - 1);
        if (endTok == TokenEntry.EOF) {
            endTok = tokens.get(mark.getIndex() + match.getTokenCount() - 2);
        }
        return endTok.getBeginLine() - mark.getBeginLine() + 1;
    }
}
