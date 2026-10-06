package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Get Connection 
            Connection conn = DriverManager.getConnection("jdbc:mysql://root@localhost:3307/userauth","root","aayush@jha");
            // Create Statements 
            Statement stmt = conn.createStatement();
            // Run Query
            // Select Statements
            ResultSet rs = stmt.executeQuery("SELECT * FROM `users` WHERE `email` = '"+email+"' AND `password` = '"+password+"'");

            if(rs.next()){
                // Login User
                HttpSession session = request.getSession();
                session.setAttribute("username", rs.getString("name"));
                session.setAttribute("useremail", rs.getString("email"));
                response.sendRedirect("dashboard.jsp");
            }else{
                // Incorrect Credentials
                response.sendRedirect("login.jsp?message=Incorrect Credentials");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
