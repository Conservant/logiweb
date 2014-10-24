package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.DriverDTO;
import com.tsystems.projects.logiweb.servises.DriverService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class DriverServlet extends HttpServlet{

    static DriverService service = new DriverService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<DriverDTO> driverDTOList = service.getDrivers();

        req.setAttribute("drivers", driverDTOList);

        getServletContext().getRequestDispatcher("/getDrivers.jsp").forward(req, resp);

    }
}
