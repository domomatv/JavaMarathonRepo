package day3;

import java.util.Scanner;

/**
 * 1. Реализовать программу, которая в консоль выводит название страны, принимая на вход название города.
 * Реализовать программу, которая пока работает, принимает на вход от пользователя два числа - делимое и делитель.
 * Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
 * Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
 * (для этих вещественных чисел необходимо использовать тип double и метод nextDouble() у Scanner’а соответственно).
 */
public class Task2 {

    public static void main(String[] args) {

        boolean isStopped = false;

        while (!isStopped) {
            Scanner scanner = new Scanner(System.in);
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            if (b == 0) {
                isStopped = true;
            } else {
                System.out.println(a / b);

            }
        }
    }
}
