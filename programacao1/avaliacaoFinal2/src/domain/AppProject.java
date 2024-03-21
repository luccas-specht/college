package domain;

public class AppProject extends Project implements IAppProject {
    private String plataform;

    private float size;

    public AppProject(String nome, Level level, double cost, Manager manager, String plataform, float size) {
        super(nome, level, cost, manager);
        if (size <= 0) {
            throw new RuntimeException("tamanho deve ser maior que zero");
        }
        this.plataform = plataform;
        this.size = size;
    }

    public AppProject() {
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public float getSize() {
        return size;
    }

    public void setTamanho(float size) {
        this.size = size;
    }
}
