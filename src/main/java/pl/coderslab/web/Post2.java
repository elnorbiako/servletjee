package pl.coderslab.web;


import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


@WebServlet("/post2")
public class Post2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String message = request.getParameter("message");
        String confirm = request.getParameter("confirm");
        List<String> list = Arrays.asList((new String[]{"dupa","dupa2"}));

        if (confirm==null) {
            String censored ="";
            String[] words = message.split(" ");
            for (String word: words) {
                if (list.contains(word)) {
                    //cenzura
                    censored += StringUtils.repeat('*', word.length());
                } else {
                    censored += word + " ";
                }
                //prztwarzanie

            }
            response.getWriter().append(censored);
        } else {

            response.getWriter().append(message);
        }
    }

}
