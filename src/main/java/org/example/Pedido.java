package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
    private List<Pizza> pizzas;
    private int id;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.id = 1;
    }

    public void adicionarPedido(Pizza pizza){
        pizzas.add(pizza);
    }
}
