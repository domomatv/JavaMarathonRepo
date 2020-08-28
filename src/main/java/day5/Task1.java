package day5;

/**
 * 1. Создать класс Автомобиль, с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать геттеры и сеттеры для каждого поля.
 * Создать экземпляр класса Автомобиль, задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {

    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.setColor("red");
        auto.setModel("bmw");
        auto.setYear(1992);

        System.out.printf("цвет  %s, модель %s, год %d", auto.getColor(), auto.getModel(), auto.getYear());
    }


}
