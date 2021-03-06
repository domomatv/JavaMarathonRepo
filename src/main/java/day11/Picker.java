package day11;

/**
 * Каждый раз когда сотрудник выполняет свою работу (вызов метод doWork()), ему выплачивается заработная плата (сокр. ЗП) (80 - сборщику, 100 - курьеру).
 * А также при вызове doWork() у Сборщика, происходит увеличение значения поля countOrder в классе Warehouse на 1.
 * При вызове doWork() у Курьера, происходит увеличение переменной balance в классе Warehouse на 1000.
 * Сотрудникам полагается бонус: когда на складе отгружено 1500 заказов, заработанная к тому моменту ЗП сборщика утраивается.
 * Когда складом заработан 1.000.000, заработанная к тому моменту ЗП курьера удваивается.
 */

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public void doWork() {
        salary += 80;
        warehouse.countOrder++;
        if (warehouse.countOrder == 1500) {
            bonus();
        }

    }

    public void bonus() {
        System.out.println("picker before bonus" + salary);
        salary *= 3;
        System.out.println("picker after bonus" + salary);


    }
}
