package org.example;

public enum Tamanho {
    PEQUENA("Pequena"),
    MEDIA ("Média"),
    GRANDE("Grande");

    private final String descricao;

    Tamanho(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
