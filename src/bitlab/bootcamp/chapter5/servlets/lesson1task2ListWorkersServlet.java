package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.lesson1task2DBUtil;
import bitlab.bootcamp.chapter5.db.lesson1task2ListWorkers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value="/list_workers")  //endpoint
public class lesson1task2ListWorkersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        ArrayList<lesson1task2ListWorkers> workers = lesson1task2DBUtil.getWorkers(); //вызываем метод - подтягиваем всех работников

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<h1>COMPLETE FORM</h1>");
        out.print("<form action = '/add-worker' method = 'get'>"); //action это куда идти. Отправь меня на ссылку result. В этой задаче, все данные отправляет в әдд уоркер, там создает объект и уходит в ЛистУоркерс
        out.print("<p> NAME : </p><input type = 'text' name = 'worker_name'>"); //name это ключи под которым отправляем куда-то обрабатывать. В нашем случае это в массив сохраняет
        out.print("<p> SURNAME : </p><input type = 'text' name = 'worker_surname'>");
        out.print("<p> DEPARTMENT : </p><input type = 'text' name = 'worker_department'>");
        out.print("<p> SALARY : </p><input type = 'text' name = 'worker_salary'>");
        out.print("<button>SEND</button>");
        out.print("</form>");


        out.print("<hr>");
        out.print("<br>");

        out.print("<table cellpadding = '10'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("<th>DEPARTMENT</th>");
        out.print("<th>SALARY</th>");
        out.print("</tr>");
        out.print("</thead>");
        out.print("<tbody>");
        for (lesson1task2ListWorkers worker : workers) {
            out.print("<tr>");
            out.print("<td>" + worker.getName() + "</td>");
            out.print("<td>" + worker.getSurname() + "</td>");
            out.print("<td>" + worker.getDepartment() + "</td>");
            out.print("<td>" + worker.getSalary() + "</td>");
            out.print("</tr>");
        }
        out.print("</tbody>");
        out.close();
    }
}
