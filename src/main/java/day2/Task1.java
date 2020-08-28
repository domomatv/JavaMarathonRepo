package day2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String message = "";

        if (1 <= a && a <= 4)
            message = "Малоэтажный дом";
        if (5 <= a && a <= 8)
            message = "Среднеэтажный дом";
        if (a >= 9)
            message = "Многоэтажный дом";
        if (a < 1)
            message = "Ошибка ввода";

        System.out.print(message);

    }
}
