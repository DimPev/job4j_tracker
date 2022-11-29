package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            for (int i = 0; i < count; i++) {
                if (matches > 3 || matches == 0) {
                    System.out.println(player + " Число должно быть в диапозоне от 1 -3 :");
                    turn = !turn;
                    break;
                }
                if (matches > count) {
                    System.out.println(player + "число должно быть меньше общего количесвтва . Всего спичек осталось"
                            + count);
                    break;
                }
                count -= matches;
                System.out.println("Осталось спичек " + count);
                break;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
