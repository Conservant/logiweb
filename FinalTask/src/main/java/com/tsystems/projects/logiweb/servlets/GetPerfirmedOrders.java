package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.entities.enums.OrderStatus;
import com.tsystems.projects.logiweb.servises.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 25.10.2014.
 */

//выполненные заказы, т.е. те которые можно закрыть
@WebServlet("/Manager/getPerformed")
public class GetPerfirmedOrders extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OrderService service = new OrderService();
        List<OrderDTO> orders = service.getOrders(OrderStatus.PERFORMED);
        req.setAttribute("perf_orders", orders);
        getServletContext().getRequestDispatcher("/Manager/closeOrder.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
