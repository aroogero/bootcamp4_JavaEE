package bitlab.bootcamp.chapter5.servlets.workwithClient;

import bitlab.bootcamp.chapter5.db.model.ClientUser;
import bitlab.bootcamp.chapter5.db.DBUtil;
import bitlab.bootcamp.chapter5.db.mySql.DBManager1_jdbc;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/details")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        //чтобы определенная кнопка определенного юзера триггерила и показывала параметры определенного юзера
        String idshka = request.getParameter("id"); //этот параметр id будет в url
        int id = 0;
        try {
            id = Integer.parseInt(idshka); //превращаем idshk-у в int. И это нужно делать осторожно. Поэтому делаем с try-catch. Вот так считаем id для того, чтобы передать его внизу
        } catch (Exception e) {

        }
//тут мы должны вытащить одного пользователя и передать в какой-нибудь detail.jsp страница детального просмотра
   // ClientUser clientUser = DBUtil.getUser(id); //вот сюда мы должны передать id. Чтобы поставить, нам нужно получить id
      //Меняем поставщика
        ClientUser clientUser = DBManager1_jdbc.getUser(id);
       request.setAttribute("user", clientUser);
       request.getRequestDispatcher("/details.jsp").forward(request,response);
    }
}
