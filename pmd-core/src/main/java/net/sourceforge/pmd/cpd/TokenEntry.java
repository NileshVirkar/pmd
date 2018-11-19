/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TokenEntry implements Comparable<TokenEntry> {

    public static final TokenEntry EOF = new TokenEntry();

    private int id;
    private String tokenSrcID;
    private int beginLine;
    private int index;
    private int identifier;
    private int hashCode;
    private String type;
    private String image;
    
    private static final ThreadLocal<Map<String, Integer>> TOKENS = new ThreadLocal<Map<String, Integer>>() {
        @Override
        protected Map<String, Integer> initialValue() {
            return new HashMap<>();
        }
    };
    private static final ThreadLocal<AtomicInteger> TOKEN_COUNT = new ThreadLocal<AtomicInteger>() {
        @Override
        protected AtomicInteger initialValue() {
            return new AtomicInteger(0);
        }
    };

    private TokenEntry() {
        this.identifier = 0;
        this.tokenSrcID = "EOFMarker";
    }

    /**
     * Creates a new token entry with the given informations.
     * @param image
     * @param tokenSrcID
     * @param beginLine the linenumber, 1-based.
     */
    public TokenEntry(String image, String tokenSrcID, int beginLine, int identifier) {
        this.image = image;
        this.tokenSrcID = tokenSrcID;
        this.beginLine = beginLine;
        this.index = TOKEN_COUNT.get().getAndIncrement();
        this.identifier = identifier;
    }

    public TokenEntry(int id, String tokenSrcID, int beginLine, int index, int identifier, int hashCode, String type, String image) {
        super();
        this.id = id;
        this.tokenSrcID = tokenSrcID;
        this.beginLine = beginLine;
        this.index = index;
        this.identifier = identifier;
        this.hashCode = hashCode;
        this.type = type;
        this.image = image;
    }

    public static TokenEntry getEOF() {
        TOKEN_COUNT.get().getAndIncrement();
        return EOF;
    }

    public static TokenEntry getEOF(String sourceFile) {
        TOKEN_COUNT.get().getAndIncrement();
        return new TokenEntry(0, sourceFile, 0, 0, 0, 0, "EOFMarker", "");
    }
    
    public static void clearImages() {
        TOKENS.get().clear();
        TOKENS.remove();
        TOKEN_COUNT.remove();
    }

    /**
     * Helper class to preserve and restore the current state of the token
     * entries.
     */
    public static class State {
        private int tokenCount;
        private Map<String, Integer> tokens;
        private List<TokenEntry> entries;

        public State(List<TokenEntry> entries) {
            this.tokenCount = TokenEntry.TOKEN_COUNT.get().intValue();
            this.tokens = new HashMap<>(TokenEntry.TOKENS.get());
            this.entries = new ArrayList<>(entries);
        }

        public List<TokenEntry> restore() {
            TokenEntry.TOKEN_COUNT.get().set(tokenCount);
            TOKENS.get().clear();
            TOKENS.get().putAll(tokens);
            return entries;
        }
    }

    public String getTokenSrcID() {
        return tokenSrcID;
    }

    public int getBeginLine() {
        return beginLine;
    }

    public int getIdentifier() {
        return this.identifier;
    }

//    public int getId() {
//        return this.index;
//    }

    public int getId() {
        return id - 1;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTokenSrcID(String tokenSrcID) {
        this.tokenSrcID = tokenSrcID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TokenEntry)) {
            return false;
        }
        TokenEntry other = (TokenEntry) o;
        return other.hashCode == hashCode;
    }

    @Override
    public int compareTo(TokenEntry other) {
        return getId() - other.getId();
    }
    
    @Override
    public String toString() {
//        if (this == EOF) {
//            return "EOF";
//        }
//        for (Map.Entry<String, Integer> e : TOKENS.get().entrySet()) {
//            if (e.getValue().intValue() == identifier) {
//                return e.getKey();
//            }
//        }
//        return "--unkown--";
        
        return image;
    }

    final void setImage(String image) {
        Integer i = TOKENS.get().get(image);
        if (i == null) {
            i = TOKENS.get().size() + 1;
            TOKENS.get().put(image, i);
        }
        this.identifier = i.intValue();
    }
}
