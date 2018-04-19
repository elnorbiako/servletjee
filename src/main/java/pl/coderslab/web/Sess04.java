package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@WebServlet("/sess04")
public class Sess04 extends HttpServlet {

    public int[] addToProducts(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length +1);
        newArray[array.length] = element;
        return newArray;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String name = request.getParameter("name");
        String qty = request.getParameter("qty");
        String price = request.getParameter("price");

        ArrayList products = new ArrayList<>();
        Collections.addAll(products, name, qty, price);
        HttpSession sess = request.getSession();
        sess.setAttribute("product", products);

        response.getWriter().append(sess.getAttribute("product") +"");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
