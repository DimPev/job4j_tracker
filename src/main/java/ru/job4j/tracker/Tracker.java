package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] rls = new Item[items.length];
        size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name = items[i];
            if (name != null) {
                rls[size] = name;
                size++;
            }
        }
        return   Arrays.copyOf(rls, size);
    }

    public Item[] findByName(String key) {
        Item[] rls = findAll();
        size = 0;
        for (int i = 0; i < rls.length; i++) {
            Item name = rls[i];
            if (key.equals(name.getName())) {
                rls[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(rls, size);
    }
}
