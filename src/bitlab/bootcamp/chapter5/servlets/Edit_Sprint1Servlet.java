package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.model.ClientTask;
import bitlab.bootcamp.chapter5.db.DBManager_Sprint1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/edit-task4")
public class Edit_Sprint1Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String idt4 = request.getParameter("idt4");
        int id = Integer.parseInt(idt4);
        ClientTask task = DBManager_Sprint1.getTask(id);

        int idd = Integer.parseInt(request.getParameter("user_id"));
        String name = request.getParameter("user_reName");
        String opisanie = request.getParameter("user_reOpisanie");
        String deadline = request.getParameter("user_reDeadline");
        String yesNo = request.getParameter("user_reYesNo");

        task.setName(name);
        task.setOpisanie(opisanie);
        task.setDeadline(deadline);
        task.setYesNo(yesNo);
//        DBUtil_Sprint1.editTask(id,name,opisanie,deadline,yesNo);
        response.sendRedirect("/homepage-task4");
    }
}
