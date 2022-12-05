package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (key == null) {
            throw new ElementNotFoundException("Index is null");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {

        String[] strings = new String[]{"One", "two", "two", "Test", "two"};
        String name = null;
        try {
            System.out.println(name + " В массиве под идексом " + indexOf(strings, name));
        } catch (ElementNotFoundException e) {
            throw new ElementNotFoundException("Index is not found, Index is null");
        }
    }
}
