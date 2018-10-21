package com.mrhmt.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtils {
    private DBUtils() {

    }

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManager getEntityManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("MacShop-PU");

        return entityManagerFactory.createEntityManager();
    }
}
