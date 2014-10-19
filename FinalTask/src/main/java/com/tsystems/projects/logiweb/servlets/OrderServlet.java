package com.tsystems.projects.logiweb.servlets;



import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.DTO.OrderResponseDTO;
import com.tsystems.projects.logiweb.servises.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class OrderServlet extends HttpServlet {

    static OrderService service = new OrderService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("Был выбран раздел заказы");

    }

    public static void main(String[] args) {

        OrderResponseDTO orders = service.getOrders();

        List<OrderDTO> list = orders.getOrders();

        for (OrderDTO orderDTO: list) {
            System.out.println(orderDTO);
        }

//        TruckResponseDTO trucks = service.getTrucks(reqDTO);
//
//        List<TruckDTO> list = trucks.getTrucks();
//
//        for(TruckDTO truck: list) {
//            System.out.println(truck);
//        }


    }
}
