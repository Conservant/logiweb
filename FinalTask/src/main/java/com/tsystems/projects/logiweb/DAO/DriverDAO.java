package com.tsystems.projects.logiweb.DAO;

import com.tsystems.projects.logiweb.entities.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by StarKiller on 19.10.2014.
 *//*
public class DriverDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public List<Driver> getAll() {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();

        List<Driver> drivers = em.createNamedQuery("findAllDrivers").getResultList();

        em.close();
        emf.close();

        return drivers;
    }
/*
    public Driver add(Driver newDriver) {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();

        em.createQuery("select d from Dri");

        em.close();
        emf.close();


    }

    public Driver getByLicNumber(String licNumber) {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();

        em.

        em.close();
        emf.close();

    }

}
*/

public class DriverDAO extends AbstractDAO<Driver> {
//    emf =
//    em = emf.createEntityManager();
/*

    @Override
    public List<Driver> getAll(String entities) {
        return super.getAll(entities);
    }

    @Override
    public Driver getByUniqName(String uniqName) {
        return super.getByUniqName(uniqName);
    }*/
}
