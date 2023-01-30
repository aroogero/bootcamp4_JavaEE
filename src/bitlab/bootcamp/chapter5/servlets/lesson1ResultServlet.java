package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (value="/result1")
public class lesson1ResultServlet extends HttpServlet { //название класса никакой роли не играет.Тут самое главное должна быть ссылка WebServlet

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
//мы хотим обработать параметры - Это user_name и user_age
        String name = request.getParameter("user_name"); //вот такой у request есть гетПараметр, который считывает значение value по названию name
        String age = request.getParameter("user_age");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>YOUR NAME IS "+name+ " AND YOU ARE "+age+" YEARS OLD!</h1>");
    }
}
