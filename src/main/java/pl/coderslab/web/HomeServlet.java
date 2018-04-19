package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int a = Integer.parseInt(request.getParameter("a"));
//        int b = Integer.parseInt(request.getParameter("b"));
//        int c = a*b;
//        request.setAttribute("c",c);

        List<Product> list = new ArrayList<>();
        list.add(new Product("prod1",1));
        list.add(new Product("prod2",2));
        list.add(new Product("prod3",3));
        list.add(new Product("prod4",4));
        list.add(new Product("prod5",5));

        request.setAttribute("productList", list);

        getServletContext().getRequestDispatcher("/index.jsp")
                .forward(request, response);
    }
}
