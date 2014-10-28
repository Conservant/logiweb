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
@WebServlet("/Manager/newOrder")
public class NewOrder extends HttpServlet{
    private OrderService service = new OrderService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet adding...");
        OrderDTO dto = service.addOrder();
        String msg = "Создан заказ № " + dto.getUniqueNumber();
        System.out.println(msg);
        req.getSession().setAttribute("msg", msg);
        getServletContext().getRequestDispatcher("/Manager/newOrder.jsp").forward(req, resp);
    }
}
