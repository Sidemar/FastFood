package br.ufrn.imd.modelo;

public class Refrigerante extends Item{
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public Refrigerante() {
    }

    public Refrigerante(int id, String nome, int quantidade) {
        super(id, nome);
        this.quantidade = quantidade;
    }
    
}
