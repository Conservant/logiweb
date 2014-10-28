package com.tsystems.projects.logiweb.DAO;

import com.tsystems.projects.logiweb.entities.Driver;
import com.tsystems.projects.logiweb.entities.Truck;
import com.tsystems.projects.logiweb.entities.enums.DriverStatus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */

public class TruckDAO extends AbstractDAO<Truck> {

    public List<Truck> getFree() {
        List<Truck> trucks = em.createQuery("select t from Truck t", Truck.class).getResultList();
        List<Truck> resList = new ArrayList<Truck>();
        for(Truck truck: trucks){
            System.out.println(truck.getOrder());
            if (truck.getOrder() == null) {
                resList.add(truck);
            }
        }
        return resList;
    }

    public List<Truck> getTrucksWithoutDrivers() {
        List<Truck> trucks = em.createQuery("select t from Truck t where t.drivers.size=0").getResultList();
        return trucks;
    }

    public void assignDriversToTruck(Truck truck, List<Driver> driverList) {

        for (Driver dr: driverList) {
            em.getTransaction().begin();

            //Driver driver = em.find(Driver.class, dr.getId());
            dr.setStatus(DriverStatus.ON_ROUTE);
            dr.setTruck(truck);
            System.out.println("---------");
            System.out.println(truck);
            System.out.println("__________");
            em.merge(dr);
            em.flush();
            em.getTransaction().commit();
            em.clear();
        }

    }
}