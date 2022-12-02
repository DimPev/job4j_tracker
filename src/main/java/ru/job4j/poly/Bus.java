package ru.job4j.poly;

public class Bus implements Transport {
    private final int priceOfFuel = 55;

    @Override
    public void drive() {
     System.out.println("Похеали");
    }

    @Override
    public void passenger(int sum) {
        System.out.println("Количество пассажиров = " + sum);
    }

    @Override
    public int price(int fuel) {
        return fuel * priceOfFuel;
    }

}
