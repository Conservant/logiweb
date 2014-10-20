package com.tsystems.projects.logiweb.DTO;

import java.util.List;

/**
 * Created by StarKiller on 19.10.2014.
 */
public class DriverResponseDTO {

    List<DriverDTO> drivers;

    public DriverResponseDTO(List<DriverDTO> list) {
        this.drivers = list;
    }

    public List<DriverDTO> getDrivers() {
        return drivers;
    }
}
