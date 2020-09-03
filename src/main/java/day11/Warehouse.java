package day11;

public class Warehouse {
    public static int countOrder;
    public static int balance;

    @Override
    public String toString() {
        return "заказы: " + countOrder + ", баланс: " + balance;
    }
}
