package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;

    private int group;

    private Date receipt;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getReceipt() {
        return receipt;
    }

    public void setReceipt(Date receipt) {
        this.receipt = receipt;
    }
}
