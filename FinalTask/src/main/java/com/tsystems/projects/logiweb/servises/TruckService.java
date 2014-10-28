package com.tsystems.projects.logiweb.servises;


import com.tsystems.projects.logiweb.DAO.DriverDAO;
import com.tsystems.projects.logiweb.DAO.OrderDAO;
import com.tsystems.projects.logiweb.DAO.TruckDAO;
import com.tsystems.projects.logiweb.DTO.DriverDTO;
import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.entities.Driver;
import com.tsystems.projects.logiweb.entities.Order;
import com.tsystems.projects.logiweb.entities.Truck;
import com.tsystems.projects.logiweb.entities.enums.DriverStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckService {

    private TruckDAO truckDAO;

    public TruckService() {
        truckDAO = new TruckDAO();
    }

    public List<TruckDTO> getTrucks() {
        truckDAO.start();
        List<Truck> resultList = truckDAO.getAll("Trucks");
        truckDAO.stop();
        List<TruckDTO> trucks = new ArrayList<TruckDTO>();
        for(Truck truck: resultList) {
            trucks.add(new TruckDTO(truck));
        }
        return trucks;
    }

    public boolean addTruck(TruckDTO truckDTO) {
        truckDAO.start();
        if (truckDAO.getBy("RegNumber", truckDTO.getRegNumber()) != null){
            return false;
        }
        Truck truck = new Truck();
        truck.setRegNumber(truckDTO.getRegNumber());
        truck.setRequiredNumberOfDrivers(truckDTO.getRequiredCountOfDrivers());
        truck.setCapacity(truckDTO.getCapacity());

        truckDAO.add(truck);
        truckDAO.stop();
        return true;
    }

    public List<TruckDTO> getFree() {
        truckDAO.start();
        List<Truck> freeTrucks = truckDAO.getFree();
        truckDAO.stop();
        List<TruckDTO> dto = new ArrayList<TruckDTO>();
        for(Truck truck: freeTrucks) {
            TruckDTO tr = new TruckDTO();
            tr.setRegNumber(truck.getRegNumber());
            dto.add(tr);
        }
        return dto;
    }

    public List<TruckDTO> getTruckWithoutDriver() {
        truckDAO.start();
        List<Truck> trucksWithoutDrivers = truckDAO.getTrucksWithoutDrivers();
        List<TruckDTO> dto = new ArrayList<TruckDTO>();
        for(Truck truck: trucksWithoutDrivers) {
            TruckDTO tr = new TruckDTO();
            tr.setRegNumber(truck.getRegNumber());
            dto.add(tr);
        }
        return dto;
    }

    public boolean assignDriversToTruck(String order, List<DriverDTO> driverDTOs){
        OrderDAO orderDAO = new OrderDAO();
        orderDAO.start();
        Order byId = orderDAO.getById(Long.parseLong(order));
        orderDAO.stop();
        Truck truck = byId.getTruck();
        System.out.println("SSSSSSSS");
        System.out.println(truck);
        System.out.println("SSSSSSSS");
        if (truck.getRequiredNumberOfDrivers() != driverDTOs.size()) {
            return false;
        }

        DriverDAO dao = new DriverDAO();
        List<Driver> driverList = new ArrayList<Driver>();

        for (DriverDTO dto: driverDTOs) {
            dao.start();
            Driver dr = dao.getBy("LicNumber", dto.getLicenseNumber());
            driverList.add(dr);
            dao.stop();
        }
        truckDAO.assignDriversToTruck(truck, driverList);


        return true;

    }
}
