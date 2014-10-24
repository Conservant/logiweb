package com.tsystems.projects.logiweb.servises;

import com.tsystems.projects.logiweb.DAO.DriverDAO;
import com.tsystems.projects.logiweb.DTO.DriverDTO;
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

    public List<DriverDTO> getDrivers() {

        List<Driver> driverList = driverDAO.getAll("Drivers");

        List<DriverDTO> drivers = new ArrayList<DriverDTO>();

        for (Driver driver: driverList) {
            drivers.add(new DriverDTO(driver.getName(), driver.getLicenseNumber()));
        }

        return drivers;

    }


    public boolean addDriver(DriverDTO newDriver) {

        if (driverDAO.getBy("LicNumber", newDriver.getLicenseNumber()) != null) {
            return false;
        }

        Driver driver = new Driver();
        driver.setName(newDriver.getName());
        driver.setLicenseNumber(newDriver.getLicenseNumber());

        driverDAO.add(driver);


        return true;
    }
}
