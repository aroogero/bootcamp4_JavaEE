package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.model.Item_task21;
import bitlab.bootcamp.chapter5.db.mySql.DBManager_task21;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/items_task2-1")
public class Items_task21Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Item_task21> items = DBManager_task21.getAllItems();
        request.setAttribute("items_task21",items);
        request.getRequestDispatcher("/homePage_task21.jsp").forward(request,response);
    }
}
