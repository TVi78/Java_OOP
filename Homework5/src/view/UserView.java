package Homework5.src.view;

import java.util.Scanner;

import Homework5.src.controller.UserController;
import Homework5.src.model.User;
import Homework5.src.util.Commands;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду: ").toUpperCase();
            com = Commands.valueOf(command);
            if (com == Commands.EXIT)
                return;
            switch (com) {
                case ADDALL:
                    Scanner in = new Scanner(System.in);
                    System.out.println("Для выхода из команды добавления, наберите 'end'");
                    while (!in.nextLine().toUpperCase().equals("END")) {
                        User u = createUser();
                        userController.saveUser(u);
                    }
                    break;
                case CREATE:
                    User u = createUser();
                    userController.saveUser(u);
                    break;
                case READ:
                    String id = prompt("Идентификатор пользователя: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case READALL:
                    System.out.println(userController.readAll());
                    break;
                case UPDATE:
                    String userId = prompt("Enter user id: ");
                    userController.updateUser(userId, updateUser());
                    break;
                case DELETE:
                    String delUserId = prompt("Enter user id: ");
                    userController.deleteUser(delUserId);
                    break;
                case LIST:
                    System.out.println("Список поддерживаемых комманд:");
                    System.out.println(java.util.Arrays.asList(Commands.values()));
                    break;
                default:
                    System.out.println("Такая команда не поддерживается!");
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public String checkLine(String str) {
        str = str.trim().replace(" ", "");
        if (!str.isEmpty()) {
            return str;
        } else {
            System.out.println("Значение не может быть пустым.\n");
            str = prompt("Введите корректные данные:");
            return checkLine(str);
        }
    }

    private User createUser() {
        String firstName = checkLine(prompt("Имя: "));
        String lastName = checkLine(prompt("Фамилия: "));
        String phone = checkLine(prompt("Номер телефона: "));
        return new User(firstName, lastName, phone);
    }

    private User updateUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }
}
