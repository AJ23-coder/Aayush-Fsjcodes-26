package com.example;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/welcome")
public class WelcomeServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String myname = request.getParameter("myname");
        PrintWriter out = response.getWriter();
        out.println("<h1>Welcome " + myname + "</h1>");
    }
}
