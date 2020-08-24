package day1;

public class Task6 {

    public static void main(String[] args) {

        int k = 5;
        int end = 9;

        for (int start = 1; start <= end; start++) {
            System.out.printf("%d x %d = %d%n", start, k, start * k);
        }
    }
}
