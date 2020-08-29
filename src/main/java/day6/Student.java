package day6;


/**
 * Создать класс "Студент" с полем “ФИО”.
 */

public class Student {

    private String FIO;

    public Student(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}


