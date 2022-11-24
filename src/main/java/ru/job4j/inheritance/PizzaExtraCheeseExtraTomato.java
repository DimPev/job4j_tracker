package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private String tomatoes = "Томаты";

    public String name() {
        return super.name() + " + " + this.tomatoes;
    }
}
