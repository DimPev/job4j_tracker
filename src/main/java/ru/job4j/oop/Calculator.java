package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public static int multiply(int y) {
        return x * y;
    }

    public int divide(int y) {
        return y / x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + divide(y) + minus(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        result = minus(3);
        System.out.println(result);
        result = multiply(12);
        System.out.println(result);
        result = calculator.divide(25);
        System.out.println(result);
        result = calculator.sumAllOperation(123);
        System.out.println(result);
    }
}