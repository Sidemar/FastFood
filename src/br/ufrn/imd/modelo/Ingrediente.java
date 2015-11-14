package br.ufrn.imd.modelo;

public class Ingrediente {
    private int id;
    private String nome;
    private int quantidae;

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

    public Ingrediente(int id, String nome, int quantidae) {
        this.id = id;
        this.nome = nome;
        this.quantidae = quantidae;
    }

    public Ingrediente() {
    }

    public int getQuantidae() {
        return quantidae;
    }

    public void setQuantidae(int quantidae) {
        this.quantidae = quantidae;
    }
}
