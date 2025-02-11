package br.com.fiap.view;

import br.com.fiap.dao.ClienteDao;
import br.com.fiap.entity.Cliente;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteRemover {
    //Remover o cliente do codigo
    public static void main(String[] args){
        //Criar a fabrica
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        //Criar o entity mananger
        EntityManager em = fabrica.createEntityManager();

        //Pesquisar o cliente que será removido
        Cliente cliente = em.find(Cliente.class, 8);

        //Chamar o metodo remover
        em.remove(cliente);

        em.getTransaction().begin();
        em.getTransaction().commit();
    }
}