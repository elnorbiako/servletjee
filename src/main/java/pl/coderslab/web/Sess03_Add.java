package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/addToSession")
public class Sess03_Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("key");
        String value = request.getParameter("value");

        HttpSession sess = request.getSession();
        sess.setAttribute(name, value );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().append("<form action= '' method='POST'>\n" +
                "    <label>\n" +
                "        Key:\n" +
                "        <input type=\"text\" name=\"key\">\n" +
                "    </label>\n" +
                "    <label>\n" +
                "        Value:\n" +
                "        <input type=\"text\" name=\"value\">\n" +
                "    </label>\n" +
                "    <input type=\"submit\">\n");
        response.getWriter().append("</form>");




    }
}
