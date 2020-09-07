package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Вам дан файл с информацией об остатках обуви на складе, это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
 * в качестве разделителя использован символ “;”). В этом файле содержится информация о названии модели обуви, ее размер и оставшееся на складе количество.
 */

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {


        try {
            File file = new File("src/main/java/day15/shoes.csv");
            PrintWriter pw = new PrintWriter("src/main/java/day15/shoesWithCount0.csv");
            List<Shoes> list = new ArrayList<>();

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] stringArr = scanner.nextLine().split(";");
                list.add(new Shoes(
                        stringArr[0],
                        Integer.parseInt(stringArr[1]),
                        Integer.parseInt(stringArr[2])

                ));
            }
            list.stream().filter(e -> e.getCount() == 0).forEach(pw::println);
            pw.close();
            ;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

}
