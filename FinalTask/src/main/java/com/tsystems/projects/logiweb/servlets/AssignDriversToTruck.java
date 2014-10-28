package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.DriverDTO;
import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.servises.TruckService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by StarKiller on 25.10.2014.
 */
@WebServlet("/Manager/assignDrivers")
public class AssignDriversToTruck extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String order = req.getParameter("order");
        String[] drivers = req.getParameterValues("drivers[]");
        TruckService service = new TruckService();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setUniqueNumber(order);
        List<DriverDTO> driverDTOs = new ArrayList<DriverDTO>();
        for (String dr: drivers) {
            DriverDTO newDriver = new DriverDTO();
            newDriver.setLicenseNumber(dr);
            driverDTOs.add(newDriver);
        }


        service.assignDriversToTruck(order, driverDTOs);
        getServletContext().getRequestDispatcher("/Manager/getShipped").forward(req, resp);
    }
}
