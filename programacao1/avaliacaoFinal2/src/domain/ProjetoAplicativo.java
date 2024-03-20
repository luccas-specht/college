package domain;

public class ProjetoAplicativo extends Projeto {
    private String plataforma;

    private float tamanho;

    public ProjetoAplicativo(String nome, Nivel nivel, double custo, Gerente gerente, String plataforma, float tamanho) {
        super(nome, nivel, custo, gerente);
        if (tamanho <= 0) {
            throw new RuntimeException("tamanho deve ser maior que zero");
        }
        this.plataforma = plataforma;
        this.tamanho = tamanho;
    }

    public ProjetoAplicativo() {
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
