package day13;

public class Test {

    public static void main(String[] args) {
        User user1 = new User("Петя");
        User user2 = new User("Вася");
        User user3 = new User("Саша");

        user1.sendMessage(user2, "Привет, как дела");
        user1.sendMessage(user2, "когда пойдем на рыбалку");

        user2.sendMessage(user1, "Привет, давая завтра");
        user2.sendMessage(user1, "или послезавтра");
        user2.sendMessage(user1, "или на след неделе");

        user3.sendMessage(user1, "го на рыбалку");
        user3.sendMessage(user1, "я позвал Васю");
        user3.sendMessage(user1, "он готов");
        user3.sendMessage(user1, "но непонятно когда");


        user1.sendMessage(user3, "ну го");
        user1.sendMessage(user3, "если отпустит жена");
        user1.sendMessage(user3, "сколько литров брать?");


        MessageDatabase.showDialog(user1, user3);

        // проверка формата сообщений
        for (Message mess : MessageDatabase.getMessages()) {
            System.out.println(mess);
        }

        // проверка на друзей
        user1.subscribe(user2);
        System.out.println(user1.isFriend(user2));

        user2.subscribe(user1);
        System.out.println(user1.isFriend(user2));


    }
}
