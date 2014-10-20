package com.tsystems.projects.logiweb.DTO;

import com.tsystems.projects.logiweb.entities.Order;
import com.tsystems.projects.logiweb.entities.enums.OrderStatus;

/**
 * Created by StarKiller on 18.10.2014.
 */
public class OrderDTO {
    private int uniqueNumber;
    private OrderStatus orderStatus;
    private String regNumber;

    public OrderDTO(int uniqueNumber, OrderStatus orderStatus, String regNumber) {
        this.uniqueNumber = uniqueNumber;
        this.orderStatus = orderStatus;
        this.regNumber = (regNumber == null)?"---":regNumber;
    }

    public OrderDTO(Order order) {
        this.uniqueNumber = order.getUniqueNumber();
        this.orderStatus = order.getStatus();
        try {
            this.regNumber = order.getTruck().getRegNumber();
        } catch (NullPointerException e) {
            this.regNumber = "---";
        }

    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return uniqueNumber + " : " + orderStatus + " : " + regNumber;
    }
}
