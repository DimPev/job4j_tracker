package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private String cheese = "Экстра сыр";

    public String name() {
        return super.name() + " + " + this.cheese;
    }
}
