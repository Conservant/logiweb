package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.servises.TruckService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
@WebServlet("/Manager/getTrucks")
public class AllTrucks extends HttpServlet {

    private TruckService service = new TruckService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<TruckDTO> list = service.getTrucks();
        req.setAttribute("trucks", list);
        getServletContext().getRequestDispatcher("/Manager/getTrucks.jsp").forward(req, resp);
    }
}
