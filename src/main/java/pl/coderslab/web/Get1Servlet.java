package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class Get1Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       try {
           int start = Integer.parseInt(request.getParameter("start"));
           int end = Integer.parseInt(request.getParameter("end"));

           response.setContentType("text/html");
           for (int i = start; i <= end; i++) {
               response.getWriter().append(i + " ");
           }
       }catch (NumberFormatException ex) {
           response.getWriter().append("Error: " + ex.getMessage());
       }
    }
}
//  example link:
//  http://localhost:8080/get1?start=10&end=25