package day16;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 2. Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 содержит 1000 случайных чисел от 0 до 100.
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из Файла 1 рассчитывается их среднее арифметическое.
 * Затем, полученное значение записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо найти сумму всех вещественных чисел из Файла 2 и вывести в консоль ответ, отбросив его вещественную часть.
 * Пример:
 * Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое рассчитывается для группы из 4 целых чисел.
 * <p>
 * Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
 * Файл 2: 5.75 26.5 34.5
 * Ответ: 66
 * <p>
 * Комментарии к примеру:
 * Среднее арифметическое для четверки 3 8 7 5 равно 5.75
 * Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
 * Сумма вещественных чисел из Файла 2 равняется 66.75
 * Отбросив вещественную часть (числа после запятой) получаем ответ 66.
 */

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            int PACK_SIZE = 3;

            PrintWriter fileAll = new PrintWriter("src/main/java/day16/file0.txt");
            PrintWriter fileAvg = new PrintWriter("src/main/java/day16/file1.txt");

            Random rand = new Random();
            int[] arrayAll = new int[1000];
            List<Double> listAvg = new ArrayList<>();

            // генерация чисел
            int i = 0;
            while (i < 1000) {
                int value = rand.nextInt(101);
                fileAll.print(value + " ");
                arrayAll[i] = value;
                i++;
            }
            fileAll.close();


            //  расчет средних
            int sum = 0;
            for (int j = 0; j < arrayAll.length; j++) {
                sum += arrayAll[j];
                // не для первого значения и перед новой пачкой
                if (j != 0 && ((j + 1) % PACK_SIZE == 0)) {
                    // cчитаем среднее
                    listAvg.add((double) sum / PACK_SIZE);
                    sum = 0;
                }

            }
            listAvg.stream().forEach(e -> fileAvg.print(e + " "));
            fileAvg.close();

            System.out.println("Сумма средних: " + (int) listAvg.stream().mapToDouble(Double::doubleValue).sum());


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
