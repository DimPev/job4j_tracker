package ru.job4j.bank;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс, представляющий банковский сервис, который хранит информацию о пользователях и их счетах.
 * * @author Dim
 * * @version 1.0
 */
public class BankService {
    /**
     * Хранение задания осуществляется в коллекции типа Map.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод для добавления нового пользователя в коллекцию пользователей.
     *
     * @param user новый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод для удаления пользователя из коллекции пользователей.
     *
     * @param passport номер паспорта пользователя
     * @return true, если удаление прошло успешно, false - в противном случае
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод для добавления нового счета пользователю.
     *
     * @param passport номер паспорта пользователя
     * @param account  новый счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя по номеру паспорта.
     *
     * @param passport номер паспорта пользователя
     * @return найденный пользователь или null, если пользователь не найден
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод для поиска счета пользователя по номеру паспорта и реквизитам счета.
     *
     * @param passport  номер паспорта пользователя
     * @param requisite реквизиты счета
     * @return найденный счет. null0- если счет не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account acc : accounts) {
                if (acc.getRequisite().equals(requisite)) {
                    return acc;
                }
            }
        }
        return null;
    }

    /**
     * Предназначен для перечисления с одного счета на другой счет.
     *
     * @param srcPassport   номер паспорта пользователя с которого нужно перевести деньги
     * @param srcRequisite  реквизиты счета пользователя с которого нужено перевести деньги
     * @param destPassport  номер паспорта пользователя на счет которого нужно перевести деньги
     * @param destRequisite реквизиты счета пользователя на счет которого нужно перевести деньги
     * @param amount
     * @return True -если перевод прошел успешно.Если счёт не найден или не хватает денег на счёте вернет False
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rls = false;
        Account firsAccount = findByRequisite(srcPassport, srcRequisite);
        Account secondAccount = findByRequisite(destPassport, destRequisite);
        if (firsAccount != null && secondAccount != null && firsAccount.getBalance() >= amount) {
            firsAccount.setBalance(firsAccount.getBalance() - amount);
            secondAccount.setBalance(secondAccount.getBalance() + amount);
            rls = true;
        }
        return rls;
    }

    /**
     * возвращает список счетов пользователя.
     *
     * @param user пользователь  для которого необходимо получить список счетов.
     * @return возвращает список счетов пользователя.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
