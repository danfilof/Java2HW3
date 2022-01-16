package ru.gb;

import java.util.*;

public class App {


//    1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
//    из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое слово.


//    2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
//    С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
//    (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

    public static void main(String[] args) {

        //FIRST TASK
        // инициализирую listArray
        List<String> artists = Arrays.asList("The Beatles", "Elvis Presley", "The Beatles", "The Rolling Stones", "Chuck Berry", "Bob Marley", "Queen", "The Beatles", "Chuck Berry", "Queen",
                "Led Zeppelin", "Queen", "The Beatles", "AC/DC", "Nirvana", "Johnny Cash", "Michael Jackson", "AC/DC", "Nirvana", "Queen" );
        // инициализирую Hashset, так как он убирает повторяющиеся значения ячеек
        Set <String> uniqueArtists = new HashSet<String>(artists);

        System.out.println("Уникальные артисты: " + uniqueArtists.toString());

        // Запускаю цикл по коллекции, где ключи - уникальные исполнители. На сайте stackoverflow нашел информацию про функцию Collections.frequency, использую ее для упрощения работы
        for (String key : uniqueArtists) {
            System.out.println(key + " встречались в коллекции " + Collections.frequency(artists, key) + " раз.");
        }


        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");

        // SECOND TASK

        phoneBook book = new phoneBook(); // Создаю экземпляр phoneBook

        // Добавляю данные в формате двух String
        book.add("Ivanov", "457239367457");
        book.add("Petrov", "56564576");
        book.add("Ivanov", "888765447");
        book.add("Sidorov", "56545");
        book.add("Vano", "122345656");


        // Вывод в консоль все номера, где ключ - String "Ivanov"
        System.out.println(book.get("Ivanov"));
    }
}
