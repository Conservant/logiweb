package com.tsystems.projects.logiweb.servises;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.tsystems.projects.logiweb.DAO.TruckDAO;
import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.DTO.TruckRequestDTO;
import com.tsystems.projects.logiweb.DTO.TruckResponseDTO;
import com.tsystems.projects.logiweb.entities.Truck;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckService {

    private TruckDAO truckDAO;

    public TruckService() {
        truckDAO = new TruckDAO();
    }


    public TruckResponseDTO getTrucks() {

        List<Truck> resultList = truckDAO.getAllTrucks();

        List<TruckDTO> trucks = new ArrayList<TruckDTO>();

        for(Truck truck: resultList) {

            trucks.add(new TruckDTO(truck));
        }

        return new TruckResponseDTO(trucks);

    }

    public void addTruck(TruckDTO truckDTO) {


        Truck truck = new Truck();
        truck.setRegNumber(truckDTO.getRegNumber());
        truck.setRequiredNumberOfDrivers(truckDTO.getRequiredCountOfDrivers());
        truck.setCapacity(truckDTO.getCapacity());

        truckDAO.addTruck(truck);

    }
}
