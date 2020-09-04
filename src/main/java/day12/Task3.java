package day12;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 3. Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
 * Создать 10 или более экземпляров класса MusicBand , добавить их в список. Перемешать список. Создать второй список,
 * в который скопировать группы из первого списка, основанные после 2000 года. Вывести в консоль оба списка.
 * Примечание: выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен.
 */
public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<MusicBand>();
        musicBands.add(new MusicBand("groupName1", 1991));
        musicBands.add(new MusicBand("groupName2", 1992));
        musicBands.add(new MusicBand("groupName3", 1992));
        musicBands.add(new MusicBand("groupName4", 1993));
        musicBands.add(new MusicBand("groupName5", 1994));
        musicBands.add(new MusicBand("groupName6", 1995));
        musicBands.add(new MusicBand("groupName7", 1996));
        musicBands.add(new MusicBand("groupName8", 1997));
        musicBands.add(new MusicBand("groupName9", 1998));
        musicBands.add(new MusicBand("groupName10", 1999));
        musicBands.add(new MusicBand("groupName11", 2000));
        musicBands.add(new MusicBand("groupName12", 2001));
        musicBands.add(new MusicBand("groupName13", 2002));
        musicBands.add(new MusicBand("groupName14", 2003));

        Collections.shuffle(musicBands);

        List<MusicBand> musicBandsAfter2000 = musicBands.stream()
                .filter(e -> e.getYear() >= 2000)
                .collect(Collectors.toList());
        System.out.println(musicBands.toString());
        System.out.println(musicBandsAfter2000.toString());
    }
}
