package day12;


import java.util.Arrays;

/**
 * 4. Доработать класс MusicBand из прошлого задания таким образом, чтобы в группу можно было добавлять и удалять участников.
 * Под участником понимается строка (String) с именем и фамилией. Реализовать метод слияния групп, т.е. все участники группы
 * А переходят в группу B (участники не могут находиться в двух группах одновременно).
 * Реализовать метод, выводящий список участников в консоль. Проверить состав групп после слияния.
 */
public class Task4 {

    public static void main(String[] args) {

        MusicBand kasta = new MusicBand("Каста", 2000);
        kasta.getMembers().addAll(Arrays.asList("Влади", "Шым", "Хамиль", "Змей"));

        MusicBand beatles = new MusicBand("Beatles", 1960);
        beatles.getMembers().addAll(Arrays.asList("Джон Леннон", "Пол Маккартни", "Джордж Харрисон", "Ринго Старр"));

        kasta.mergeMember(beatles);


        System.out.println(kasta.getMembers());
        System.out.println(beatles.getMembers());
    }
}
