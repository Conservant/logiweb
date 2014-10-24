package com.tsystems.projects.logiweb.servises;

import com.tsystems.projects.logiweb.DAO.OrderDAO;
import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.entities.Order;
import com.tsystems.projects.logiweb.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StarKiller on 18.10.2014.
 */
public class OrderService {
    private OrderDAO orderDAO;

    public OrderService() {
        orderDAO = new OrderDAO();
    }

    public List<OrderDTO> getOrders() {

        List<Order> resultList = orderDAO.getAll("Orders");

        List<OrderDTO> orders = new ArrayList<OrderDTO>();

        for (Order order: resultList) {

            orders.add(new OrderDTO(order));

        }

         return orders;

    }

    public boolean addOrder(OrderDTO newOrder) {

        if (orderDAO.getBy("UniqueNumber", ""+newOrder.getUniqueNumber()) != null) {
            return false;
        }

        Order order = new Order();
        order.setUniqueNumber(newOrder.getUniqueNumber());
        order.setStatus(OrderStatus.CREATED);

        orderDAO.add(order);
        return true;
    }


}
