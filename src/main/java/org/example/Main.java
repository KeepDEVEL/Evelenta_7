package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1", List.of("Привет", "Как дела?"));
        User user2 = new User("user2", List.of("Привет!", "У меня все хорошо, спасибо"));

        printUserMessages(user1);
        printUserMessages(user2);
    }

    public static void printUserMessages(User user) {
        System.out.println("Список сообщений пользователя " + user.getUsername() + ":");

        List<String> messages = user.getMessages();
        for (String message : messages) {
            System.out.println(message);
        }

        System.out.println();
    }
}