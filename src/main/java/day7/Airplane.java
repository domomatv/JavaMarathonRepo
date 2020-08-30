package day7;


/**
 * Создать класс Самолет с полями “изготовитель”, “год выпуска”, “длина”, “вес”, “объем топлива в баке”.
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса (значение поля “объем топлива в баке” установить равным 0).
 * В конструкторе для передачи полям значений использовать ключевое слово this.
 * Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., объем топлива в баке: …”
 * Также, необходимо реализовать метод fillUp(), который в качестве аргумента принимает число и заправляет топливный бак самолета на это значение.
 */

public class Airplane {

    private int year;
    private int length;
    private int weight;
    private int volumeDeisel;
    private String producer;


    public Airplane(int year, int length, int weight, String producer) {
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.volumeDeisel = 0;
        this.producer = producer;
    }

    public static void whichLarger(Airplane air1, Airplane air2) {

        String message;
        if (air1.getLength() > air2.getLength()) {
            message = "первый длинее";
        } else if (air1.getLength() < air2.getLength()) {
            message = "второй длинее";
        } else {
            message = "самолеты одинаковы по длине";
        }


        System.out.println(message);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolumeDeisel() {
        return volumeDeisel;
    }

    public void setVolumeDeisel(int volumeDeisel) {
        this.volumeDeisel += volumeDeisel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void fillUp(int volumeDeisel) {
        this.setVolumeDeisel(volumeDeisel);
    }

    public void info() {
        System.out.printf("Изготовитель: %s , год выпуска: %d, длина: %d, вес: %d, объем топлива в баке: %d",
                this.getProducer(), this.getYear(), this.getLength(), this.getWeight(), this.getVolumeDeisel());
    }

}


