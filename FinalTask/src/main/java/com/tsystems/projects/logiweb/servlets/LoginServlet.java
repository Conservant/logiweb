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

        if (login.equals("manager") && password.equals("123")) {
            HttpSession session = req.getSession(true);
            session.setAttribute("user", "manager");
            getServletContext().getRequestDispatcher("/Manager/index.jsp").forward(req, resp);
        }
        PrintWriter writer = resp.getWriter();
        writer.println("EROR!");
    }
}
