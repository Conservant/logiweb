package com.tsystems.projects.logiweb.DTO;

import com.tsystems.projects.logiweb.entities.enums.Capacity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckRequestDTO {
    private Set<String> RequestedIds = new HashSet<String>();
    private String regNubmer;
    private int requiredNumberOfDriver;
    private Capacity capacity;

    public Set<String> getRequestedIds() {
        return RequestedIds;
    }

    public String getRegNubmer() {
        return regNubmer;
    }

    public void setRegNubmer(String regNubmer) {
        this.regNubmer = regNubmer;
    }

    public int getRequiredNumberOfDriver() {
        return requiredNumberOfDriver;
    }

    public void setRequiredNumberOfDriver(int requiredNumberOfDriver) {
        this.requiredNumberOfDriver = requiredNumberOfDriver;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }




}
