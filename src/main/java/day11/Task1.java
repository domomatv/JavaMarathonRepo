package day11;


/**
 * Для демонстрации и тестирования работы программы создайте склад и по 1 рабочему, вызовите у каждого методы doWork()
 * и bonus(), столько раз, чтобы каждый из сотрудников получил бонус.
 * <p>
 * Выведите в консоль баланс и количество выполненных заказов на складе и ЗП каждого из сотрудников.
 */
public class Task1 {

    public static void main(String[] args) {
        Courier courier = new Courier();
        Picker picker = new Picker();
        Warehouse warehouse = new Warehouse();

        int i = 0;
        while (i < 1501) {
            courier.doWork();
            picker.doWork();

            i++;
        }
        System.out.println(warehouse.toString());
    }

}
