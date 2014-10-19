package com.tsystems.projects.logiweb.DAO;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.tsystems.projects.logiweb.entities.Truck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckDAO {

    private EntityManagerFactory emf;
    private EntityManager em;


    public TruckDAO() { }

    public List<Truck> getAllTrucks() {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();
        List<Truck> resultList = em.createQuery("SELECT t FROM Truck t", Truck.class).getResultList();

        em.close();
        emf.close();

        return resultList;
    }

    public void addTruck(Truck newTruck) {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(newTruck);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
