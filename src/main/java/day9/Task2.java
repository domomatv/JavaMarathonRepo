package day9;


/**
 * Создайте в методе main() класса Task1 объект класса Студент и объект класса Преподаватель.
 * Выведите в консоль название учебной группы у объекта-студента и название предмета у объекта-преподавателя.
 * Затем, вызовите printInfo() на объектах и посмотрите на результат.
 */
public class Task2 {

    public static void main(String[] args) {

        Student student = new Student("Иванов", "группа123");
        Teacher teacher = new Teacher("Семен Павлович", "java");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubject());
        student.printInfo();
        teacher.printInfo();


    }

}
