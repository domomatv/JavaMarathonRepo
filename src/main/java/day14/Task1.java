package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30). Заполнить его вручную десятью произвольными числами.
 * Реализовать программу, которая считает сумму всех чисел в этом файле и выводит ее на экран.
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
 * Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 */

public class Task1 {
    public static void main(String[] args) {
        try {

            File file = new File("src/main/java/day14/file.txt");
            Scanner scanner = new Scanner(file);
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                list.add(scanner.nextInt());
            }

            if (list.size() != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            } else {
                System.out.println(list.stream()
                        .reduce(0, Integer::sum));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

}
