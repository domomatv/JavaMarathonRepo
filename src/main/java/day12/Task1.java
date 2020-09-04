package day12;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Создать список строк, добавить в него 5 марок автомобилей,
 * вывести список в консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Распечатать список.
 */
public class Task1 {

    public static void main(String[] args) {
        List<String> auto = new ArrayList<String>();
        auto.addAll(Arrays.asList("bmw", "mersedes", "toyota", "skoda", "ladaa"));
        auto.add(3, "kamaz");
        auto.remove("bmw");
        System.out.println(auto);
    }
}
