package day1;

public class Task6 {

    public static void main(String[] args) {

        int k = 5;
        int start, end = 9;

        for (start = 1; start <= end; start++) {
            System.out.println(String.format("%d x %d = %d", start, k, start * k));
        }
    }
}
