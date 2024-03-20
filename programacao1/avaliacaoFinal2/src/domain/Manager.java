package domain;

public class Manager {
    private String name;
    private Project project;

    public Manager() {
    }

    public Manager(String name, Project project) {
        this.name = name;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
