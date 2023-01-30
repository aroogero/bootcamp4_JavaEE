package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.Lesson1task7DBManager;
import bitlab.bootcamp.chapter5.db.Lesson1task7Footballer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value="/result_list_task7")
public class Lesson1task7ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ArrayList<Lesson1task7Footballer> footballer = Lesson1task7DBManager.getFootballers(); //вызываем метод, который возвращает нам объект

        String name = request.getParameter("user_name");
        String surname = request.getParameter("user_surname");
        String club = request.getParameter("user_club");
        int salary = Integer.parseInt(request.getParameter("user_salary"));
        int transfer = Integer.parseInt(request.getParameter("user_transfer"));

        Lesson1task7Footballer footballers = new Lesson1task7Footballer();
        footballers.setName(name);
        footballers.setSurname(surname);
        footballers.setClub(club);
        footballers.setSalary(salary);
        footballers.setTransfer(transfer);

        Lesson1task7DBManager.addFootballer(footballers); //метод әдд уоркер берет и закидывает уоркера в эррейлист

        for (Lesson1task7Footballer football : footballer) {
            out.print("<p> <h1 style='color: green'>" + football.getName() + " " + football.getSurname() + "</h1></p>");
            out.print("<p> <h3 style = 'color: blue; '> Club : " + football.getClub() + "</h3></p>");
            out.print("<p> <h3 style = 'color: red; '> Salary : " + football.getSalary() + " EUR </h3></p>");
            out.print("<p><h3 style = 'color: red; '> Transfer price : " + football.getTransfer() + " EUR </h3></p>");
            out.print("<br><br>");
        }
        out.print("<p><a href = '/task7' class = 'btn' style='background-color: blue; color: yellow'>ADD FOOTBALLER </a></p>");
    }
}
