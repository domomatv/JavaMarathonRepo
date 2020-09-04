package day12;


import java.util.Arrays;

/**
 * 5. Требования поменялись - теперь у участника музыкальной группы есть не только имя, но и возраст.
 * Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand таким образом, чтобы участники были - объекты класса MusicArtist.
 * После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
 * Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
 */
public class Task5 {

    public static void main(String[] args) {

        MusicBand<MusicArtist> kasta = new MusicBand("Каста", 2000);
        kasta.getMembers().addAll(
                Arrays.asList(
                        new MusicArtist("Влади", 15),
                        new MusicArtist("Шым", 16),
                        new MusicArtist("Хамиль", 17),
                        new MusicArtist("Змей", 15)
                )
        );

        MusicBand<MusicArtist> beatles = new MusicBand("Beatles", 1960);
        beatles.getMembers().addAll(
                Arrays.asList(
                        new MusicArtist("Джон Леннон", 20),
                        new MusicArtist("Пол Маккартни", 21),
                        new MusicArtist("Джордж Харрисон", 22),
                        new MusicArtist("Ринго Старр", 23)
                )

        );

        kasta.mergeMember(beatles);


        System.out.println(kasta.getMembers());
        System.out.println(beatles.getMembers());
    }
}
