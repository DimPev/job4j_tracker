package ru.job4j.oop;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(left,
                max(right, third)
        );
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(left,
                max(right, third, fourth)
        );
    }

    public static void main(String[] args) {
        int tes = max(9, 5);
        int tes3 = max(2, 4, 3);
        int tes4 = max(1, 5, 8, 7);
        System.out.println(tes4);
    }
}
