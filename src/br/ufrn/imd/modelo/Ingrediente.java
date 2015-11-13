package br.ufrn.imd.modelo;

/**
 *
 * @author Sidemar
 */
public class Ingrediente {
    private int id;
    private String nome;
    private int quantidade;

    public Ingrediente() {
    }

    public Ingrediente(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
