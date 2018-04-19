package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/grades")
public class Sess02 extends HttpServlet {

    public int[] addToGrades(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length +1);
        newArray[array.length] = element;
        return newArray;
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sess = request.getSession();

        int grade = Integer.parseInt(request.getParameter("grade"));
        int[] grades = (int[]) sess.getAttribute("grades");

        if(grades ==null) {
            grades = new int[] {grade};
        } else {
            grades = addToGrades(grades, grade);
        }
        sess.setAttribute("grades", grades);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().append("<form method ='post'>");
        response.getWriter().append("<input type ='text' name ='grade'/>");
        response.getWriter().append("<input type ='submit' />");
        response.getWriter().append("</form>");
        HttpSession sess = request.getSession();
        int[] grades = (int[]) sess.getAttribute("grades");
        if (grades!=null) {
            response.getWriter().append(Arrays.toString(grades));
        }
    }

    public double countAvg(int[] array){
        double sum = Arrays.stream(array).sum();
        return sum/array.length;
    }
}
