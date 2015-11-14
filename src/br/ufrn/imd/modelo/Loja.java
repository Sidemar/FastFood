package br.ufrn.imd.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Loja {
    private ArrayList<Caixa> caixas;

    public ArrayList<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(ArrayList<Caixa> caixas) {
        this.caixas = caixas;
    }
    private Queue<Cliente> fila;

    public Loja() {
        this.caixas = new ArrayList<>();
        fila = new LinkedList<>();
    }
    
    public void adicionarCaixa(Caixa caixa) {
        this.caixas.add(caixa);
    }
    
    public void adicionarCliente(Cliente cliente) {
        this.fila.add(cliente);
    }
    
    public void removerCliente() {
        this.fila.remove();
    }
    
    public Queue<Cliente> getFila() {
        return fila;
    }

    public void setFila(Queue<Cliente> fila) {
        this.fila = fila;
    }
    
    public void atender() {
        Cliente cliente = fila.remove();
        Random gerador = new Random(); 
        int numeroCaixa = gerador.nextInt(caixas.size());
        caixas.get(numeroCaixa).abriPedido(cliente);
    }
}
