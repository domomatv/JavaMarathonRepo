package day7;

/**
 * Задание: Создать класс Player по вышеописанному шаблону. Экземпляр класса при создании должен иметь значение выносливости от 90 до 100. Создать 6 игроков, вызвать метод info(). При попытке создать 7,8 … n игрока, количество игроков на поле меняться не должно, проверить это.
 * Примените к игроку метод run(), пока он полностью не выдохнется (отрицательное значение выносливости не допускается). Вывести количество игроков на поле.
 * <p>
 * По желанию: доработать метод info(), так, чтобы при выводе в консоль грамматика русского языка учитывалась.
 */
public class Task2 {

    public static void main(String[] args) {

        Player player1 = new Player();
        Player.info();
        Player player2 = new Player();
        Player.info();
        Player player3 = new Player();
        Player.info();
        Player player4 = new Player();
        Player.info();
        Player player5 = new Player();
        Player.info();
        Player player6 = new Player();
        Player.info();
        Player player7 = new Player();
        Player.info();

//        for (int i = 0; i < 101; i++) {
//            player5.run();
//        }

        Player player8 = new Player();
        Player.info();

        Player player9 = new Player();
        Player.info();

        Player player10 = new Player();
        Player.info();

        for (int i = 0; i < 101; i++) {
            player1.run();
        }

        for (int i = 0; i < 101; i++) {
            player2.run();
        }
        for (int i = 0; i < 101; i++) {
            player10.run();
        }
        for (int i = 0; i < 101; i++) {
            player3.run();
        }


        Player.info();


    }


}
