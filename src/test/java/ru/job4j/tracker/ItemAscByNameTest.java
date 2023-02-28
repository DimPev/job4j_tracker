package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ItemAscByNameTest {
    @Test
    public void whenSortByNameAsc() {
        Item item = new Item();
        List<Item> items = Arrays.asList(
                new Item("атри", 3),
                new Item("two", 2),
                new Item("one", 1));
        List<Item> excepted = Arrays.asList(
                new Item("one", 1),
                new Item("two", 2),
                new Item("атри", 3));
        items.sort(new ItemAscByName());
        assertEquals(items, excepted);
    }

    @Test
    public void ItemDescByName() {
        Item item = new Item();

        List<Item> items = Arrays.asList(
                new Item("one", 1),
                new Item("two", 2),
                new Item("атри", 3),
                new Item("четыре", 4));
        List<Item> excepted = Arrays.asList(
                new Item("четыре", 4),
                new Item("атри", 3),
                new Item("two", 2),
                new Item("one", 1));
        items.sort(new ItemDescByName());
        assertEquals(items, excepted);
    }

}
