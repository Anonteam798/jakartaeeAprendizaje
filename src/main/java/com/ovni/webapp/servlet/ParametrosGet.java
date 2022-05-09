
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
@WebServlet("/parametros")
public class ParametrosGet extends  HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String nombre = req.getParameter("nombre");
        
        /*Aplicando mas parametros*/
        String apellido = req.getParameter("apellido");
        
        PrintWriter writer = resp.getWriter();
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("    <head>");
        writer.println("        <meta charset=\"UTF-8\">");
        writer.println("        <title>Ovni page</title>");
        writer.println("    </head>");
        writer.println("    <body>");
        writer.println("        <h1>Bienvenido: </h1>");
        writer.println("        <h1>Mr "+ nombre + " " +apellido+ "</h1>");
        
        try {
            int codigo = Integer.parseInt(req.getParameter("codigo"));
            writer.println("        <h1>Código: "+codigo+"</h1>");
        } catch (NumberFormatException e) {
            writer.println("        <h1>No inserto un codigo válido</h1>");
        }
      
        writer.println("    </body>");
        
        writer.println("</html>");
    }
    
    
}
