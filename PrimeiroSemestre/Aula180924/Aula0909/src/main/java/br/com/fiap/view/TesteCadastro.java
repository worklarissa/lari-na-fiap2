package br.com.fiap.view;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCadastro{
    public static void main(String[] args) {
        //Instanciar um Cliente sem o ID (pode criar o constructor)
        Cliente cliente = new Cliente("Ramon", new GregorianCalendar(1980, Calendar.JANUARY, 1),
                                                                        20000.0, "5582332154", Genero.MASCULINO);
        //Instanciar uma fabrica de Entiy Manager
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        //Criar o Entity Manager
        EntityManager em = fabrica.createEntityManager();

        //Chamar o metodo persist() do Entity Mananger
        em.persist(cliente);

        em.getTransaction().begin();
        em.getTransaction().commit();

        System.out.println("Cliente cadastrado!");

    }
}