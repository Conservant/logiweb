package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.entities.enums.Capacity;
import com.tsystems.projects.logiweb.servises.TruckService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by StarKiller on 19.10.2014.
 */
@WebServlet("/Manager/addTruck")
public class AddTruckServlet extends HttpServlet{

    TruckService service = new TruckService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        TruckDTO newTruck= new TruckDTO();

        newTruck.setRegNumber(req.getParameter("regNumber"));
        newTruck.setRequiredCountOfDrivers(Integer.parseInt(req.getParameter("amountOfDrivers")));
        newTruck.setCapacity(Capacity.valueOf(req.getParameter("capacity")));


        boolean b = service.addTruck(newTruck);

        if (b) {
            getServletContext().getRequestDispatcher("/Manager/getTrucks").forward(req, resp);
        }

        PrintWriter writer = resp.getWriter();
        writer.println("}{ER BAM");

        //getServletContext().getRequestDispatcher("/Manager/index.jsp").forward(req, resp);
    }
}
