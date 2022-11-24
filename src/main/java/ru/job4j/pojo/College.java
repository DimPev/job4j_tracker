package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Безименный БезФамильный БезОтчетсвенный");
        student.setGroup(4);
        student.setReceipt(new Date());
        System.out.println(student.getFio() + " has a car - " + student.getGroup() + " : " + student.getReceipt());
    }
}
