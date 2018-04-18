package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get3")
public class Get3Servlet extends HttpServlet {

    /**
     * Servlet prints to web a multiplicaton table for given width and height
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int width = 5;
        int height = 10;
        width = Integer.parseInt(request.getParameter("width"));
        height = Integer.parseInt(request.getParameter("height"));

        int a;
        int b;
        for (a = 1; a <= height; ++a) {
            for (b = 1; b <= width; ++b) {
                response.getWriter().append((a * b) + " ");
            }
            response.getWriter().append("\n");

        }
    }
}
//exaple link
//http://localhost:8080/get3?width=10&height=4