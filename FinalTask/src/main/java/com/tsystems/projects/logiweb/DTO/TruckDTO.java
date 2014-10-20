package com.tsystems.projects.logiweb.DTO;

import com.tsystems.projects.logiweb.entities.Truck;
import com.tsystems.projects.logiweb.entities.enums.Capacity;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckDTO {
    private String regNumber;
    private int requiredCountOfDrivers;
    private Capacity capacity;

    public TruckDTO() {
    }

    public TruckDTO(Truck truck) {

        this.regNumber = truck.getRegNumber();
        this.requiredCountOfDrivers = truck.getRequiredNumberOfDrivers();
        this.capacity = truck.getCapacity();

    }

    public TruckDTO(String regNumber, int requiredCountOfDrivers, Capacity capacity) {
        this.regNumber = regNumber;
        this.requiredCountOfDrivers = requiredCountOfDrivers;
        this.capacity = capacity;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getRequiredCountOfDrivers() {
        return requiredCountOfDrivers;
    }

    public void setRequiredCountOfDrivers(int requiredCountOfDrivers) {
        this.requiredCountOfDrivers = requiredCountOfDrivers;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return regNumber + " : " + requiredCountOfDrivers + " : " + capacity;
    }
}
