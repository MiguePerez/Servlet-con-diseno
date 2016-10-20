 //Primer   Servlet.
//Muy   sencillo.
package servletHTML;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class ServletHolaMundo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        try (PrintWriter out = new PrintWriter(res.getOutputStream())) {
            out.println("<html>");
            out.println("<head><title>HolaMundoServlet</title>"
                    + "<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\"/>"
                    + "</head><body><h1>Hola   Mundo   desde   el   servidor WEB<h1>\n");
        }
    }

    @Override
    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}
