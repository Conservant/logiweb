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
        @NamedQuery(name = "getByUniqueNumber", query = "select o from Order o where o.id=:uniqName")
})

public class Order {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="STATUS")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="TRUCK_ID", nullable = true)
    private Truck truck;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "WEIGHT")
    private double weight;

    @Column(name = "GPS_LATITUDE")
    private double latitude;

    @Column(name = "GPS_LONGITUDE")
    private double longitude;

    public Order() {
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

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
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
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                ", truck" + truck;
    }
}
