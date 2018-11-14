/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import net.sourceforge.pmd.cpd.db.TokensDao;

public class MatchAlgorithm {

    private static final int MOD = 37;
    private int lastHash;
    private int lastMod = 1;

    private List<Match> matches;
    //private Map<String, SourceCode> source;
    //    private Tokens tokens;
    private List<TokenEntry> code;
    private CPDListener cpdListener;
    private int min;
    private TokensDao tokensDao;
    private List<String> filelist;

    public MatchAlgorithm(TokensDao tokensDao, int min, List<String> filelist) {
        this(tokensDao, min, new CPDNullListener(), filelist);
    }

    public MatchAlgorithm(TokensDao tokensDao, int min, CPDListener listener, List<String> filelist) {
        //this.source = sourceCode;
        this.tokensDao = tokensDao;
        //this.code = tokens.getTokens();
        this.min = min;
        this.cpdListener = listener;
        for (int i = 0; i < min; i++) {
            lastMod *= MOD;
        }
        this.filelist = filelist;
    }

    public void setListener(CPDListener listener) {
        this.cpdListener = listener;
    }

    public Iterator<Match> matches() {
        return matches.iterator();
    }

    public TokenEntry tokenAt(int offset, TokenEntry m) {
        return code.get(offset + m.getIndex());
        //return tokensDao.getTokenForIndex(offset + m.getId());
    }

//    public TokenEntry tokenAt(int offset, int id) {
//        return code.get(offset + id);
//    }

    public int getMinimumTileSize() {
        return this.min;
    }

    public void findMatches() {
        cpdListener.phaseUpdate(CPDListener.HASH);
        Map<TokenEntry, Object> markGroups = hash();

        System.out.println("findMatches"+ markGroups.size());

        cpdListener.phaseUpdate(CPDListener.MATCH);
        MatchCollector matchCollector = new MatchCollector(this);
        for (Iterator<Object> i = markGroups.values().iterator(); i.hasNext();) {
            Object o = i.next();
            if (o instanceof List) {
                @SuppressWarnings("unchecked")
                List<TokenEntry> l = (List<TokenEntry>) o;
                Collections.reverse(l);
                matchCollector.collect(l);
            }
            i.remove();
        }
        cpdListener.phaseUpdate(CPDListener.GROUPING);
        matches = matchCollector.getMatches();

        for (Match match : matches) {
            for (Mark mark : match) {
                TokenEntry token = mark.getToken();
                int lineCount = TokenHelper.getLineCount(token, match, tokensDao, code);

                mark.setLineCount(lineCount);
                //SourceCode sourceCode = source.get(token.getTokenSrcID());
                mark.setSourceCode(null);
            }
        }
        cpdListener.phaseUpdate(CPDListener.DONE);
    }

    @SuppressWarnings("PMD.JumbledIncrementer")
    private Map<TokenEntry, Object> hash() {
        Map<TokenEntry, Object> markGroups = new HashMap<>();

//        for (String filelist : filelist) {
//            code = tokensDao.getTokensByFile(filelist);
                    System.out.println(LoggerUtils.getLoggingString("starting query for all tokens"));
                    code = tokensDao.getTokens();
                    System.out.println(LoggerUtils.getLoggingString("Got all tokens from table"));

            for (int i = code.size() - 1; i >= 0; i--) {
                TokenEntry token = code.get(i);
                token.setIndex(i);
                if (! StringUtils.equalsAnyIgnoreCase(token.getType(), "EOFMarker")) {
                    TokenEntry tokenEntry = tokenAt(min, token);
                    int last = tokenEntry.getIdentifier();
                    lastHash = MOD * lastHash + token.getIdentifier() - lastMod * last;
                    token.setHashCode(lastHash);
                    Object o = markGroups.get(token);

                    // Note that this insertion method is worthwhile since the vast
                    // majority
                    // markGroup keys will have only one value.
                    if (o == null) {
                        markGroups.put(token, token);
                    } else if (o instanceof TokenEntry) {
                        List<TokenEntry> l = new ArrayList<>();
                        l.add((TokenEntry) o);
                        l.add(token);
                        markGroups.put(token, l);
                    } else {
                        @SuppressWarnings("unchecked")
                        List<TokenEntry> l = (List<TokenEntry>) o;
                        l.add(token);
                    }
                } else {
                    lastHash = 0;
                    for (int end = Math.max(0, i - min + 1); i > end; i--) {
                        token = code.get(i - 1);
                        lastHash = MOD * lastHash + token.getIdentifier();
                        if (StringUtils.equalsAnyIgnoreCase(token.getType(), "EOFMarker")) {
                            break;
                        }
                    }
                }
            }
        //}
        return markGroups;
    }
}
