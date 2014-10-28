package com.tsystems.projects.logiweb.DTO;

import com.tsystems.projects.logiweb.entities.enums.DriverStatus;

import javax.lang.model.element.Name;

/**
 * Created by StarKiller on 19.10.2014.
 */
public class DriverDTO {
    private String name;
    private String licenseNumber;
    private DriverStatus status;

    public DriverDTO() {
    }

    public DriverDTO(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public DriverDTO(String name, String licenseNumber, DriverStatus status) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.status = status;
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
}
