package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 *
 * @author Sidemar
 */
public class Loja {
    private ArrayList<Caixa> caixas;

    public Loja() {
        this.caixas = new ArrayList<>();
    }
    
    public void adicionarCaixa(Caixa caixa) {
        this.caixas.add(caixa);
    }
}
