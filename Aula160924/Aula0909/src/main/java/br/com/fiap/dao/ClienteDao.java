package br.com.fiap.dao;


import br.com.fiap.entity.Cliente;

public class ClienteDao {

    void cadastrar(Cliente cliente);

    void atualizar(Cliente cliente);

    void remover(int id) throws IdNaoEncontradoException;

    Cliente buscarPorId(int id) throws IdNaoEncontradoException;

    void commit() throws CommitException;


}
