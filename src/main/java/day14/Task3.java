package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 3. Создать класс “Человек” с полями “имя” и “возраст”. Реализовать статический метод List<Person> parseFileToObjList(),
 * который считывает содержимое того же файла people.txt, создает экземпляры класса “Человек” и возвращает список объектов.
 * Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
 * Помимо этого, если значение возраста отрицательно, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
 * <p>
 * <p>
 * Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]
 */
public class Task3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        System.out.println(parseFileToStringList());
    }

    public static List<Person> parseFileToStringList() {
        File file = new File("src/main/java/day14/people.txt");
        List<String> list = new ArrayList<>();
        List<Person> persons = new ArrayList<>();
        try {

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }

            list.forEach(s ->
                    {
                        String[] stringArr = s.split(" ");
                        int readedAge = Integer.parseInt(stringArr[1]);

                        if (readedAge <= 0) {
                            try {
                                throw new IOException();
                            } catch (IOException exep) {
                                System.out.println("Некорректный входной файл");
                            }
                        }
                        persons.add(new Person(stringArr[0], readedAge));

                    }
            );


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        return persons;

    }

    ;
}
