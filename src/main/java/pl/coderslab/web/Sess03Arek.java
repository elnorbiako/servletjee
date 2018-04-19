package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Sess03Arek")
public class Sess03Arek extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");

        HttpSession session = request.getSession();
        session.setAttribute(key, value);

        List<String> keys = (List<String>) session.getAttribute("keys");

        if(keys == null) {
            keys = new ArrayList<>();
        }
        keys.add(key);
        session.setAttribute("keys", keys);
    }

}
