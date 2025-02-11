package br.com.fiap.beans;

import br.com.fiap.exception.SaldoInsufienteException;

import java.util.Calendar;

public class ContaCorrente extends Conta {

     private TipoConta tipo;

    public ContaCorrente() {}

    public ContaCorrente(int numero, int agencia, Calendar dataAbertura, double saldo, TipoConta tipo) {
        super(numero, agencia, dataAbertura, saldo);
        this.tipo = tipo;
    }

    @Override
    public void retirar(double valor) throws SaldoInsufienteException{
        if (tipo == TipoConta.COMUM && valor > saldo) {
            throw new SaldoInsufienteException(saldo);
        }
        saldo -= valor;
    }

    public Tipoconta getTipo() {
        return tipo;
    }

    public void setTipo(Tipoconta tipo) {
        this.tipo = tipo;
    }
}
