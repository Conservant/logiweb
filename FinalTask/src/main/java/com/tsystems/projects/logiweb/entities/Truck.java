package com.tsystems.projects.logiweb.entities;

import javax.persistence.*;

/**
 * Created by StarKiller on 16.10.2014.
 */
@Entity
@Table(name="truck")
public class Truck {
    @Id @GeneratedValue
    private long id;
    @Column(name="regNumber")
    private String regNumber;
    @Column(name="mandatoryDriverAmount")
    private int mandatoryDriverAmount;
    @OneToOne
    @JoinColumn(name="capacity_id")
    private Capacity capacity;

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

    public int getMandatoryDriverAmount() {
        return mandatoryDriverAmount;
    }

    public void setMandatoryDriverAmount(int mandatoryDriverAmount) {
        this.mandatoryDriverAmount = mandatoryDriverAmount;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return
                id + ": " + regNumber;

    }
}
