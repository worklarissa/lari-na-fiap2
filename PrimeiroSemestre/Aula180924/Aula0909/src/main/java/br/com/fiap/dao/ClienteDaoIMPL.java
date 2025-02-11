package br.com.fiap.dao;

import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.IdNaoEncontradoException;
import javax.persistence.EntityManagerFactory;

import javax.persistence.EntityManager;

public class ClienteDaoIMPL  implements ClienteDao {

    private EntityManager em;

    public ClienteDaoIMPL(EntityManager em){
        this.em = em;
    }

    public void cadastrar(Cliente cliente){
        em.persist(cliente);
    }

    public void atualizar(Cliente cliente) throws IdNaoEncontradoException {
        buscarporId(cliente.getId()); //Valida se existe o cliente para atualizar
        em.merge(cliente);
    }

    public void remover(int id) throws IdNaoencontradoException {
        Cliente cliente = buscarPorId(id); //Valida se existe o cliente para atualizar
        em.remove(cliente);
    }

    public Cliente buscarPorId(int id) throws IdNãoEncrontradoException{
        Cliente cliente = em.find(Cliente.class, id);
        if(cliente == null)
            throw new IdNaoEncontradoException("Cliente nao encontrado");
        return cliente;
    }

    public void commit () throws CommitException {
        try{
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new CommitException();
        }
    }
}
