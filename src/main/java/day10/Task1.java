package day10;


import java.util.Random;

/**
 * Создайте в методе main() класса Task1 объект класса Студент и объект класса Преподаватель.
 * Выведите в консоль название учебной группы у объекта-студента и название предмета у объекта-преподавателя.
 * Затем, вызовите printInfo() на объектах и посмотрите на результат.
 */
public class Task1 {

    public static void main(String[] args) {

        Node root = new Node(10);
        Random rand = new Random();
        int i = 0;
        while (i < 20) {
            root.add(root, rand.nextInt(50));
            i++;
        }
        System.out.println(root);
    }

}
