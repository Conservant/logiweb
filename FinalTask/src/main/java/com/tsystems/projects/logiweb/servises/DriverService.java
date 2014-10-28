package com.tsystems.projects.logiweb.servises;

import com.tsystems.projects.logiweb.DAO.DriverDAO;
import com.tsystems.projects.logiweb.DTO.DriverDTO;
import com.tsystems.projects.logiweb.entities.Driver;
import com.tsystems.projects.logiweb.entities.enums.DriverStatus;

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
        driverDAO.start();
        List<Driver> driverList = driverDAO.getAll("Drivers");
        List<DriverDTO> drivers = new ArrayList<DriverDTO>();
        for (Driver driver: driverList) {
            drivers.add(new DriverDTO(driver.getName(), driver.getLicenseNumber(), driver.getStatus()));
        }
        driverDAO.stop();
        return drivers;


    }


    public boolean addDriver(DriverDTO newDriver) {
        driverDAO.start();
        if (driverDAO.getBy("LicNumber", newDriver.getLicenseNumber()) != null) {
            return false;
        }
        Driver driver = new Driver();
        driver.setName(newDriver.getName());
        driver.setLicenseNumber(newDriver.getLicenseNumber());
        driver.setStatus(DriverStatus.FREE);

        driverDAO.add(driver);
        driverDAO.stop();
        return true;
    }

    public List<DriverDTO> getFreeDrivers() {
        driverDAO.start();
        List<Driver> freeDrivers = driverDAO.getFreeDrivers();
        List<DriverDTO> dto = new ArrayList<DriverDTO>();
        for (Driver d: freeDrivers) {
            DriverDTO driver  = new DriverDTO();
            driver.setLicenseNumber(d.getLicenseNumber());
            dto.add(driver);
        }
        return dto;

    }
}