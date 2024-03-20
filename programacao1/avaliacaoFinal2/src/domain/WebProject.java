package domain;

public class WebProject extends Project implements IProject{
    private String programmingLanguage;
    private String db;

    public WebProject() {
    }

    public WebProject(String name, Level level, double cost, Manager manager, String programmingLanguage, String db) {
        super(name, level, cost, manager);
        this.programmingLanguage = programmingLanguage;
        this.db = db;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }
}
