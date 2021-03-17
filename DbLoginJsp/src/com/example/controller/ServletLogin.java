package com.example.controller;

import com.example.model.LoginDA;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletLogin")
public class ServletLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //step2
        LoginDA loginDA = new LoginDA();
        loginDA.setUsername(username);
        loginDA.setPassword(password);
        try {
            loginDA.createConnection();
            boolean status = loginDA.checkLoginStatement(username,password);
            HttpSession session  = request.getSession();
            if (status){
                //step3
                session.setAttribute("bean",loginDA);
                response.sendRedirect("admin.jsp");
            }else {
                response.sendRedirect("index.jsp");
            }
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
