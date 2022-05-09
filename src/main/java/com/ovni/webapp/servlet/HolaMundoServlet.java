package com.ovni.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author h4ck3r
 */
@WebServlet("/ovni")
public class HolaMundoServlet extends HttpServlet {
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("    <head>");
        writer.println("        <meta charset=\"UTF-8\">");
        writer.println("        <title>Primer Servlet</title>");
        writer.println("    </head>");
        writer.println("    <body>");
        writer.println("        <h1>Primer servlet :V </h1>");
        writer.println("    </body>");

        writer.println("</html>");

    }

}
