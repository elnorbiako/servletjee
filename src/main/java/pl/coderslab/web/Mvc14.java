package pl.coderslab.web;

import pl.coderslab.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Mvc14")
public class Mvc14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int isbn = Integer.parseInt(request.getParameter("isbn"));
        String title2 = request.getParameter("title2");
        String author2 = request.getParameter("author2");
        int isbn2 = Integer.parseInt(request.getParameter("isbn2"));

        Book book = new Book(title,author,isbn);
        Book book2 = new Book(title2,author2,isbn2);

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        request.setAttribute("books", books);

        getServletContext().getRequestDispatcher("/result.jsp")
                .forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter().append("<form method ='post' action = ''>");
        response.getWriter().append("Title: <input type ='text' name ='title'/><br>");
        response.getWriter().append("Author: <input type ='text' name ='author'/><br>");
        response.getWriter().append("Isbn: <input type ='number' name ='isbn'/><br>");
        response.getWriter().append("Title2: <input type ='text' name ='title2'/><br>");
        response.getWriter().append("Author2: <input type ='text' name ='author2'/><br>");
        response.getWriter().append("Isbn2: <input type ='number' name ='isbn2'/><br>");
        response.getWriter().append("<input type ='submit' />");
        response.getWriter().append("</form>");


    }
}
