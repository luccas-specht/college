package domain;

public class AppProject extends Project implements IProject{
    private String plataforma;

    private float tamanho;

    public AppProject(String nome, Level level, double custo, Manager manager, String plataforma, float tamanho) {
        super(nome, level, custo, manager);
        if (tamanho <= 0) {
            throw new RuntimeException("tamanho deve ser maior que zero");
        }
        this.plataforma = plataforma;
        this.tamanho = tamanho;
    }

    public AppProject() {
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
}
