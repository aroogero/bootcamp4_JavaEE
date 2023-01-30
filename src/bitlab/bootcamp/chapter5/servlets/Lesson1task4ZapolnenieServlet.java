package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/task4")
public class Lesson1task4ZapolnenieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = 'result_task4' method = 'get'>"); //action это куда идти. Отправь меня на ссылку result
        out.print("<p><span>NAME : </span><input type = 'text' name = 'user_name'></p>"); //name это ключи под которым отправляем куда-то обрабатывать
        out.print("<p><span>SURNAME : </span><input type = 'text' name = 'user_surname'></p>");
        out.print("<p><span>FOOD : </span></p>");
        out.print("<select name='user_food'>");
        out.print("<option> Fried shrimp - 5 350 tg </option>");
        out.print("<option> Chinese beefsteak - 3 700 tg </option>");
        out.print("<option> Pineapple fish - 9 650 tg </option>");
        out.print("<option> Van-se soup - 4 800 tg </option>");
        out.print("<option> Vegetarian salad - 2 250 tg </option>");
        out.print("<option> Baked octopus - 6 950 tg </option>");
        out.print("</select>");
        out.print("<button>ORDER</button>");
        out.print("</form>");

        out.close();
    }
}
