package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.ClientTask;
import bitlab.bootcamp.chapter5.db.DBUtil1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/homepage-task4")
public class HomePageTask4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        ArrayList<ClientTask> tasks = DBUtil1.getAllTasks(); //чтобы вывести на homepage подтягиваем все объекты ArrayList-a
        request.setAttribute("spisok", tasks); //передаем список под ключом
        request.getRequestDispatcher("/homepage-task4.jsp").forward(request, response); //отрисовывает вот эта страница, туда передаем


    }
}
