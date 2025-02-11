package br.com.fiap.model;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.anotation.Tabela;

@Tabela(nome = "TAB_PESSOA")
public class Pessoa {
    @Coluna(nome="nm_pessoa", obrigatorio = true, tamanho=100)
    private String nome;

    @Coluna(nome="nr_idade", obrigatorio = true)
    private int idade;

    @Coluna(nome="vl_altura")
    private String altura;

    public void andar(){
        System.out.println("Pessoa andando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}
