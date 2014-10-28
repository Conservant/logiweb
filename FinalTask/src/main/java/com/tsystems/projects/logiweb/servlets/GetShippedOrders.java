package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.DriverDTO;
import com.tsystems.projects.logiweb.DTO.OrderDTO;
import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.entities.enums.OrderStatus;
import com.tsystems.projects.logiweb.servises.DriverService;
import com.tsystems.projects.logiweb.servises.OrderService;
import com.tsystems.projects.logiweb.servises.TruckService;

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
//отгруженнные заказы но без водителя
    @WebServlet("/Manager/getShipped")
public class GetShippedOrders extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OrderService service = new OrderService();
        List<OrderDTO> orders = service.getOrders(OrderStatus.SHIPPED);
        System.out.println("-----");
        System.out.println(orders);
        DriverService driverService = new DriverService();
        List<DriverDTO> drivers = driverService.getFreeDrivers();

        req.setAttribute("shipped_orders", orders);
        req.setAttribute("free_drivers", drivers);

        getServletContext().getRequestDispatcher("/Manager/assignDrivers.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
