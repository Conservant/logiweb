package com.tsystems.projects.logiweb.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by StarKiller on 24.10.2014.
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        HttpSession session;

        if (login.equals("manager") && password.equals("123")) {
            session = req.getSession(true);
            session.setAttribute("user", "manager");
            req.getServletContext().getRequestDispatcher("/Manager/manager.jsp").forward(req, resp);
        }
        if (login.equals("driver") && password.equals("456")) {
            session = req.getSession(true);
            session.setAttribute("user", "driver");
            req.getServletContext().getRequestDispatcher("/Driver/driver.html").forward(req, resp);
        }


        req.getSession().setAttribute("message", "Пользователь не найден");
        req.getServletContext().getRequestDispatcher("/errorpage.jsp").forward(req, resp);
    }

}

