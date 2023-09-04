package models;

public class Produto {
    private String nome;
    private double peso;
    private double preco;
    private Tamanho tamanho;

    public Produto(String nome, double peso, double preco, Tamanho tamanho) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco(){
        return preco;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public double getTaxaPorKg() {
        double taxaPorKg = 0.1;
        return peso * taxaPorKg;
    }
}
