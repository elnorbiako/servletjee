package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/sess06")
public class Sess06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession sess = request.getSession();
        response.setContentType("text/html");

        int a = (int) sess.getAttribute("numA");
        int b = (int) sess.getAttribute("numB");

        int add = Integer.parseInt(request.getParameter("addResult"));
        int sub = Integer.parseInt(request.getParameter("subResult"));
        int mul = Integer.parseInt(request.getParameter("mulResult"));

        boolean adding = false;
        boolean subs = false;
        boolean multiply = false;

        if(a+b == add) { adding=true;}
        if(a-b == sub) { subs=true;}
        if(a*b == mul) { multiply=true;}

        response.getWriter().append(a +" + " + b + " = " + add + " " + adding + "<br>");
        response.getWriter().append(a +" - " + b + " = " + sub + " " + subs + "<br>");
        response.getWriter().append(a +" * " + b + " = " + mul + " " + multiply + "<br>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random rndNumber= new Random();
        int a = rndNumber.nextInt(980)+20;
        int b = rndNumber.nextInt(980)+20;

        HttpSession sess = request.getSession();
        sess.setAttribute("numA", a );
        sess.setAttribute("numB", b );



        //form for adding result of adding, substract and multiply
        response.setContentType("text/html");
        response.getWriter().append("<form method ='post' action = ''>");
        response.getWriter().append("<h3>Given numbers: " + a + ", " + b + " </h3>");

        response.getWriter().append("Add: <input type ='number' name ='addResult'/><br>");
        response.getWriter().append("Subtract: <input type ='number' name ='subResult'/><br>");
        response.getWriter().append("Multiply: <input type ='number' name ='mulResult'/><br>");
        response.getWriter().append("<input type ='submit' />");
        response.getWriter().append("</form>");



    }
}
