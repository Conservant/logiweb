package com.tsystems.projects.logiweb.entities;

import com.tsystems.projects.logiweb.entities.enums.DriverStatus;

import javax.persistence.*;

/**
 * Created by StarKiller on 19.10.2014.
 */
@Entity
@Table(name = "driver")
@NamedQueries({
        @NamedQuery(name = "getAllDrivers", query = "select d from Driver d"),
        @NamedQuery(name = "getByLicNumber", query = "select d from Driver d where d.licenseNumber=:uniqName"),
        @NamedQuery(name = "getByStatus", query = "select d from Driver d where d.status=:status")
})
public class Driver {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LICENSE_NUMBER")
    private String licenseNumber;

    @Column(name = "DRIVER_STATUS")
    @Enumerated(EnumType.STRING)
    private DriverStatus status;

    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "TRUCK_ID")
    private Truck truck;

    public Driver() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public DriverStatus getStatus() {
        return status;
    }

    public void setStatus(DriverStatus status) {
        this.status = status;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }
}
