package domain;

public class Gerente {
    private String nome;

    private Projeto projeto;

    public Gerente() {
    }

    public Gerente(String nome, Projeto projeto) {
        this.nome = nome;
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
