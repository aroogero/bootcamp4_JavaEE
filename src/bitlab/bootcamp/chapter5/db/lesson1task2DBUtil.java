package bitlab.bootcamp.chapter5.db;

import java.util.ArrayList;

public class lesson1task2DBUtil { //ОШИБКА - КЛАССЫ ЛУЧШЕ НАЗЫВАТЬ С ЗАГЛАВНЫМИ БУКВАМИ
    private static ArrayList<lesson1task2ListWorkers> workers = new ArrayList<>();
    static {
        workers.add(new lesson1task2ListWorkers("Ilyas","Zhuanyshev","IT",550000));
        workers.add(new lesson1task2ListWorkers("Aybek","Bagit","Management",650000));
        workers.add(new lesson1task2ListWorkers("Alibek","Serikov","HR",350000));
        workers.add(new lesson1task2ListWorkers("Serzhan","Berikov","IT",450000));
        workers.add(new lesson1task2ListWorkers("Madina","Assetova","PR",350000));
        workers.add(new lesson1task2ListWorkers("Anel","Mukhamejanova","Management",400000));
    }
    public static void addWorker( lesson1task2ListWorkers worker) { //Данный метод берет, в аргументы принимает одного user-а
        workers.add(worker);
    }
    public static ArrayList<lesson1task2ListWorkers> getWorkers() {  //Данный метод получает список всех юзеров
        return workers;
    }
}
