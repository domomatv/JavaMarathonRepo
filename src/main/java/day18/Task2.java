package day18;

public class Task2 {


    /**
     * 2. Создайте рекурсивный метод, который принимает на вход единственный аргумент - число, и возвращает количество цифр 7 в этом числе.
     * Циклы использовать запрещено, можно использовать только рекурсивные вызовы.
     * <p>
     * Пример:
     * System.out.println(count7(717771237)); // 5
     * <p>
     * *В числе 717771237 ровно 5 раз используется цифра семь.     *
     */
    public static void main(String[] args) {

        int value = 717771237;
        System.out.println(calcCount(value, 7));

    }

    static int calcCount(int value, int searchedDigit) {
        if (value == 0) {
            return 0;
        }
        // остаток
        int left = value % 10;
        // если нашли искомое число, прибавление
        if (left == searchedDigit) {
            return 1 + calcCount(value / 10, searchedDigit);
        }
        return calcCount(value / 10, searchedDigit);
    }
}
