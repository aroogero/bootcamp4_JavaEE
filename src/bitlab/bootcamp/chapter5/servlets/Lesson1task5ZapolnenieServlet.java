package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/task5")
public class Lesson1task5ZapolnenieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = 'result_task5' method='get'");
        out.print("<p><span> FULL NAME : </span><input type = 'text' name = 'user_fullname'></p>"); //name это ключи под которым отправляем куда-то обрабатывать
        out.print("<span> AGE : </span>");
        out.print("<select name = 'user_age'>");
        for (int i = 1; i <= 100; i++) {
            out.print("<option>"+i+"</option>");
        }
        out.print("<p><span> GENDER: </span></p>");
        out.print("<p><span>GENDER :  </span><input type='radio' name='user_choice' value='male'>male</p>");
        out.print("<p><input type='radio' name='user_choice' value='female'>female</p>");
        out.print("<button>SEND</button>");
        out.print("<form");

        out.close();
    }
}
