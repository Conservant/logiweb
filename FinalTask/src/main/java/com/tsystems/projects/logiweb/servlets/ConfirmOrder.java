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
@WebServlet("/Manager/confirmOrder")
public class ConfirmOrder extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String order = req.getParameter("orderNumber");
        String msg;

        if (order == null) {
            msg = "Не указан номер заказа";
            req.setAttribute("msg", msg);
            getServletContext().getRequestDispatcher("/Manager/newOrderItem").forward(req, resp);
        }

        String[] orders = {order};
        OrderService service = new OrderService();
        service.changeStatus(orders, OrderStatus.CONFIRMED);

        msg = "Заказ подтвержден";
        req.setAttribute("msg", msg);
        getServletContext().getRequestDispatcher("/Manager/newOrderItem.jsp").forward(req, resp);
    }
}
