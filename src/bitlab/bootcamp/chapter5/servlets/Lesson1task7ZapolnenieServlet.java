package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/task7")
public class Lesson1task7ZapolnenieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<form action = 'result_list_task7' method='get'");
        out.print("<span>NAME : </span> <input type ='text' placeholder = 'Insert name' name = 'user_name'>");
        out.print("<p><span>SURNAME : </span> <input type ='text' placeholder = 'Insert surname' name = 'user_surname'></p>");
        out.print("<p><span>CLUB : </span> <select name='user_club'>");
        out.print("<option>Barcelona</option>");
        out.print("<option>Real Madrid</option>");
        out.print("<option>Bavaria</option>");
        out.print("<option>Manchester United</option>");
        out.print("<option>Ajax</option>");
        out.print("<option>Juventus</option>");
        out.print("<option>Liverpool</option>");
        out.print("</select></p>");
        out.print("<p><span>SALARY : </span> <input type ='text' placeholder = 'Insert salary' name = 'user_salary'></p>");
        out.print("<p><span>TRANSFER PRICE : </span> <input type ='text' placeholder = 'Insert transfer price' name = 'user_transfer'></p>");
        out.print("<p><button style='background-color: blue; color: yellow'>ADD FOOTBALLER </button></p>");
        out.print("</form>");
    }
}
