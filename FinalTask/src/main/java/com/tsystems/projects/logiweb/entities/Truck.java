package com.tsystems.projects.logiweb.entities;

import com.tsystems.projects.logiweb.entities.enums.Capacity;

import javax.persistence.*;
import java.util.Set;


/**
 * Created by StarKiller on 16.10.2014.
 */
@Entity
@Table(name="truck")
@NamedQueries( {
        @NamedQuery(name = "getAllTrucks", query = "select t from Truck t"),
        @NamedQuery(name = "getByRegNumber", query = "select t from Truck t where t.regNumber=:uniqName")
})
public class Truck {
    @Id
    @GeneratedValue
    private long id;


    @Column(name="REGNUMBER")
    private String regNumber;

    @Column(name = "REQUIREDNUMBEROFDRIVERS")
    private int requiredNumberOfDrivers;

    @Column(name = "CAPACITY")
    @Enumerated(EnumType.STRING)
    private Capacity capacity;

    @OneToOne(mappedBy = "truck", fetch = FetchType.EAGER)
    private Order order= null;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "truck")
    private Set<Driver> drivers;

    public Truck() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getRequiredNumberOfDrivers() {
        return requiredNumberOfDrivers;
    }

    public void setRequiredNumberOfDrivers(int requiredNumberOfDrivers) {
        this.requiredNumberOfDrivers = requiredNumberOfDrivers;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", regNumber='" + regNumber + '\'' +
                ", requiredNumberOfDrivers=" + requiredNumberOfDrivers +
                ", capacity=" + capacity;
    }


}
