package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.model.ClientTask;
import bitlab.bootcamp.chapter5.db.DBManager_Sprint1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/details-task4")
public class Details_Sprint1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String idt4 = request.getParameter("idt4");
        int id = 1;
        try {
            id = Integer.parseInt(idt4);
        } catch (Exception e) {

        }
        ClientTask task = DBManager_Sprint1.getTask(id);
        request.setAttribute("onetask", task);
        request.getRequestDispatcher("/details-task4.jsp").forward(request,response);
    }
}

