package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle fly = new Fly();
        Vehicle autoBus = new AutoBus();
        Vehicle train = new Train();

        Vehicle[] vehicle = new Vehicle[]{fly, autoBus, train};
        for (Vehicle a : vehicle) {
            a.move();
        }
    }
}
