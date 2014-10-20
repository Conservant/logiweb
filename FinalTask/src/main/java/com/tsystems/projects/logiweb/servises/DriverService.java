package com.tsystems.projects.logiweb.servises;

import com.tsystems.projects.logiweb.DAO.DriverDAO;
import com.tsystems.projects.logiweb.DTO.DriverDTO;
import com.tsystems.projects.logiweb.DTO.DriverResponseDTO;
import com.tsystems.projects.logiweb.entities.Driver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StarKiller on 19.10.2014.
 */
public class DriverService {
    private DriverDAO driverDAO;

    public DriverService() {
        driverDAO = new DriverDAO();
    }

    public DriverResponseDTO getDrivers() {

        List<Driver> driverList = driverDAO.getAllDrivers();

        List<DriverDTO> resultList = new ArrayList<DriverDTO>();

        for (Driver driver: driverList) {
            resultList.add(new DriverDTO(driver.getName(), driver.getLicenseNumber()));
        }

        return new DriverResponseDTO(resultList);

    }
}
