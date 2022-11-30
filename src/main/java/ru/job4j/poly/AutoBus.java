package ru.job4j.poly;

public class AutoBus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " on road");
    }
}
