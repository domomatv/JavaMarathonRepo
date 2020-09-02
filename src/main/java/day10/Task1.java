package day10;


import java.util.Random;

/**
 Когда двоичное дерево, изображенное выше, будет создано, необходимо используя рекурсию вывести в консоль все числа
 из этого двоичного дерева поиска в отсортированном виде. Ваше решение должно работать для любого корректного двоичного дерева поиска.
 Этому методу необходимо передавать на вход ссылку на корень дерева.

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
        root.print(root);
    }

}
