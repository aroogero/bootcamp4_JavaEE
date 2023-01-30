package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.lesson1task2DBUtil;
import bitlab.bootcamp.chapter5.db.lesson1task2ListWorkers;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/homepage1")
public class Lesson2ExampleHomePagesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello, My Web App");

        ArrayList<lesson1task2ListWorkers> workers = lesson1task2DBUtil.getWorkers();
        request.setAttribute("polzovatelu", workers); //настроить атрибут. Это для того, чтобы передать список. Передаем этот список под каким-то ключом (сначала пишется ключ, потом, объект или лист, который хотим передать)
        request.getRequestDispatcher("/index1.jsp").forward(request, response); //данный метод говорит какая страница будет сейчас рендерить (), генерировать html. Грубо говоря, выбирать ту страницу (html страницу), в нашем случае jsp страницу (где находится html код), который будет рендерить, отрисовывать его html код
        //Говорим, ты index.jsp ты будешь за меня отрисовывать и .-кой говорим иди гуляй
        System.out.println("This is my Home page");
    }
}
