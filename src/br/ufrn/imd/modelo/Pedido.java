package br.ufrn.imd.modelo;

import java.util.ArrayList;

public class Pedido {
    private int id;

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
    private ArrayList<Item> itens = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void adicionarItem(Item item) {
        this.itens.add(item);
    }
}
