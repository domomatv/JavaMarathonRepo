package day4;

import java.util.Arrays;

/**
 * 4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 * <p>
 * Пример:
 * *Для простоты пример показан на массиве размера 10
 * <p>
 * [1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]
 * <p>
 * Тройка с максимальной суммой: [5789, 4, 8742]
 * <p>
 * Вывод в консоль:
 * 14535
 * 5
 * <p>
 * *Пояснение. Первое число - сумма тройки [5789, 4, 8742]. Второе число - индекс первого элемента тройки, то есть индекс числа 5789.
 */
public class Task4 {

    public static void main(String[] args) {

        // fill array
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 10);
        }

        int currentSum = 0, maxSum = 0, indexStartMaxSum = 0;

        // calc sum
        for (int i = 0; i < num.length - 2; i++) {
            currentSum = num[i] + num[i + 1] + num[i + 2];

            if (currentSum >= maxSum) {
                maxSum = currentSum;
                indexStartMaxSum = i;
            }
        }


        System.out.println("макс сумма: " + maxSum);
        System.out.println("старт индекс: " + indexStartMaxSum);

        System.out.println("массив: " + Arrays.toString(num));
    }
}
