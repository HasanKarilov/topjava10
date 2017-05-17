package ru.javawebinar.topjava.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hanaria on 5/17/17.
 */
public class UserServlet extends HttpServlet {

    /*
    По умолчанию в адрес "/" будет показывать страницу index.html
    А наш сервлет делает mapping адреса "/users"
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/users.jsp").forward(request, response);
    }
}
