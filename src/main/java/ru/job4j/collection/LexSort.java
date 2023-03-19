package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] rightNumber = right.split(". ");
        String[] leftNumber = left.split(". ");
        int rightInt = Integer.parseInt(rightNumber[0]);
        int leftInt = Integer.parseInt(leftNumber[0]);
        return Integer.compare(leftInt, rightInt);
    }
}
