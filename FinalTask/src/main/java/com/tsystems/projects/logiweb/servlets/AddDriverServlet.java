package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.DriverDTO;
import com.tsystems.projects.logiweb.servises.DriverService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by StarKiller on 24.10.2014.
 */
@WebServlet("/Manager/addDriver")
public class AddDriverServlet extends HttpServlet{
    DriverService service = new DriverService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DriverDTO driver = new DriverDTO(req.getParameter("name"), req.getParameter("licNumber"));

        boolean b = service.addDriver(driver);

        if (b) {
            getServletContext().getRequestDispatcher("/Manager/getDrivers").forward(req, resp);
        }

        PrintWriter writer = resp.getWriter();
        writer.println("}{ER BAM");
    }
}
