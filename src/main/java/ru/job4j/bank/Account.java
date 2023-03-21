package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс, описывает  банковский счет пользователя.
 *
 * @author Dim
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты банковского счета.
     */
    private String requisite;
    /**
     * Баланс банковского счета.
     */
    private double balance;

    /**
     * Конструктор, создающий банковский счет с указанными реквизитами и балансом.
     *
     * @param requisite реквизиты банковского счета
     * @param balance   баланс банковского счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает реквизиты бановского счета.
     * Стандартный геттер
     *
     * @return реквизиты банковского счта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает реквизиты бановского счета.
     * стандартный сеттер.
     *
     * @param requisite бановского счет.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Для получения баланса на счете
     * возвращает баланс.
     *
     * @return баланс на счете
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Для установки баланса на счете
     * возвращает баланс.
     *
     * @return баланс на счете
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
