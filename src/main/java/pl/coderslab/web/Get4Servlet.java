package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet("/get4")
public class Get4Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int param = Integer.parseInt(request.getParameter("number"));

        response.getWriter().append("Number: " + param + "\n");

        ArrayList wholeDividers = new ArrayList<>();
        for (int i=1; i<=param; i++) {
            if (param%i == 0) {
                wholeDividers.add(i);
            }

        }
        response.getWriter().append("Whole number dividers" + wholeDividers.toString());

    }
}
