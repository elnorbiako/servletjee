package pl.coderslab.web;

import pl.coderslab.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Mvc13")
public class Mvc13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int isbn = Integer.parseInt(request.getParameter("isbn"));

        Book book = new Book(title,author,isbn);

        request.setAttribute("book", book);

        getServletContext().getRequestDispatcher("/result.jsp")
                .forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html");
        response.getWriter().append("<form method ='post' action = ''>");
        response.getWriter().append("Title: <input type ='text' name ='title'/><br>");
        response.getWriter().append("Author: <input type ='text' name ='author'/><br>");
        response.getWriter().append("Isbn: <input type ='number' name ='isbn'/><br>");
        response.getWriter().append("<input type ='submit' />");
        response.getWriter().append("</form>");

    }
}
