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
public class NewDriver extends HttpServlet{
    DriverService service = new DriverService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("firstName") + " " + req.getParameter("lastName");
        String licNumber = req.getParameter("licNumber");
        DriverDTO driver = new DriverDTO(name, licNumber);
        boolean b = service.addDriver(driver);
        if (b) {
            getServletContext().getRequestDispatcher("/Manager/newDriver.jsp").forward(req, resp);
        }
        PrintWriter writer = resp.getWriter();
        writer.println("}{ER BAM");
    }
}
