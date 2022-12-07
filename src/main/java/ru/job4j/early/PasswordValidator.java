package ru.job4j.early;

public class PasswordValidator {

    public static boolean isUpperOneWord(String password) {
        char[] charArr = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(charArr[i])) {
                return true;
            }
        }
        return false;
    }

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (!isUpperOneWord(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        return password;
    }

    public static void main(String[] args) {
        validate("Аячм");
    }
}
