package com.tsystems.projects.logiweb.DTO;

import com.tsystems.projects.logiweb.entities.Order;
import com.tsystems.projects.logiweb.entities.enums.OrderStatus;

/**
 * Created by StarKiller on 18.10.2014.
 */
public class OrderDTO {
    private String uniqueNumber;
    private OrderStatus orderStatus;
    private String regNumber;
    private String description;
    private double weight;
    private double latitude;
    private double longitude;

    public OrderDTO() {
    }

    public OrderDTO(String uniqueNumber, OrderStatus orderStatus, String regNumber) {
        this.uniqueNumber = uniqueNumber;
        this.orderStatus = orderStatus;
        this.regNumber = (regNumber == null)?"---":regNumber;
    }

    public OrderDTO(Order order) {
        this.uniqueNumber = Long.toString(order.getId());
        this.orderStatus = order.getStatus();
        try {
            this.regNumber = order.getTruck().getRegNumber();
        } catch (NullPointerException e) {
            this.regNumber = "---";
        }

        this.description = order.getDescription();
        this.weight = order.getWeight();
        this.latitude = order.getLatitude();
        this.longitude = order.getLongitude();

    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return uniqueNumber + " : " + orderStatus + " : " + regNumber;
    }
}
