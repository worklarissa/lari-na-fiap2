package br.com.fiap.dao;

import br.com.fiap.entity.Investimento;

import javax.persistence.EntityManager;

public class InvestimentoDaoImpl extends GenericDaoImpl<Investimento, Integer> implements InvestimentoDao{

    public InvestimentoDaoImpl(EntityManager em) {
        super(em);
    }
}
