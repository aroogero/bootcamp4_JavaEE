package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.DBUtil1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/delete-task4")
public class DeleteTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String idt4 = request.getParameter("idt4");
        int id = 1;
        try {
            id = Integer.parseInt(idt4);
        } catch (Exception e) {

        }
        DBUtil1.deleteTask(id);
        response.sendRedirect("/homepage-task4");
    }
}
