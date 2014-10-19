package com.tsystems.projects.logiweb.servlets;

import com.tsystems.projects.logiweb.DTO.TruckDTO;
import com.tsystems.projects.logiweb.DTO.TruckRequestDTO;
import com.tsystems.projects.logiweb.DTO.TruckResponseDTO;
import com.tsystems.projects.logiweb.servises.TruckService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by StarKiller on 17.10.2014.
 */
public class DriverServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        System.out.println("Был выбран раздел водятелы");

    }




}
