package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.servises.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by StarKiller on 24.10.2014.
 */
@WebServlet("/Manager/addOrder")
public class AddOrderServlet extends HttpServlet{
    private OrderService service = new OrderService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*OrderDTO orderDTO = new OrderDTO();

        orderDTO.setUniqueNumber(555);

        service.addOrder(orderDTO);*/
        getServletContext().getRequestDispatcher("/Manager/manager.jsp").forward(req, resp);
    }
}
