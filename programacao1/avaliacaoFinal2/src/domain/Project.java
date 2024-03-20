package domain;

public abstract class Project implements IProject {
    private String name;
    private Level level;
    private double cost;
    private Manager manager;

    public Project() {
    }

    public Project(String name, Level level, double cost, Manager manager) {
        if (cost <= 0) {
            throw new RuntimeException("tamanho deve ser maior que zero");
        }
        this.name = name;
        this.level = level;
        this.cost = cost;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level.getDescription();
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getManager() {
        return manager.getName();
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
