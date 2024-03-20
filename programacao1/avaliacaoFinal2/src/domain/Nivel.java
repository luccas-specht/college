package domain;

public enum Nivel {
    OPERACIONAL("operacional"),
    ESTRATEGICO("estratégico");

    private final String descricao;

    Nivel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
