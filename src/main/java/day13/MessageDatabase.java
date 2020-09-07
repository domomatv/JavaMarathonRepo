package day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();

    /**
     * этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text. Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
     */

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    /**
     * - этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
     * <p>
     * user1: Привет!
     * user2: Привет, user1!
     * user1: Как у тебя дела?
     * user2: Все ок, спасибо :)
     */
    public static void showDialog(User u1, User u2) {
        messages.stream().filter(e -> (e.getReceiver().equals(u2) && e.getSender().equals(u1))
                || (e.getReceiver().equals(u1) && e.getSender().equals(u2)))
                .sorted(Comparator.comparing(o -> o.getDate()))
                .forEach(System.out::println);


    }

    public void printMessage(Message message) {
        System.out.println(message.getSender() + ": " + message.getText());
    }

    ;

    public static List<Message> getMessages() {
        return messages;
    }
}
