package br.com.fiap.view;

import br.com.fiap.entity.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestePesquisa{
    public static void main(String[] args) {
        //Criar a fabrica de Entity Mananger
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        //Criar o entity Manager
        EntityManager em = fabrica.createEntityManager();

        //Pesquisar um cliente pela PK
        Cliente cliente = em.find(Cliente.class, 1);

        System.out.println(cliente.getNome());

        cliente.setNome("Eminem");

        //commit
        em.getTransaction().begin();
        em.getTransaction().commit();
    }
}