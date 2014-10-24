package com.tsystems.projects.logiweb.servises;


import com.tsystems.projects.logiweb.DAO.TruckDAO;
import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.entities.Truck;

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

        List<Truck> resultList = truckDAO.getAll("Trucks");
        List<TruckDTO> trucks = new ArrayList<TruckDTO>();

        for(Truck truck: resultList) {
            trucks.add(new TruckDTO(truck));
        }

        return trucks;

    }

    public boolean addTruck(TruckDTO truckDTO) {

        if (truckDAO.getBy("RegNumber", truckDTO.getRegNumber()) != null){
            return false;
        }

        Truck truck = new Truck();

        truck.setRegNumber(truckDTO.getRegNumber());
        truck.setRequiredNumberOfDrivers(truckDTO.getRequiredCountOfDrivers());
        truck.setCapacity(truckDTO.getCapacity());

        truckDAO.add(truck);

        return true;

    }
}
