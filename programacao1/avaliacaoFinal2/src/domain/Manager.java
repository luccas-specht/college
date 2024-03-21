package domain;

public class Manager {
    private String name;
    private IProject project;

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

    public IProject getProject() {
        return project;
    }

    public void setProject(IProject project) {
        this.project = project;
    }
}
