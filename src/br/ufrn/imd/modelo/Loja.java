package br.ufrn.imd.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 *
 * @author Sidemar
 */
public class Loja {
    private ArrayList<Caixa> caixas;
    private Queue<Cliente> fila;

    public Loja() {
        this.caixas = new ArrayList<>();
        fila = new LinkedList<>();
    }
    
    public void adicionarCaixa(Caixa caixa) {
        this.caixas.add(caixa);
    }
    
    public void adicionar(Cliente cliente) {
        this.fila.add(cliente);
    }
    
    public void remover() {
        this.fila.remove();
    }
    
    public Queue<Cliente> getFila() {
        return fila;
    }

    public void setFila(Queue<Cliente> fila) {
        this.fila = fila;
    }
    
    public void atender() {
        Cliente cliente = fila.peek();
        Random gerador = new Random(); 
        int numeroCaixa = gerador.nextInt(caixas.size());
        caixas.get(numeroCaixa).abriPedido(cliente);
    }
}
