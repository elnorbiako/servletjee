package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Mvc12")
public class Mvc12 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int start = Integer.parseInt(request.getParameter("start"));
        int end = Integer.parseInt(request.getParameter("end"));

        int startPlus = start+10;
        int endPlus = end+10;

        request.setAttribute("start", startPlus);
        request.setAttribute("end", endPlus);

        getServletContext().getRequestDispatcher("/jsp2mvc.jsp")
                .forward(request, response);

    }
}
