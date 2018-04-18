package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@WebServlet("/post4")
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] params = request.getParameterValues("numbers");

        response.getWriter().append(Arrays.toString(params));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Random rand = new Random();

        int  n = rand.nextInt(5) + 5;

        response.setContentType("text/html");

        response.getWriter().append("<form action='' method='post'>");

        for (int i = 1; i < n; i++) {
            response.getWriter().append("<input name='numbers'/><br/>");
        }
        response.getWriter().append("<input type='submit'/>\n" + "</form>");

    }
}
