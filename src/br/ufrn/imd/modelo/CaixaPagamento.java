package br.ufrn.imd.modelo;

import java.util.HashMap;

public class CaixaPagamento {
    HashMap<Integer, Integer> ids = new HashMap<>();

    public HashMap<Integer, Integer> getIds() {
        return ids;
    }

    public void setIds(HashMap<Integer, Integer> ids) {
        this.ids = ids;
    }
    
}
