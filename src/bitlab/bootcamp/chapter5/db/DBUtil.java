package bitlab.bootcamp.chapter5.db;

import java.util.ArrayList;

public class  DBUtil {
    private static ArrayList<ClientUser> users = new ArrayList<>();
    private static ArrayList<String> cities = new ArrayList<>();
    private static int id = 4; //счетчик для айди

    static {
        users.add(new ClientUser(1, "Aroo", 22, "Almaty"));
        users.add(new ClientUser(2, "Aiza", 18, "Shymkent"));
        users.add(new ClientUser(3, "Gero", 19, "Sary"));

        cities.add("Almaty");
        cities.add("Astana");
        cities.add("Shymkent");
        cities.add("Saryagash");
        cities.add("Aktau");
        cities.add("Karaganda");
    }

    public static void addUser(ClientUser user) {
        user.setId(id); //говорим что id равняется 7
        users.add(user); //потом добавляем юзера в массив
        id++; //и меняем значение id для следующего юзера
    }

    public static ArrayList<ClientUser> getUsers() {
        return users;
    }

    public static ArrayList<String> getCities() {
        return cities;
    }

    //для дитейлс создаем такой метод который вытаскивает только одного клиента
    public static ClientUser getUser(int id) {
       /* for (ClientUser clientUser: users) { //это цикл for each
            if (id == clientUser.getId())
                return clientUser;
        }
        return null;*/
        return users.stream().
                filter(clientUser -> id == clientUser.getId()). //
                findFirst().
                orElse(null);
    }
}

