package day6;

/**
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два раза,
 * передав разные значения. Вызвать метод info().
 */
public class Task1 {

    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.setColor("red");
        auto.setModel("bmw");
        auto.setYear(1992);

        System.out.println(auto.getDiffBtwYearEnteredYear(2020));
        auto.whatIsIt();
    }
}
