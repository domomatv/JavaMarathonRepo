package day1;

public class Task5 {

    public static void main(String[] args) {

        int limit = 100;

        for (int age = 20; age < limit; age += 5) {
            System.out.println(String.format("Мой возраст %d", age));
        }
    }
}
