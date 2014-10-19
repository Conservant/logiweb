package com.tsystems.projects.logiweb.DTO;

import java.util.List;

/**
 * Created by StarKiller on 18.10.2014.
 */
public class OrderResponseDTO {
    List<OrderDTO> orders;

    public OrderResponseDTO(List<OrderDTO> list) {
        this.orders = list;
    }

    public List<OrderDTO> getOrders() {
        return orders;
    }
}
