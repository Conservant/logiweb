package com.tsystems.projects.logiweb.servlets;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by StarKiller on 24.10.2014.
 */

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter is working.");
    }

    @Override
    public void destroy() {

    }
}
