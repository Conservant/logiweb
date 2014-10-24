package com.tsystems.projects.logiweb.entities;

import com.tsystems.projects.logiweb.entities.enums.OrderStatus;

import javax.persistence.*;

/**
 * Created by StarKiller on 18.10.2014.
 */
@Entity
@Table(name="zakaz")
@NamedQueries({
        @NamedQuery(name = "getAllOrders", query = "select o from Order o"),
        @NamedQuery(name = "getByUniqueNumber", query = "select o from Order o where o.uniqueNumber=:uniqName")
})

public class Order {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="UNIQUE_NUMBER")
    private int uniqueNumber;

    @Column(name="STATUS")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="TRUCK_ID")
    private Truck truck;

    public Order() {
    }

    public Order(int uniqueNumber, OrderStatus status) {
        this.uniqueNumber = uniqueNumber;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", uniqueNumber=" + uniqueNumber +
                ", status=" + status
                ;
    }
}
