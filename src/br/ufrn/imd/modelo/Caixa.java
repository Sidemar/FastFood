package br.ufrn.imd.modelo;

import java.util.ArrayList;

/**
 *
 * @author Sidemar
 */
public class Caixa {
    private ArrayList<Cliente> fila;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void adicionar(Cliente cliente) {
        this.fila.add(cliente);
    }
    
    public void remover(Cliente cliente) {
        this.fila.remove(cliente);
    }
    
    public void atender() {
        
    }
}
