package net.sourceforge.pmd.cpd.db;

public class File {
    private int id;
    private String filePath;
    
    public File() {
        super();
        // TODO Auto-generated constructor stub
    }

    public File(String filePath) {
        super();
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
