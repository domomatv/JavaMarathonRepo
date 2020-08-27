package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10.
 * Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 * <p>
 * Пример:
 * Введено число 10. Сгенерирован следующий массив:
 * [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
 * <p>
 * Информация о массиве:
 * Длина массива: 10
 * Количество чисел больше 8: 1
 * Количество чисел равных 1: 0
 * Количество четных чисел: 6
 * Количество нечетных чисел: 4
 * Сумма всех элементов массива: 46
 */
public class Task1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] num = new int[len];

        int more8 = 0;
        int equal1 = 0;
        int chet = 0;
        int nechet = 0;
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
            if (num[i] > 8) more8 += 1;
            if (num[i] == 1) equal1 += 1;
            if (num[i] % 2 == 0) {
                chet += 1;
            } else {
                nechet += 1;
            }
            sum += num[i];
        }


        System.out.println("Длина массива: " + num.length);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных: " + equal1);
        System.out.println("Количество четных чисел: " + chet);
        System.out.println("Количество нечетных чисел: " + nechet);
        System.out.println("Сумма всех элементов массива: " + sum);

        System.out.println("массив: " + Arrays.toString(num));


    }


}
