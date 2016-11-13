package ru.self.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Andrew on 13.11.2016.
 */
public class First extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("nick", "revers");
        req.setAttribute("xuy", "true");
        req.getRequestDispatcher("WEB-INF/jsps/ab.jsp").forward(req, resp);
    }
}
