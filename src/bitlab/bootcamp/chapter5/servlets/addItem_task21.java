package bitlab.bootcamp.chapter5.servlets;

import bitlab.bootcamp.chapter5.db.model.Item_task21;
import bitlab.bootcamp.chapter5.db.mySql.DBManager_task21;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(value="/addItem_task21")
public class addItem_task21 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("item_name");
        double price = Double.parseDouble(request.getParameter("item_price"));
        int amount = Integer.parseInt(request.getParameter("item_amount"));

        Item_task21 item = new Item_task21();
        item.setName(name);
        item.setPrice(price);
        item.setAmount(amount);
        DBManager_task21.addItem(item);
        response.sendRedirect("/");
    }
}
