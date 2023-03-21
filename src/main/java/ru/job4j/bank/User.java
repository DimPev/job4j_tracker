package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс, представляющий пользователя банковской системы.
 ** @author Dim
 ** @version 1.0
 */
public class User {
    /**
     * Паспорт пользователя.
     */
    private String passport;

    /**
     * Имя пользователя.
     */
    private String username;

    /**
     * Конструктор, создающий пользователя с указанным паспортом и именем.
     *
     * @param passport паспорт пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает паспорт пользователя.
     *
     * @return паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Устанавливает паспорт пользователя.
     *
     * @param passport паспорт пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает имя пользователя.
     *
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
