package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/sess05")
public class Sess05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, NullPointerException, IOException {

        // get from session result, A, B and checks if its ok - with message
        HttpSession sess = request.getSession();

        int captchaResult = Integer.parseInt(request.getParameter("captchaRes"));

        sess.setAttribute("captcha", captchaResult );

        int sum = (int) sess.getAttribute("captcha");
        int a = (int) sess.getAttribute("numA");
        int b = (int) sess.getAttribute("numB");


        if  (sum == a + b) {
            response.getWriter().append("Sum OK");
        } else {
            response.getWriter().append("Nope...");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //two random numbers for captcha - save them to session
        Random rndNumber= new Random();
        int a = rndNumber.nextInt(100);
        int b = rndNumber.nextInt(100);

        HttpSession sess = request.getSession();
        sess.setAttribute("numA", a );
        sess.setAttribute("numB", b );



        //form for name, email and to put sum
        response.setContentType("text/html");
        response.getWriter().append("<form method ='post' action = ''>");
        response.getWriter().append("First Name: <input type ='text' name ='firstName'/><br>");
        response.getWriter().append("Last Name: <input type ='text' name ='lastName'/><br>");
        response.getWriter().append("Email: <input type ='text' name ='email'/><br>");
        response.getWriter().append("'<h3>Please sum those numbers: " + a + " + " + b + " = </h3>");
        response.getWriter().append(" <input type ='number' name ='captchaRes'/><br>");

        response.getWriter().append("<input type ='submit' />");
        response.getWriter().append("</form>");





    }
}
