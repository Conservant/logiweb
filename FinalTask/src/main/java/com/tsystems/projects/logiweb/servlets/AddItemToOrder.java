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
 * Created by StarKiller on 25.10.2014.
 */
@WebServlet("/Manager/addItemToOrder")
public class AddItemToOrder extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OrderDTO order = new OrderDTO();
        order.setDescription(req.getParameter("description"));
        order.setWeight(Double.parseDouble(req.getParameter("weight")));
        order.setLatitude(Double.parseDouble(req.getParameter("latitude")));
        order.setLongitude(Double.parseDouble(req.getParameter("longitude")));
        order.setUniqueNumber(req.getParameter("order"));

        OrderService service = new OrderService();
        order = service.addItemToOrder(order);

        req.setAttribute("order_number", order);

        getServletContext().getRequestDispatcher("/Manager/newOrderItem.jsp").forward(req, resp);



    }
}
