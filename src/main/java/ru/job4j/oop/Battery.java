package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {

        another.load += getLoad();
        this.load -= getLoad();
    }

    public static void main(String[] args) {
        Battery first = new Battery(4);
        Battery second = new Battery(2);

        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);

    }
}
