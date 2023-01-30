package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.ClientUser;
import bitlab.bootcamp.chapter5.db.DBUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/homepage")
public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        //Чтобы вывести на главную страницу хоумпэйдж, нам нужно подтянуть эррейлист
        ArrayList<ClientUser> users = DBUtil.getUsers();
        request.setAttribute("polzovateli", users); //выучить код - настроить атрибут. Тут передаем объект(список юзеров) под каким-то специальным ключом. И в jsp чтобы отобразить получим через getAttribute и пишем ключ
        request.getRequestDispatcher("/index.jsp").forward(request, response); //данный метод говорит, какая страница будет сейчас рендерить - отрисовывать его html код
        //важна последовательность. Сначала отправляем данные, потом отрисовываем
    }
}
