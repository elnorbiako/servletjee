package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/Get5")
public class Get5Servlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String company = request.getParameter("company");
        String[] language = request.getParameterValues("learn");
        response.setContentType("text/html");

        response.getWriter().append("Company : <br>" + " -" + company + "<br>" );
        response.getWriter().append("Learn <br>");

        for (String s: language) {
            response.getWriter().append(" -" + s);
            response.getWriter().append("<br>");
        }

    }
}