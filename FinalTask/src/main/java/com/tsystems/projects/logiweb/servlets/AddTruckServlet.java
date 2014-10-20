package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.DTO.TruckResponseDTO;
import com.tsystems.projects.logiweb.entities.enums.Capacity;
import com.tsystems.projects.logiweb.servises.TruckService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 19.10.2014.
 */
public class AddTruckServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String regNumber = req.getParameter("regNumber");
        int amountOfDrivers = Integer.parseInt(req.getParameter("amountOfDrivers"));
        Capacity capacity = Capacity.valueOf(req.getParameter("capacity"));

        TruckService service = new TruckService();

        TruckDTO newTruck= new TruckDTO();

        newTruck.setRegNumber(regNumber);
        newTruck.setRequiredCountOfDrivers(amountOfDrivers);
        newTruck.setCapacity(capacity);


        service.addTruck(newTruck);

        TruckResponseDTO trucks = service.getTrucks();

        List<TruckDTO> list = trucks.getTrucks();

        req.setAttribute("trucks", list);

        getServletContext().getRequestDispatcher("/getTrucks.jsp").forward(req, resp);

    }
//
//    public static void main(String[] args) {
//
//
//        String regNumber = "E954KX98";
//        int amountOfDrivers = 2;
//        Capacity capacity = Capacity.SMALL;
//
//        TruckService service = new TruckService();
//
//        TruckDTO newTruck= new TruckDTO(regNumber, amountOfDrivers, capacity);
//
//        service.addTruck(newTruck);
//
//        TruckResponseDTO trucks = service.getTrucks();
//
//        List<TruckDTO> list = trucks.getTrucks();
//
//        for(TruckDTO truck: list) {
//            System.out.println(truck);
//        }
//
//
//    }
}
