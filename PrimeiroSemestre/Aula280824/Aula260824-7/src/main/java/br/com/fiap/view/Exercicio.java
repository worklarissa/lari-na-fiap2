package br.com.fiap.view;

import br.com.fiap.dao.JpaDao;
import br.com.fiap.model.Aluno;
import br.com.fiap.model.Pessoa;

public class Exercicio {

    public static void main(String[] args){
        Aluno aluno = new Aluno();
        JpaDao dao = new JpaDao();
        dao.pesquisar(aluno);

        Pessoa pessoa = new Pessoa();
        dao.pesquisar(pessoa);
    }
}
