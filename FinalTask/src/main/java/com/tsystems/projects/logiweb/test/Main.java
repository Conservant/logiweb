package com.tsystems.projects.logiweb.test;



import com.tsystems.projects.logiweb.entities.Capacity;
import com.tsystems.projects.logiweb.entities.Truck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by StarKiller on 16.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logiwebPU");

        EntityManager em = emf.createEntityManager();

//        Truck tr = Main.getTruck();
//
//        em.getTransaction().begin();
//
//
//
//        em.persist(tr);
//
//        em.getTransaction().commit();

        Capacity capacity = getCapacity();

        em.getTransaction().begin();

        em.persist(capacity);

        em.getTransaction().commit();


        em.close();

        emf.close();




/*
        List<Driver> drivers = em.createQuery("select d from Driver d", Driver.class).getResultList();

        for (Driver d: drivers) {
            System.out.println(d);
        }*/

    }

    static Truck getTruck() {
        Truck tr = new Truck();
        tr.setId(5);
        tr.setMandatoryDriverAmount(3);
        tr.setRegNumber("H410EK77");
        //tr.setCapacity(Capacity.);
        return tr;
    }

    static Capacity getCapacity() {
        Capacity cap = new Capacity();
        cap.setName("Overlord");
        cap.setDescription("till 50 ton");
        return cap;
    }



}
