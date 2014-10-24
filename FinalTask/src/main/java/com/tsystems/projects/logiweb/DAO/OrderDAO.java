package com.tsystems.projects.logiweb.DAO;

import com.tsystems.projects.logiweb.entities.Order;
import com.tsystems.projects.logiweb.entities.Truck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by StarKiller on 18.10.2014.
 *//*
public class OrderDAO {
    private EntityManagerFactory emf;
    private EntityManager em;

    public List<Order> getAllOrders() {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();

        List<Order> orderList = em.createQuery("select ord from Order ord", Order.class).getResultList();

        em.close();
        emf.close();

        return orderList;
    }
}

*/
public class OrderDAO extends AbstractDAO<Order> {

}