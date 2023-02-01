package bitlab.bootcamp.chapter5.servlets.workwithClient;

import bitlab.bootcamp.chapter5.db.model.Items;
import bitlab.bootcamp.chapter5.db.mySql.DBManager_Sprint2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value="/home_products_page")
public class HomeProducts_Sprint2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        DBManager_Sprint2.getAllItems();
        ArrayList<Items> items = DBManager_Sprint2.getAllItems();
        request.setAttribute("items", items);
        request.getRequestDispatcher("/home_products_page.jsp")
                .forward(request, response);
    }
}
