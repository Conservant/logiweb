package com.tsystems.projects.logiweb.DAO;

import com.tsystems.projects.logiweb.entities.Order;
import com.tsystems.projects.logiweb.entities.Truck;
import com.tsystems.projects.logiweb.entities.enums.OrderStatus;

import javax.persistence.*;
import java.util.List;

/**
 * Created by StarKiller on 18.10.2014.
 */
public class OrderDAO extends AbstractDAO<Order> {


    public List<Order> getOrdersByStatus(OrderStatus orderStatus) {
        System.out.println(orderStatus);
        Query q = em.createQuery("select o from Order o where o.status=:orderStatus", Order.class);
        q.setParameter("orderStatus", orderStatus);
        List<Order> resList = q.getResultList();
        System.out.println("Ssa");
        for (Order ord : resList) {
            System.out.println(ord);
        }
        return resList;
    }

    public Order changeStatus(String uniqNumber, OrderStatus status) {
        Order ord = getById(Long.parseLong(uniqNumber));
        ord.setStatus(status);
        em.getTransaction().begin();
        em.persist(ord);
        em.flush();
        em.getTransaction().commit();
        return ord;
    }


    public Order getById(Long id) {
        return em.find(Order.class, id);
    }


    public Order updateOrder(Truck truck, String order) {
        Order ord = em.find(Order.class, Long.parseLong(order));
        ord.setTruck(truck);
        ord.setStatus(OrderStatus.SHIPPED);
        em.getTransaction().begin();
        em.merge(ord);
        em.flush();
        em.getTransaction().commit();
        return ord;
    }

}