package day1;

public class Task4 {

    public static void main(String[] args) {

        int age = 28;
        int limit = 100;
        while (age < limit) {
            System.out.println(String.format("Мой возраст %d", age));
            age += 5;
        }
    }
}
