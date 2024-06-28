package org.example;

public class Pizza {
    private Tamanho tamanho;
    private Tipo tipo;

    public Pizza(Tamanho tamanho, Tipo tipo) {
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public Pizza(){

    }

    public double calcularPreco(){
        double precoBase;

        switch (tamanho){
            case PEQUENA:
                precoBase = 20.0;
                break;
            case MEDIA:
                precoBase = 30.0;
                break;
            case GRANDE:
                precoBase = 40.0;
                break;
            default:
                precoBase = 0;
        }

        switch (tipo){
            case MARGUERITA:
                precoBase += 5.0;
                break;
            case CALABRESA:
                precoBase += 6.0;
                break;
            case QUATRO_QUEIJOS:
                precoBase += 7.0;
                break;
            case FRANGO_CATUPIRY:
                precoBase += 8.0;
                break;
        }

        return precoBase;
    }
}
