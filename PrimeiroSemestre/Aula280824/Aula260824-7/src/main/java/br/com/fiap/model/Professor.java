package br.com.fiap.model;

public class Professor extends Pessoa{
    @Override
    @SuppressWarnings("all")
    //@Deprecated define que o método esta obsoleto e não deve ser utilizado
    public void andar() {
        System.out.println("Professor andando");
        int x = 123;
    }
}
