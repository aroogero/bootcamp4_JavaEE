package bitlab.bootcamp.chapter5.db.mySql;

import bitlab.bootcamp.chapter5.db.model.ClientUser;
import com.mysql.cj.xdevapi.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager1_jdbc {
    private static Connection connection; //та библиотека(тот интерфейс), которая работает с базой. Она родная, принадлежит Джаве

    //когда мы создаем DB manager, хотим чтобы он сразу коннектился к базе
    static { //Это искусственный Main. выражение или действие пишем в конструкторе или методе, а просто так на улице алгоритм писать нельзя. По правилам он должен быть внутри метода или внутри конструктора
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //это стандартный путь к базе. Это тот драйвер, который мы скачали с интернета. И с помощью такого подхода классфонэйм мы подтягиваем его
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bootcamp_4_db",
                    "root",
                    ""); //подключились к нашей базе в эскьюэл
        } catch (
                Exception e) { //завернули в трай кетч, если вдруг база будет вырубленной, чтобы наш проект полностью не упал. Локализовывается
            e.printStackTrace();
        }
    }

    //делаем запрос вывести весь список
    public static ArrayList<ClientUser> getAllUsers() {
        ArrayList <ClientUser> users = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("" +  //открыли запрос
                    "SELECT * FROM user_list ORDER BY age DESC"); //создаем sql запрос. Припейрэд дает нам возможность писать сюда как на консоль эскьюэл
        ResultSet resultSet = statement.executeQuery(); //ResultSet - типа сами создали готовый итератор чтобы вывести весь результат, в который записывается весь список, который мы запрашиваем у стэйтмент. В ней мы можем только вытащить список все. Как список будет упорядочен - решает sql

        while (resultSet.next()) {  //next() - это метод ResultSet. Он возвращает значение boolean. Он становится тру если там что-то есть
       //System.out.println(resultSet.getInt("id")); //  На консоли айди выходят.Выводим айдишки в виде инт потому что данные в эскьюэл хранятся в виде стринга
        ClientUser user = new ClientUser();

        user.setId(resultSet.getInt("id"));
        user.setCity(resultSet.getString("city"));
        user.setName(resultSet.getString("name"));
        user.setAge(resultSet.getInt("age")); // Объект упакован. 1 юзер упакован. Теперь его должны в общий список юзера запихать и все 45 строка

        users.add(user);
        }
        statement.close(); //только сейчас мы закрыли ранее созданный запрос
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
    //вызываем этот метод на главной странице сервлет

    public static void addUser(ClientUser user) { //это метод который будет добавлять новый юзеров//данные которые ввели на сайте в наш список в sql
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO user_list (name, age, city )" + //id не пишем, он сам автогенерируется бнутри бд
                    "VALUES(?,?,?)" //вместо '"+user.getName()+"'. В JDBC придумали такое - я вам придумаю . Мы говорим типа закинь мне параметры name age city. Я тебе потом закину ? ? ?
            );
            statement.setString(1, user.getName()); //порядок параметров
            statement.setInt(2, user.getAge());
            statement.setString(3, user.getCity());

            statement.executeUpdate(); //обновление запрос делает. Обновляет список
            statement.close(); //закрываем второй запрос

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ClientUser getUser(int id) {

        ClientUser user = null;

        try {
            PreparedStatement statement = connection.prepareStatement(""+
                    "SELECT * FROM user_list WHERE id = ? LIMIT 1");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) { //используем иф а не уайл потому что мы или 1 параметр получим или вообще не получим
                user = new ClientUser();
                user.setId(resultSet.getInt("id"));
                user.setCity(resultSet.getString("city"));
                user.setName(resultSet.getString("name"));
                user.setAge(resultSet.getInt("age"));
            }
            statement.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
//любая работа с файлами, с базой данных, с внешними ресурсами где идет соединение какое-то обязательно должно быть завернуто в try-catch
