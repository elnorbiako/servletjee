package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/getses")
public class Sess01Get extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        if(sess.getAttribute("counter") != null) {

            int counter = (int) sess.getAttribute("counter");
            response.getWriter().append(counter + "");
            counter++;
            sess.setAttribute("counter", counter);
        } else {
            response.getWriter().append("No attribute.");
        }
    }
}
// Spradzić w repo Arka, bo nie mam uzupełnionego pierwszego i trzeciego