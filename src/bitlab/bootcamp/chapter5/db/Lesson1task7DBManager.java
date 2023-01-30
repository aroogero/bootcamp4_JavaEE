package bitlab.bootcamp.chapter5.db;

import java.util.ArrayList;

public class Lesson1task7DBManager {
    private static ArrayList<Lesson1task7Footballer> footballers = new ArrayList<>();
    static {
        footballers.add(new Lesson1task7Footballer("Vinicus","Junior", "Real Madrid", 6000000, 70000000));
    }
    public static void addFootballer(Lesson1task7Footballer footballer) {  //этот метод добавляет нового футболиста в список
        footballers.add(footballer);
    }
    public static ArrayList <Lesson1task7Footballer> getFootballers () { //этот метод возвращает список всех футболистов
        return footballers;
    }
}
