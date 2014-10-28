package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.servises.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by StarKiller on 25.10.2014.
 */
@WebServlet("/Manager/shipOrder")
public class ShipOrder extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String truck = req.getParameter("truck");
        String order = req.getParameter("order");
        OrderService service = new OrderService();
        service.assignTruckToOrder(truck, order);
        getServletContext().getRequestDispatcher("/Manager/getShipped").forward(req, resp);
    }
}
