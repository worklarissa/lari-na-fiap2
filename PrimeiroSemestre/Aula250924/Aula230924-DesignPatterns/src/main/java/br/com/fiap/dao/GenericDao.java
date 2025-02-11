package br.com.fiap.dao;

import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.IdNaoencontradoException;

public interface GenericDao<T, K> {

    T salvar(T entidade);

    void remover(K id) throws IdNaoencontradoException;

    T buscar(K id) throws IdNaoencontradoException;

    void commit() throws CommitException;



}
