package com.tsystems.projects.logiweb.servlets;



import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.DTO.OrderResponseDTO;
import com.tsystems.projects.logiweb.servises.OrderService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class OrderServlet extends HttpServlet {

    static OrderService service = new OrderService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OrderResponseDTO orders = service.getOrders();

        List<OrderDTO> orderDTOList = orders.getOrders();

        req.setAttribute("orders", orderDTOList);

        getServletContext().getRequestDispatcher("/getOrders.jsp").forward(req, resp);
    }

}
