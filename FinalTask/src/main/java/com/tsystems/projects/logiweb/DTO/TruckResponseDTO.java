package com.tsystems.projects.logiweb.DTO;

import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckResponseDTO {
    private List<TruckDTO> trucks;

    public TruckResponseDTO(List<TruckDTO> trucks) {

        this.trucks = trucks;

    }


    public List<TruckDTO> getTrucks() {
        return trucks;
    }
}
