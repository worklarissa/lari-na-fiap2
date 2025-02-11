package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

    //1-Atributo estatico que armazena a única instância
    private static EntityManagerFactory unico;

    //2-Construtor privado //new EntityManagerFactorySingleton()
    private EntityManagerFactorySingleton() {}

    public static EntityManagerFactory getInstance(){
        if(unico == null)
            unico = Persistence.createEntityManagerFactory("ClIENTE_ORACLE");
        return unico;
    }

}
