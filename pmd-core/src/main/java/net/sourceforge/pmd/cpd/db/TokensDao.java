package net.sourceforge.pmd.cpd.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sourceforge.pmd.cpd.TokenEntry;

public class TokensDao {

    private IConnectionProxy conn;
    private PreparedStatement getMaxIdStmt;
    private PreparedStatement insertTokenStmt;
    private PreparedStatement readTokenStmt;
    private PreparedStatement readTokenByFileStmt;
    private PreparedStatement getTokenForIndexStmt;
    private PreparedStatement deleteTokenStmt;
    private PreparedStatement getTokenIdentifierStmt;
    private PreparedStatement getMaxIdentifierStmt;
    private PreparedStatement insertFileStmt;
    private PreparedStatement getFileByPathStmt;

    private int batchCount = 0;
    private final int BATCH_SIZE = 1000;
    private Map<String, Integer> localBatchTokens;
    private int index=1;
    private int maxIdentifier=0;

    public TokensDao(IConnectionProxy conn){
        super();
    }

    public TokensDao(IConnectionProxy conn, boolean isFullScan) throws SQLException {
        super();

        this.conn = conn;
        localBatchTokens = new HashMap<String, Integer>();

        if(isFullScan) {
            createTokenTable();
            createIndexQuary();
        }

        String getMaxIdStmtString = "SELECT MAX(ID) as maxId from TOKEN";
        String insertFileStmtString = "INSERT INTO FILE (PATH) VALUES (?)";
        String insertTokenStmtString = "INSERT INTO TOKEN (TOKEN_SRC, BEGIN_LINE, INDEX, INDENTIFIER, HASHCODE, TYPE, IMAGE, ID) VALUES (?,?,?,?,?,?,?,?)";
        String readTokenStmtString = "SELECT * FROM TOKEN";
        String readTokenByFileStmtString = "SELECT * FROM TOKEN WHERE TOKEN_SRC=?";
        String getTokenForIndexStmtString = "SELECT * FROM TOKEN WHERE INDEX=?";
        String deleteTokenStmtString = "DELETE FROM TOKEN WHERE TOKEN_SRC=?";
        String getTokenIdentifierStmtString = "SELECT * FROM TOKEN WHERE IMAGE=?";
        String getMaxIdentifierStmtString = "SELECT INDENTIFIER FROM TOKEN ORDER BY INDENTIFIER DESC LIMIT 1";
        String getFileByPathStmtString = "SELECT ID FROM FILE WHERE PATH=?";
        try {
            getMaxIdStmt = conn.prepareStatement(getMaxIdStmtString, Statement.RETURN_GENERATED_KEYS);
            insertTokenStmt = conn.prepareStatement(insertTokenStmtString, Statement.RETURN_GENERATED_KEYS);
            readTokenStmt = conn.prepareStatement(readTokenStmtString);
            readTokenByFileStmt = conn.prepareStatement(readTokenByFileStmtString);
            getTokenForIndexStmt = conn.prepareStatement(getTokenForIndexStmtString);
            deleteTokenStmt = conn.prepareStatement(deleteTokenStmtString);
            getTokenIdentifierStmt = conn.prepareStatement(getTokenIdentifierStmtString);
            getMaxIdentifierStmt = conn.prepareStatement(getMaxIdentifierStmtString);
            insertFileStmt = conn.prepareStatement(insertFileStmtString);
            getFileByPathStmt = conn.prepareStatement(getFileByPathStmtString);

            if(!isFullScan) {
                index = getMaxIdFromDb();
                maxIdentifier = maxIndentifierFromDb();
            }
            //readTokenStmt.setFetchSize(BATCH_SIZE);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void dispose() {
        //TODO For Othe rStatements
        DbUtils.closeStmt(getMaxIdStmt);
        DbUtils.closeStmt(insertTokenStmt);
        DbUtils.closeStmt(readTokenStmt);
        DbUtils.closeStmt(readTokenByFileStmt);
        DbUtils.closeStmt(getTokenForIndexStmt);
        DbUtils.closeStmt(deleteTokenStmt);
        DbUtils.closeStmt(getTokenIdentifierStmt);
        DbUtils.closeStmt(getMaxIdentifierStmt);
        DbUtils.closeStmt(insertFileStmt);
        DbUtils.closeStmt(getFileByPathStmt);
    }

    public void createTokenTable() throws SQLException {
        //File table
        String fileCreateQuery = "CREATE TABLE FILE (ID int auto_increment primary key, PATH varchar)";
        //Token table
        String createQuery = "CREATE TABLE TOKEN (ID int primary key, TOKEN_SRC int, BEGIN_LINE int, "
                + "INDEX int, INDENTIFIER int, HASHCODE int, TYPE varchar, IMAGE varchar, "
                + "FOREIGN KEY (TOKEN_SRC) REFERENCES FILE(ID))";

        
        DbUtils.executeUpdateAndClose(conn, fileCreateQuery);
        DbUtils.executeUpdateAndClose(conn, createQuery);
    }

    private void createIndexQuary() throws SQLException {
        String createIndexQuery = "create index idx on TOKEN (IMAGE)";
        String createFilePathIndexQuery = "create index fileidx on FILE (PATH)";
        //ID int auto_increment primary key,
        DbUtils.executeUpdateAndClose(conn, createIndexQuery);
        DbUtils.executeUpdateAndClose(conn, createFilePathIndexQuery);
    }

    private int getOrSaveFile(File file) throws SQLException {
        int id = getFileIdByPath(file.getFilePath());
        if(id > 0) {
            return id;
        } else {
            return saveFile(file);
        }
    }

    private int saveFile(File file) throws SQLException {
        int savedId;
        insertFileStmt.setString(1, file.getFilePath());

        int affectedRows = insertFileStmt.executeUpdate();
        if (affectedRows == 0) {
            throw new SQLException("inserting file failed, no rows affected.");
        }

        savedId = DbUtils.getLastInsertedId(insertFileStmt);

        return savedId;
    }

    private int getFileIdByPath(String path) {
        try {
            getFileByPathStmt.setString(1, path);
            try(ResultSet rs = getFileByPathStmt.executeQuery()) {
                if(rs.next())
                    return rs.getInt("ID");
                else 
                    return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void saveToken(TokenEntry tokenEntry) {
        try {
            int fileid = getOrSaveFile(new File(tokenEntry.getTokenSrcID()));

            insertTokenStmt.setInt(1, fileid);
            insertTokenStmt.setInt(2, tokenEntry.getBeginLine());
            insertTokenStmt.setInt(3, tokenEntry.getId());
            insertTokenStmt.setInt(4, tokenEntry.getIdentifier());
            insertTokenStmt.setInt(5, tokenEntry.hashCode());
            insertTokenStmt.setString(6, tokenEntry.getType());
            insertTokenStmt.setString(7, tokenEntry.getImage());
            insertTokenStmt.setInt(8, index);
            batchCount++;
            index++;
            if(batchCount >= BATCH_SIZE)
            {
                insertTokenStmt.executeUpdate();
                batchCount = 0;
            } else {
                insertTokenStmt.addBatch();
            }
            localBatchTokens.put(tokenEntry.getImage(), tokenEntry.getIdentifier());
            if(tokenEntry.getIdentifier() > maxIdentifier)
                maxIdentifier = tokenEntry.getIdentifier();
        } catch (SQLException e) {
            System.err.println(e);
            e.printStackTrace();
            //DbUtils.closeStmt(insertCloneStmt);
        }
    }

    public void saveRemainingToken() {
        try {
            insertTokenStmt.executeBatch();
            batchCount = 0;
            //conn.commit();
        } catch (SQLException e) {
        }
    }

    public Integer getMaxIdFromDb() {
        Integer maxId = 0;
        try {
            try(ResultSet rs = getMaxIdStmt.executeQuery()) {
                while(rs.next()){
                    maxId = rs.getInt("maxId");                    
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxId;
    }

    public List<TokenEntry> getTokens() {
        List<TokenEntry> tokens = new ArrayList<>();
        try {
            try(ResultSet rs = readTokenStmt.executeQuery()) {
                while(rs.next()){
                    tokens.add(new TokenEntry(rs.getInt("ID"), rs.getString("TOKEN_SRC"), rs.getInt("BEGIN_LINE"), rs.getInt("INDEX"), 
                            rs.getInt("INDENTIFIER"), rs.getInt("HASHCODE"), rs.getString("TYPE"), rs.getString("IMAGE")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tokens;
    }

    public List<TokenEntry> getTokensByFile(String filePath) {
        List<TokenEntry> tokens = new ArrayList<>();
        try {
            readTokenByFileStmt.setString(1, filePath);
            try(ResultSet rs = readTokenByFileStmt.executeQuery()) {
                while(rs.next()){
                    tokens.add(new TokenEntry(rs.getInt("ID"), rs.getString("TOKEN_SRC"), rs.getInt("BEGIN_LINE"), rs.getInt("INDEX"), 
                            rs.getInt("INDENTIFIER"), rs.getInt("HASHCODE"), rs.getString("TYPE"), rs.getString("IMAGE")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tokens;
    }

    public TokenEntry getTokenForIndex(int id) {
        try {
            getTokenForIndexStmt.setInt(1, id);
            try(ResultSet rs = getTokenForIndexStmt.executeQuery()) {
                while(rs.next()){
                    return new TokenEntry(rs.getInt("ID"), rs.getString("TOKEN_SRC"), rs.getInt("BEGIN_LINE"), rs.getInt("INDEX"), 
                            rs.getInt("INDENTIFIER"), rs.getInt("HASHCODE"), rs.getString("TYPE"), rs.getString("IMAGE"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getIdentifierForImage(String image) {
        if(localBatchTokens.containsKey(image)) {
            int imageIdentifier = localBatchTokens.get(image);
            if(imageIdentifier > maxIdentifier)
                maxIdentifier = imageIdentifier;
            return imageIdentifier;
        }
        try {
            getTokenIdentifierStmt.setString(1, image);
            try(ResultSet rs = getTokenIdentifierStmt.executeQuery()) {
                while(rs.next()){
                    return rs.getInt("INDENTIFIER");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return maxIdentifier+1;
    }

    public void deleteFileTokens(String filepath) {
        try {
            deleteTokenStmt.setString(1, filepath);
            deleteTokenStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int maxIndentifierFromDb() {
        try {
            try(ResultSet rs = getMaxIdentifierStmt.executeQuery()) {
                while(rs.next()){
                    return rs.getInt("INDENTIFIER");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
