public class Produto {

    private String nome;
    private String marca; //Correção do exercício
    private double preco;
    private double peso; // Correção do exercício

    //Correção do exercício-adição do metodo construtor
    public Produto(String nome, String marca, double preco, double peso) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Correção do exercício-mudando getters e setters dos atributos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
