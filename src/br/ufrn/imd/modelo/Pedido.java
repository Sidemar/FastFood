package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 *
 * @author Sidemar
 */
public class Pedido {
    private int id;
    private ArrayList<Item> itens;

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
