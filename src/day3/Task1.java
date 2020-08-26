package day3;

import java.util.Scanner;

/**
 * 1. Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
 * Программа должна работать до тех пор, пока не будет введено слово “Stop”.
 * Реализовать, используя следующие данные:
 * <p>
 * Москва, Владивосток, Ростов - Россия.
 * Рим, Милан, Турин - Италия.
 * Ливерпуль, Манчестер, Лондон - Англия.
 * Берлин, Мюнхен, Кёльн - Германия.
 * <p>
 * <p>
 * При вводе любого другого города вывести сообщение “Неизвестная страна”.
 * Пример:
 * Милан - ваш ввод в консоль
 * Италия - ответ программы
 * Дублин - ваш ввод в консоль
 * Неизвестная страна - ответ программы
 * Stop - ваш ввод в консоль
 * работа программы завершается
 */
public class Task1 {

    public static void main(String[] args) {

        boolean isStopped = false;

        while (!isStopped) {

            Scanner scanner = new Scanner(System.in);
            String enteredWord = scanner.nextLine();
            String message = "";

            if (enteredWord.equals("Stop")) {
                isStopped = true;
                message = "Game over";

            } else {

                switch (enteredWord) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        message = "Россия";
                        break;

                    case "Рим":
                    case "Милан":
                    case "Турин":
                        message = "Италия";
                        break;

                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        message = "Англия";
                        break;

                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        message = "Германия";
                        break;

                    default:
                        message = "Неизвестная страна";
                }
                System.out.println(message);
            }

        }

    }
}
