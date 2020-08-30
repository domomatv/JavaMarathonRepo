package day7;

/**
 * 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
 * В классе Самолет создать статический метод, который в качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task1 {

    public static void main(String[] args) {

        Airplane airplane1 = new Airplane(2020, 20, 20, "tupolev");
        Airplane airplane2 = new Airplane(2020, 20, 20, "su");

        Airplane.whichLarger(airplane1, airplane2);
    }
}
