package day4;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * наибольший элемент массива
 * наименьший элемент массива
 * количество элементов массива, оканчивающихся на 0
 * сумму элементов массива, оканчивающихся на 0
 * <p>
 * Использовать сортировку запрещено.
 */
public class Task2 {

    public static void main(String[] args) {

        int[] num = new int[100];
        int min = 1000, max = 0, countEnd0 = 0, sumEnd0 = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 1000);

            if (num[i] <= min) {
                min = num[i];
            }
            ;
            if (num[i] >= max) {
                max = num[i];
            }
            ;
            if (num[i] % 10 == 0) {
                countEnd0++;
                sumEnd0 += num[i];
                // отладочный скрипт
                // System.out.println(num[i]);
            }
            ;

        }

        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + countEnd0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumEnd0);

        // отладочный скрипт
        // System.out.println("массив: "+ Arrays.toString(num));
    }
}
