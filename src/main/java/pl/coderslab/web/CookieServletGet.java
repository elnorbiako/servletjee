package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getcookie")
public class CookieServletGet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cookieName = "name";
        String cookieValue = "";
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies = request.getCookies()) {
            if(cookieName.equals(c.getName())) {
                cookieValue = c.getValue();
            }

        }
        response.getWriter().append(cookieValue);
    }
}
