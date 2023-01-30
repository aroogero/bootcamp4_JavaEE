package bitlab.bootcamp.chapter5.servlets.workwithClient;

import bitlab.bootcamp.chapter5.db.model.ClientUser;
import bitlab.bootcamp.chapter5.db.mySql.DBManager1_jdbc;
import bitlab.bootcamp.chapter5.db.DBUtil;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/add-client") //можно воспользоваться одним сервлетом, с двумя целями - пост метод внедряет, а его гет метод отображает форму
public class AddClientServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        ArrayList<String> cities = DBUtil.getCities();
        request.setAttribute("goroda", cities);
       request.getRequestDispatcher("/add-client.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,  //в базу внедряет
                          HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));
        String city = request.getParameter("user_city");

        ClientUser user = new ClientUser(); //упаковал объекта
        user.setName(name);
        user.setAge(age);
        user.setCity(city);

        //DBUtil.addUser(user); //и передал

        //но jdbc мы говорим, что это будет делать база данных. поставщика меняем
        DBManager1_jdbc.addUser(user);
        response.sendRedirect("/add-client?success"); //можем сделать так, чтобы возвращался сам на себя / прикольная вещь параметр саксес передаем через гет. Реструктуризацию проекта сделали. Если добавление клиента пройдет удачно
    }

}