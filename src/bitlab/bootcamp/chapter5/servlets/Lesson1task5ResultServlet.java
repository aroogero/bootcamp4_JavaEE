package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/result_task5")
public class Lesson1task5ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullname = request.getParameter("user_fullname");
        int age = Integer.parseInt(request.getParameter("user_age"));
        String gender = request.getParameter("user_choice");

        if (age >= 18 && gender.equals("male")) {
            out.print("<h1>Hello Dear Mister " + fullname + "!</p>");
        } else if (age >= 18 && gender.equals("female")) {
            out.print("<h1> Hello Dear Miss " + fullname + "!</p>");
        } else if (age < 18 && gender.equals("female")) {
            out.print("<h1> Hello Dude Miss " + fullname + "!</p>");
        } else if (age < 18 && gender.equals("male")) {
            out.print("<h1> Hello Dude Mister " + fullname + "!</p>");
        }
    }
}
