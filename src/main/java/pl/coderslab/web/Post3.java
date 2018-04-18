package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/post3")
public class Post3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String sA = request.getParameter("a");
    String sB= request.getParameter("b");
    String sC= request.getParameter("c");

    int a = Integer.parseInt(sA);
    int b = Integer.parseInt(sB);
    int c = Integer.parseInt(sC);

        try {

            double x1, x2, x0, delta;

            delta = b*b - 4*a*c;

            if(delta>0) //jeśli delta jest większa od 0 to mamy dwa miejsca zerowe
            {
                delta = Math.sqrt(delta); //wyznaczamy pieriwastek z delty
                x1 = (-b - delta)/(2*a);
                x2 = (-b + delta)/(2*a);
                response.getWriter().append("Są dwa pierwiastki równania: " + x1 + " oraz " + x2);
            }
            else if (delta==0)
            {
                x0 = -b/(2*a);
                response.getWriter().append("Jest jeden pierwiastek równania: " + x0);
            }
            else
                response.getWriter().append("Brak pierwiastków");

        } catch (ArithmeticException e) {
            response.getWriter().append("Niestety, dzielenie przez zero. Nieładnie.");
        } catch (Exception e) {
            response.getWriter().append("error: " + e.getMessage());

         }
    }
}



