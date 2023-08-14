package com.example.jweb_start.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "loginBanking", value = "/loginBanking")
public class LoginBanking extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("admin") && password.equals("admin")) {
            req.getRequestDispatcher("homepage.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("login-err.jsp").forward(req, resp);
        }

    }
}
