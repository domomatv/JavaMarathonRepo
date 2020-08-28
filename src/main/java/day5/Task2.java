package day5;

/**
 * 2. Создать класс Мотоцикл, с  полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 */
public class Task2 {

    public static void main(String[] args) {

        Moto moto = new Moto(
                1992, "blue", "suzuki"
        );

        MotoLombok moto2 = new MotoLombok(
                1992, "blue", "suzuki"
        );


        System.out.printf("цвет  %s, модель %s, год %d%n", moto.getColor(), moto.getModel(), moto.getYear());
        System.out.printf("цвет  %s, модель %s, год %d", moto2.getColor(), moto2.getModel(), moto2.getYear());

    }


}
