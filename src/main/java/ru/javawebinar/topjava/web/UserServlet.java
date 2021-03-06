package ru.javawebinar.topjava.web;

import org.slf4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by hanaria on 5/17/17.
 */
public class UserServlet extends HttpServlet {

    private static final Logger LOG = getLogger(UserServlet.class);

    /*
    По умолчанию в адрес "/" будет показывать страницу index.html
    А наш сервлет делает mapping адреса "/users"
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("redirect to users");
        request.getRequestDispatcher("/users.jsp").forward(request, response);
//        response.sendRedirect("users.jsp");
    }
}