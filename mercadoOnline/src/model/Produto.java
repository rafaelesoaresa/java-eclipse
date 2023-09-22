package model;

public class Produto {
    private String nome;
    private double precoVenda;

    public Produto(String nome, double precoVenda) {
        this.nome = nome;
        this.precoVenda = precoVenda;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }
}
