package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.ClientTask;
import bitlab.bootcamp.chapter5.db.DBUtil1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/add-task4")
public class AddTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        String opisanie = request.getParameter("user_opisanie");
        String deadline = request.getParameter("user_deadline");

        ClientTask task = new ClientTask();
        task.setName(name);
        task.setOpisanie(opisanie);
        task.setDeadline(deadline);
        task.setYesNo("Нет");

        DBUtil1.addTask(task);
        response.sendRedirect("/");
    }

}
