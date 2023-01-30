package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/result_task6")
public class Lesson1task6ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullname = request.getParameter("user_fullname");
        int point = Integer.parseInt(request.getParameter("user_point"));

        if (point >=90) {
            out.print("<h1>" + fullname + " got \"A\" for exam!");
        } else if (point >= 75 && point < 90 ) {
            out.print("<h1>" + fullname + " got \"B\" for exam!");
        } else if (point >= 60 && point < 75) {
            out.print("<h1>" + fullname + " got \"C\" for exam!");
        } else if (point >= 50 && point < 60) {
            out.print("<h1>" + fullname + " got \"D\" for exam!");
        } else {
            out.print("<h1>" + fullname + " got \"F\" for exam!");
        }
    }
}
