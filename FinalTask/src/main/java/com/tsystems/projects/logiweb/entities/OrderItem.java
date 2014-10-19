package com.tsystems.projects.logiweb.entities;

import com.tsystems.projects.logiweb.entities.enums.OrderStatus;

import javax.persistence.*;

/**
 * Created by StarKiller on 19.10.2014.
 */
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "ORDER_STATUS")
    private OrderStatus status;

    @OneToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    public OrderItem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
