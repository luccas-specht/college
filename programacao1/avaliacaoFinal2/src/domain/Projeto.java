package domain;

import domain.Gerente;
import domain.Nivel;

public abstract class Projeto {
    private String nome;
    private Nivel nivel;
    private double custo;
    private Gerente gerente;

    public Projeto(String nome, Nivel nivel, double custo, Gerente gerente) {
        if (custo <= 0) {
            throw new RuntimeException("tamanho deve ser maior que zero");
        }
        this.nome = nome;
        this.nivel = nivel;
        this.gerente = gerente;
        this.custo = custo;
    }

    public Projeto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel.getDescricao();
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getGerente() {
        return gerente.getNome();
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}
