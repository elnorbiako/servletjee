package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

@WebServlet("/Servlet16")
public class Servlet16 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //ip address
        String ipAddress = request.getRemoteAddr();
        response.getWriter().append("IP: " + ipAddress + "\n");
        //browser
        String userAgent = request.getHeader("User-Agent");
        response.getWriter().append("Browser: " + userAgent + "\n");
        //local time
        LocalTime localTime = LocalTime.now();
        String time = localTime.toString();
        response.getWriter().append("time: " + time+ "\n");


        Date time2 = new Date();
        response.getWriter().append("time: " + time2);

    }
}
