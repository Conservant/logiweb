package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.DTO.TruckRequestDTO;
import com.tsystems.projects.logiweb.DTO.TruckResponseDTO;
import com.tsystems.projects.logiweb.entities.enums.Capacity;
import com.tsystems.projects.logiweb.servises.TruckService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckServlet extends HttpServlet {
    TruckRequestDTO reqDTO;
    static private TruckService service = new TruckService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        reqDTO = new TruckRequestDTO();

        TruckResponseDTO trucks = service.getTrucks(reqDTO);

        List<TruckDTO> list = trucks.getTrucks();

        req.setAttribute("trucks", list);

        getServletContext().getRequestDispatcher("/Manager.jsp").forward(req, resp);
    }



/*
    public static void main(String[] args) {



        TruckRequestDTO reqDTO = new TruckRequestDTO();


        TruckResponseDTO trucks = service.getTrucks(reqDTO);

        List<TruckDTO> list = trucks.getTrucks();

        for(TruckDTO truck: list) {
            System.out.println(truck);
        }


        TruckDTO newTruck = new TruckDTO("e555ay10", 2, Capacity.SMALL);

        //вставка нового грузовичка

            service.addTruck(newTruck);

            System.out.println("такой грузовичок уже есть в БД");




        System.out.println("***********************");

        trucks = service.getTrucks(reqDTO);

        list = trucks.getTrucks();

        for(TruckDTO truck: list) {
            System.out.println(truck);
        }


    }*/
}
