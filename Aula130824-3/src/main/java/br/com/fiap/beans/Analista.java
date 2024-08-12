package br.com.fiap.beans;

public class Analista extends Funcionario {
    @Override
    public void calcSalario(){
        this.salario=2000;
    }
}