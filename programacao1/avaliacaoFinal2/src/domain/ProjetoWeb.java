package domain;

import domain.Gerente;
import domain.Nivel;
import domain.Projeto;

public class ProjetoWeb extends Projeto {
    private String linguagem;
    private String bd;

    public ProjetoWeb(String nome, Nivel nivel, double custo, Gerente gerente, String linguagem, String bd) {
        super(nome, nivel, custo, gerente);
        this.linguagem = linguagem;
        this.bd = bd;
    }

    public ProjetoWeb() {
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }
}
