package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Tom", "Ivanov", (byte) 23);
        userService.saveUser("Sergo", "Kirillov", (byte) 31);
        userService.saveUser("Andrew", "Vlasenko", (byte) 45);
        userService.saveUser("Masha", "Petrova", (byte) 18);

        userService.removeUserById(3);

        userService.getAllUsers();

        userService.dropUsersTable();
    }
}
