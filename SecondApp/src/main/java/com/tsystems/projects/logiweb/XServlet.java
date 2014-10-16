package com.tsystems.projects.logiweb;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by StarKiller on 15.10.2014.
 */
public class XServlet extends HttpServlet {

    List<User> list = new ArrayList<User>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        list.add(new User(name, surname));

        req.getSession().setAttribute("list", list);

        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);


    }
}
