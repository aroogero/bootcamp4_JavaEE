package bitlab.bootcamp.chapter5.db.mySql;

import bitlab.bootcamp.chapter5.db.model.Item_task21;

import java.util.ArrayList;

public class DBManager_task21 {
    public static ArrayList<Item_task21> items = new ArrayList<>();
    private static int id = 5;
    static {
        items.add(new Item_task21(1,"Iphone 13 Pro Max",450000,10));
        items.add(new Item_task21(2,"XIAOMI REDMI NOTE 8",82000,20));
        items.add(new Item_task21(3,"Oppo 3 Modal X",350000,10));
        items.add(new Item_task21(4,"Macbook Pro M1 13",750000,15));
    }
    public static void addItem(Item_task21 item) {
        item.setId(id);
        items.add(item);
        id++;
    }
    public static ArrayList<Item_task21> getAllItems() {
        return items;
    }
    public static Item_task21 getItem(int id) {
        return items.stream()
                .filter(Item_task21 -> id == Item_task21.getId())
                .findFirst().orElse(null);
    }
}
