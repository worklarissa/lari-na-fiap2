package br.com.fiap.main;

import br.com.fiap.beans.Caminhao;
import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Moto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro cr = new Carro();
        cr.setNome("Civic G6");
        cr.printNome();
        cr.identifica();
        cr.printTipo();

        Moto m = new Moto();
        m.setNome("FAN 160");
        m.printNome();
        m.identifica();
        m.printTipo();

        Caminhao cm = new Caminhao();
        cm.setNome("Super 460 R 6X2");
        cm.printNome();
        cm.identifica();
        cm.printTipo();
    }
}