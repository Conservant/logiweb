package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.servises.TruckService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class TruckServlet extends HttpServlet {
    private TruckService service = new TruckService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String user = (String)req.getSession().getAttribute("user");

        if (user == null) {

            System.out.println("User = null");
            
            PrintWriter writer = resp.getWriter();

            resp.sendRedirect("EROR@2");

        }

        List<TruckDTO> list = service.getTrucks();

        req.setAttribute("trucks", list);

        getServletContext().getRequestDispatcher("/getTrucks.jsp").forward(req, resp);
    }
}
