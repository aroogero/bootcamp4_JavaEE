package bitlab.bootcamp.chapter5.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/task1")
public class lesson1task1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest requense,
                         HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        for (int i = 0; i < 10; i++) {
            out.print("<h1>HELLO BITLAB</h1>");
        }
    }
}
