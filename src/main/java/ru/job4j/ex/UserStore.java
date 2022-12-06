package ru.job4j.ex;

import ru.job4j.tracker.ConsoleOutput;
import ru.job4j.tracker.Output;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("login is not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() >= 3) {
            return true;
        }
        throw new UserInvalidException("This user has been denied");
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            Output out = new ConsoleOutput();
            User user  = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            throw new RuntimeException(e);
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

