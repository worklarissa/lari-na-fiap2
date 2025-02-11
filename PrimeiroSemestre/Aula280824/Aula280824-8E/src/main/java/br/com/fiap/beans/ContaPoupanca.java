package br.com.fiap.beans;

import br.com.fiap.exception.SaldoInsufienteException;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

    private float taxa;
    public static final float RENDIMENTO = 0.05f;

    public ContaPoupanca() {}


    public ContaPoupanca(int numero, int agencia, Calendar dataAbertura, double saldo, float taxa) {
        super(numero, agencia, dataAbertura, saldo);
        this.taxa = taxa;
    }

    public double calculaRetornoInvestimento() {
        return saldo * RENDIMENTO;
    }

    @Override
    public void retirar(double valor) throws SaldoInsufienteException{
        if ( saldo < valor + taxa) {
            throw new SaldoInsufienteException(saldo);
        }
        saldo -= valor + taxa;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
}
