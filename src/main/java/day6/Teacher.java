package day6;


import java.util.Random;

/**
 * Создать класс "Преподаватель", имеющий поля “ФИО”, “Предмет”.
 */

public class Teacher {

    private String FIO;
    private String subject;

    public Teacher(String FIO, String subject) {
        this.FIO = FIO;
        this.subject = subject;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @param student метод "оценить студента" принимающий в параметры студента, и работающий следующим образом:
     *                генерируется случайное число от 2 до 5,
     *                выводится строка: "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
     *                Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
     *                ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
     *                в зависимости от значения случайного числа.
     */

    public void examinate(Student student) {

        Random rand = new Random();
        int markDigit = rand.nextInt(4) + 2;
        String mark;
        switch (markDigit) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
            default:
                mark = null;
                break;
        }


        System.out.printf(
                "Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.",
                this.getFIO(), student.getFIO(), this.getSubject(), mark
        );
    }
}


