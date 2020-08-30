package day7;


import java.util.Random;

/**
 * 2. Дворовый футбол.
 * Для игры в футбол во дворе требуется 6 человек (3х3). Класс Игрок (англ. Player), содержит следующие поля:
 * поле “выносливость” (англ. stamina), разное для каждого экземпляра
 * константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость” (англ. MIN_STAMINA) со значением 0, единые для всех экземпляров
 * статическое поле countPlayers, которое считает кол-во игроков на футбольном поле (изначально их 0, выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
 * <p>
 * и следующие методы:
 * run() - Игрок бежит при вызове этого метода. Этот метод уменьшает выносливость на 1 при однократном вызове. Когда выносливость достигает 0, игроку нужен отдых и он уходит с поля.
 * info() -  выводит сообщение в зависимости от кол-ва игроков на поле, если игроков менее 6, то выводит фразу
 * “Команды неполные, еще есть ... свободных мест”, иначе “Мест в командах больше нет”. Грамматикой русского языка пренебречь, т.е. фраза “еще есть 1 свободных мест” допустима.
 */

public class Player {

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;
    private Boolean isInGame = false;


    public Player() {
        Random rand = new Random();
        this.stamina = rand.nextInt(11) + 90;
        if (countPlayers >= 0 && countPlayers <= 6) {
            this.isInGame = true;
            if (countPlayers != 6) countPlayers++;
        }

    }

    public static int getCountPlayers() {
        return countPlayers;
    }

//    public static void addPlayer() {
//
//
//    }

//    public static void deletePlayer() {
//
//
//    }

    public static void info() {
        if (countPlayers > 6) {
            System.out.println("Мест в командах больше нет");
        } else if (countPlayers == 6) {
            System.out.println("Мест в командах больше нет, занаяли последнее");
        } else if (countPlayers >= 0 && countPlayers < 6) {
            System.out.println("Команды неполные, еще есть " + (6 - countPlayers) + " свободных мест");
        }
    }

    public void run() {
        if (this.stamina == MIN_STAMINA) {
            //  System.out.println("игрок устал, он в игре: "+this.isInGame);
            if (this.isInGame == true && countPlayers > 0 && countPlayers < 7) {
                countPlayers--;
                this.isInGame = false;
            }
        } else {
            this.stamina -= 1;
        }
    }
}
