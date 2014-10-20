package com.tsystems.projects.logiweb.DTO;

import javax.lang.model.element.Name;

/**
 * Created by StarKiller on 19.10.2014.
 */
public class DriverDTO {
    private String name;
    private String licenseNumber;

    public DriverDTO() {
    }

    public DriverDTO(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
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
}
