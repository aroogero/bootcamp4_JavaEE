package bitlab.bootcamp.chapter5.db;

import java.util.ArrayList;

public class Lesson2task4DBManager {
    private static ArrayList<Lesson2task4List> tasks = new ArrayList<>();

    public static void addTask(Lesson2task4List task) {
        tasks.add(task);
    }
   /* public static tasks getTask (Long id) {
        return
    }*/
    public static ArrayList getAllTasks() {
        return tasks;
    }
    public static void deleteTask (Long id) {
        tasks.remove(id);
    }
}


