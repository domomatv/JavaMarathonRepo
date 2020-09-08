package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Реализовать программу, которая на вход принимает txt файл с целыми числами (можно использовать файл из задания 1 дня 14) и в
 * качестве ответа выводит в консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную запись вещественного числа (со всеми знаками после запятой) и
 * сокращенную запись (с 3 знаками после запятой).
 * Пример:
 * Числа в txt файле: 5 2 8 34 1 36 77
 * Ответ: 23.285714285714285 --> 23,286
 */

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            File file = new File("src/main/java/day16/file.txt");
            Scanner scanner = new Scanner(file);
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNext()) {
                list.add(scanner.nextInt());
            }

            double avg = (double) list.stream()
                    .reduce(0, Integer::sum) / list.size();

            DecimalFormat df = new DecimalFormat("0.000");
            System.out.println(avg + " --> " + df.format(avg));


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

}
