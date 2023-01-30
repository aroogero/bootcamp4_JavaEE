package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<h1>COMPLETE FORM</h1>");
        out.print("<form action = 'result' method = 'get'>"); //action это куда идти. Отправь меня на ссылку result
        out.print("<span> YOUR NAME : </span><input type = 'text' name = 'user_name'>"); //name это ключи под которым отправляем куда-то обрабатывать
        out.print("<span> YOUR AGE : </span>");
        out.print("<select name = 'user_age'>");
        for (int i = 1; i <= 100; i++) {
            out.print("<option>" + i + "</option>");
        }
        out.print("<select>");
        out.print("<button>SEND</button>");
        out.print("</form>");

        out.close();
    }
}
