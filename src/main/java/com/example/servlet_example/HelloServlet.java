package com.example.servlet_example;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = "World";

        if (request.getQueryString() != null) {
            message = request.getQueryString();
        }
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello, " + message + "!</h1>");
        out.println("</body></html>");
    }
}