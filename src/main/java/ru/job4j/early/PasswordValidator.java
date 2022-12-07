package ru.job4j.early;

public class PasswordValidator {
    private static String[] textSpecial = {"qwerty", "12345", "password", "admin", "user"};

    public static String validate(String password) {

        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        char[] charArr = password.toCharArray();
        boolean upp = false;
        boolean down = false;
        boolean haveAnumber = false;
        boolean special = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(charArr[i])) {
                upp = true;
            }
            if (Character.isLowerCase(charArr[i])) {
                down = true;
            }
            if (Character.isDigit(password.charAt(i))) {
                haveAnumber = true;
            }
            if (!Character.isLetter(charArr[i]) && !Character.isDigit(password.charAt(i))) {
                special = true;
            }
        }
        if (!upp) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!down) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (!haveAnumber) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (!special) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        for (String s : textSpecial) {
            String lowPass = password.toLowerCase();
            if (lowPass.contains(s)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }

        }
        return password;
    }
}


