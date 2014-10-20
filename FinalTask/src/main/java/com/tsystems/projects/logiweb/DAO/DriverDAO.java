package com.tsystems.projects.logiweb.DAO;

import com.tsystems.projects.logiweb.entities.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by StarKiller on 19.10.2014.
 */
public class DriverDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public List<Driver> getAllDrivers() {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();

        List<Driver> drivers = em.createQuery("select d from Driver d", Driver.class).getResultList();

        em.close();
        emf.close();


        return drivers;

    }
}
