package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (value="/task3")
public class Lesson1task3ZapolnenieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = 'result_task3' method = 'get'>"); //action это куда идти. Отправь меня на ссылку result
        out.print("<p><span>NAME : </span><input type = 'text' name = 'user_name'></p>"); //name это ключи под которым отправляем куда-то обрабатывать
        out.print("<p><span>SURNAME : </span><input type = 'text' name = 'user_surname'></p>");
        out.print("<button>SEND</button>");
        out.print("</form>");

        out.close();

        //response.sendRedirect("/result_task3");

    }
}
