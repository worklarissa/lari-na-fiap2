package br.com.fiap.beans;

public class Veiculo {
    private String nome;
    protected String tipo;
    private double preco;

    public Veiculo() {
    }

    public Veiculo(String nome, String tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void printNome(){
        System.out.println("Nome: " + this.nome);
    }

    public void printTipo(){
        System.out.println("Tipo: " + this.tipo);
    }
}
