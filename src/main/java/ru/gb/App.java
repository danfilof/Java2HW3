package ru.gb;

import java.util.*;

public class App {

    public static void main(String[] args) {

        //FIRST TASK
        // инициализирую listArray
        List<String> artists = Arrays.asList("The Beatles", "Elvis Presley", "The Beatles", "The Rolling Stones", "Chuck Berry", "Bob Marley", "Queen", "The Beatles", "Chuck Berry", "Queen",
                "Led Zeppelin", "Queen", "The Beatles", "AC/DC", "Nirvana", "Johnny Cash", "Michael Jackson", "AC/DC", "Nirvana", "Queen" );
        // инициализирую Hashset, так как он убирает повторяющиеся значения ячеек
        Set<String> uniqueArtists = new HashSet<String>(artists);

        System.out.println("Уникальные артисты: " + uniqueArtists.toString());

        // Запускаю цикл по коллекции, где ключи - уникальные исполнители. На сайте stackoverflow нашел информацию про функцию Collections.frequency, использую ее для упрощения работы
        for (String key : uniqueArtists) {
            System.out.println(key + " встречались в коллекции " + Collections.frequency(artists, key) + " раз.");
        }

    }
}
