package day12;


import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
 */
public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        int i = 0;
        while (i <= 350) {
            if (((i >= 0 && i <= 30) || (i >= 300 && i <= 350)) && i % 2 == 0) {
                list.add(i);
            }
            i++;
        }

        System.out.println(list);
    }
}
