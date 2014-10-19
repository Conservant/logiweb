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
 */
public class OrderDAO {
    private EntityManagerFactory emf;
    private EntityManager em;


    //
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("logiwebPU");


        EntityManager entityManager = emf.createEntityManager();

        Order order = entityManager.find(Order.class, 2L);

        Truck truck = order.getTruck();

        System.out.println(order);
        System.out.println(truck);

        entityManager.close();
        emf.close();
    }

    public List<Order> getAllOrders() {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();

        List<Order> orderList = em.createQuery("select ord from Order ord", Order.class).getResultList();







//                "SELECT unique_number as ORDERS, status as STATUS, truck.regnumber as FURA FROM Order o" +
//                "left JOIN truck tr" +
//                "ON tr.id = o.id", Order.class).getResultList();

        em.close();
        emf.close();

        return orderList;

    }



    


}
