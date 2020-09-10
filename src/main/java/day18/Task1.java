package day18;

public class Task1 {


    /**
     * 1. Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы (необходимо использовать рекурсивные вызовы).
     */
    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(calcCount(numbers, numbers.length - 1)); // 65346
    }

    public static int calcCount(int[] numbers, int index) {

        if (index == 0) {
            return numbers[index];
        } else {
            return numbers[index] + calcCount(numbers, --index);
        }
    }

}
