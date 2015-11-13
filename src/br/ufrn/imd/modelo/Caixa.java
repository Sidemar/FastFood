package br.ufrn.imd.modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sidemar
 */
public class Caixa {
    private Queue<Cliente> fila;
    private String tipo;

    public Caixa() {
        fila = new LinkedList();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void adicionar(Cliente cliente) {
        this.fila.add(cliente);
    }
    
    public void remover() {
        this.fila.remove();
    }
    
    public void atender() {
        
    }

    public Queue<Cliente> getFila() {
        return fila;
    }

    public void setFila(Queue<Cliente> fila) {
        this.fila = fila;
    }
}
