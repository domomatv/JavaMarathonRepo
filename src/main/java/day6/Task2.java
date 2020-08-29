package day6;

/**
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два раза,
 * передав разные значения. Вызвать метод info().
 */
public class Task2 {

    public static void main(String[] args) {

        Plane plane = new Plane(
                2010, 10, 20, "tupolev"
        );

        plane.setYear(2012);
        plane.setLength(20);
        plane.fillUp(100);
        plane.fillUp(200);
        plane.info();
    }
}
