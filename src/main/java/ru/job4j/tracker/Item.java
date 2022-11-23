package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public Item(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Item item = new Item();
        Item first = new Item("test");
        Item second = new Item("test2", 123);

    }
}