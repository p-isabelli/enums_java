package org.example;

public enum Tipo {
    MARGUERITA("Marguerita"),
    CALABRESA("Calabresa"),
    QUATRO_QUEIJOS("Quatro Queijos"),
    FRANGO_CATUPIRY("Frango com Catupiry"),
    CHOCOLATE("Recheio de chocolate"),
    QUEIJO("Queijo mussarela");

    private final String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
