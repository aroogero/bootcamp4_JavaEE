package bitlab.bootcamp.chapter5.db;

import bitlab.bootcamp.chapter5.db.model.ClientTask;

import java.util.ArrayList;

public class DBManager_Sprint1 {
    public static ArrayList<ClientTask> tasks = new ArrayList<>();
    private static int id = 4;

    static {
        tasks.add(new ClientTask(1,"Создать Веб приложение на JAVA EE", "2021-10-23","Да","Нужно будет создать собственное приложение на Java EE для себя. Для начала я установлю себе на комп Composer. Затем загружу Java EE и запущу"));
        tasks.add(new ClientTask(2,"Убраться дома и закупить продукты", "2021-11-12","Да","Убраться дома и закупить продукты"));
        tasks.add(new ClientTask(3,"Выполнить все домашние задания", "2021-10-28","Нет","Выполнить все домашние задания"));
    }
    public static void addTask (ClientTask task) { //этот метод добавляет новую задачу в список
        task.setId(id);
        tasks.add(task);
        id++;
    }
    public static ClientTask getTask(int id) { // этот метод возвращает объект задачи по id
        return tasks.stream().
                filter(ClientTask -> id == ClientTask.getId()). //
                        findFirst().orElse(null);
    }
    public static ArrayList<ClientTask> getAllTasks() { //этот метод возвращает список всех задач
        return tasks;
    }
    public static void deleteTask(int id) { //этот метод удаляет задачу из списка по id
        tasks.remove(id);
    }

   /* public static void editTask (int id, String name, String opisanie, String deadline, String yesNo) {
        ClientTask Task = new ClientTask(id, name, deadline, yesNo, opisanie);
        tasks.set(id, Task);
    }*/
}
