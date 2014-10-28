package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.entities.enums.OrderStatus;
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
@WebServlet("/Manager/closeOrder")
public class CloseOrder extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OrderService service = new OrderService();
        String[] orders = req.getParameterValues("performedOrders[]");
        service.changeStatus(orders, OrderStatus.CLOSED);
        getServletContext().getRequestDispatcher("/Manager/getPerformed").forward(req, resp);
    }
}
