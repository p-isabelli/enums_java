package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        Pedido listaPedidos = new Pedido();

        do {
            System.out.println("BEM VINDO A PIZZARIA!");

            System.out.println("Escolha um sabor:");
            for (Tipo tipo : Tipo.values()) {
                System.out.println(tipo.ordinal() + 1 + " - " + tipo.getDescricao());
            }
            int opcaoTipo = scanner.nextInt();
            Tipo tipoEscolhido = Tipo.values()[opcaoTipo - 1];

            System.out.println("Escolha um tamanho:");
            for (Tamanho tamanho : Tamanho.values()) {
                System.out.println(tamanho.ordinal() + 1 + " - " + tamanho.getDescricao());
            }
            int opcaoTamanho = scanner.nextInt();
            Tamanho tamanhoEscolhido = Tamanho.values()[opcaoTamanho - 1];

            Pizza pizzaEscolhida = new Pizza(tamanhoEscolhido, tipoEscolhido);
            System.out.println("Você escolheu uma pizza " + tamanhoEscolhido.getDescricao() + " de " + tipoEscolhido.getDescricao());

            System.out.println("Preço: R$ " + pizzaEscolhida.calcularPreco());

            listaPedidos.adicionarPedido(pizzaEscolhida);
            System.out.println("Você escolheu uma pizza " + tamanhoEscolhido.getDescricao() + " de " + tipoEscolhido.getDescricao());

            System.out.println("Deseja fazer mais algum pedido?\n1 - sim \n2 - não");
            opcao = scanner.nextInt();

        }while(opcao != 2);

        System.out.println("Programa finalizado");
    }
}