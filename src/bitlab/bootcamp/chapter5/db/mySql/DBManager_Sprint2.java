package bitlab.bootcamp.chapter5.db.mySql;

import bitlab.bootcamp.chapter5.db.model.Account;
import bitlab.bootcamp.chapter5.db.model.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager_Sprint2 {
    private static Connection connect;

    static {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bootcamp_4_db",
                    "root",
                    "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Items> getAllItems() {
        ArrayList<Items> itemsArrayList = new ArrayList<>();
        try {
            PreparedStatement statement = connect.prepareStatement("" +
                    "SELECT * FROM items");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Items item = new Items();

                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setRAM(resultSet.getString("RAM"));
                item.setSSD(resultSet.getString("SSD"));
                item.setProcessor(resultSet.getString("Processor"));
                item.setPrice(resultSet.getDouble("price"));

                itemsArrayList.add(item);
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return itemsArrayList;
    }

    public static Account getUser(String email) { //метод для аутентификации, для выдергивания пользователя по Емайлу
        Account account = null;

        try {

PreparedStatement statement = connect.prepareStatement(""+
        "SELECT * FROM users WHERE email=?");
statement.setString(1,email);

ResultSet resultSet = statement.executeQuery();
if (resultSet.next()) {
    account = new Account();
    account.setId(resultSet.getLong("id"));
    account.setEmail(resultSet.getString("email"));
    account.setPassword(resultSet.getString("password"));
    account.setFullName(resultSet.getString("full_Name"));
}
statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return account;
    }
}
