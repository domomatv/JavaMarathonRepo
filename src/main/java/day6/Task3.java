package day6;

/**
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два раза,
 * передав разные значения. Вызвать метод info().
 */
public class Task3 {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("МарьИвановна", "Литература");
        Student student = new Student("Петров");

        teacher.examinate(student);

    }
}
