package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie4show")
public class Cookie4Show extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        String cookieName = "";
        String cookieValue = "";
        Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies = request.getCookies()) {
            cookieValue = c.getValue();
            cookieName = c.getName();
            response.getWriter().append(cookieName + " " + cookieValue + "<br>");
            response.getWriter().append("<a href='//localhost:8080/cookie4del?name=" + cookieName +"'>Delete " +cookieName + "</a> <br>");
        }
    }
}
