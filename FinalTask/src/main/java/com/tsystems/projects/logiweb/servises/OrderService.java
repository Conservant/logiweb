package com.tsystems.projects.logiweb.servises;

import com.tsystems.projects.logiweb.DAO.OrderDAO;
import com.tsystems.projects.logiweb.DAO.TruckDAO;
import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.entities.Order;
import com.tsystems.projects.logiweb.entities.Truck;
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
        orderDAO.start();
        List<Order> resultList = orderDAO.getAll("Orders");
        orderDAO.stop();
        List<OrderDTO> orders = new ArrayList<OrderDTO>();
        for (Order order: resultList) {
            orders.add(new OrderDTO(order));
        }
        return orders;
    }

    public List<OrderDTO> getOrders(OrderStatus status) {
        orderDAO.start();
        List<Order> resultList = orderDAO.getOrdersByStatus(status);
        orderDAO.stop();
        List<OrderDTO> orders = new ArrayList<OrderDTO>();
        System.out.println("service" + resultList.size());
        for (Order order: resultList) {
            orders.add(new OrderDTO(order));
            System.out.println(order);
        }
        return orders;
    }

    public OrderDTO addOrder() {
        Order order = new Order();
        order.setStatus(OrderStatus.CREATED);
        order.setTruck(null);
        orderDAO.start();
        order = orderDAO.add(order);
        orderDAO.stop();
        OrderDTO dto = new OrderDTO();
        dto.setUniqueNumber(Long.toString(order.getId()));
        return dto;
    }

    public boolean changeStatus(String[] uniqueNumber, OrderStatus status) {
        System.out.println(status);
        for (String str : uniqueNumber) {
            System.out.println(str);
        }
        orderDAO.start();
        for (String order: uniqueNumber) {
            orderDAO.changeStatus(order, status);
        }
        orderDAO.stop();

        return true;
    }

    public OrderDTO addItemToOrder(OrderDTO newOrder) {
        orderDAO.start();
        Order order = orderDAO.getById(Long.parseLong(newOrder.getUniqueNumber()));
        order.setDescription(newOrder.getDescription());
        order.setWeight(newOrder.getWeight());
        order.setLatitude(newOrder.getLatitude());
        order.setLatitude(newOrder.getLongitude());
        order.setStatus(OrderStatus.CONFIRMED);
        orderDAO.update(order);
        newOrder.setUniqueNumber(Long.toString(order.getId()));
        orderDAO.stop();
        return newOrder;
    }

    public boolean assignTruckToOrder(String regNumber, String order) {
        TruckDAO truckDAO = new TruckDAO();
        truckDAO.start();
        Truck truckToAssign = truckDAO.getBy("RegNumber", regNumber);
        truckDAO.stop();
        orderDAO.start();
        orderDAO.updateOrder(truckToAssign, order);
        orderDAO.stop();
        return true;
    }
}
