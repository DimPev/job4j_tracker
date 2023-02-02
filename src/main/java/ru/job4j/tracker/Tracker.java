package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item) ;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {

        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> rsla = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                rsla.add(item);
            }
        }
        return rsla;
    }


    private int indexOf(int id) {
        int rsl = -1;
//        for (int index = 0; index < size; index++) {
//            if (items.get(index).getId() == id) {
//                rsl = index;
//                break;
//            }
//        }
        for (Item item : items) {
            if (items.get(size).getId() == id) {
               rsl = size;
               break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.add(index,item);
            item.setId(id);

        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
          //  System.arraycopy(items, index + 1, items, index, size - index - 1);
            items.remove(size );
          //  size--;
        }
        return rsl;
    }
}
