package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/task6")
public class Lesson1task6ZapolnenieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = 'result_task6' method='get'");
        out.print("<p><span> FULL NAME : </span><input type ='text' name='user_fullname'");
        out.print("<p><span> EXAM POINTS : </span></p>");
        out.print("<select name = 'user_point'");
        for (int i = 0; i <= 100; i++) {
            out.print("<option>"+i+"</option>");
        }
        out.print("</select>");
        out.print("<p><button>SUBMIT EXAM</button></p>");
        out.print("</form>");

        out.close();
    }
}
