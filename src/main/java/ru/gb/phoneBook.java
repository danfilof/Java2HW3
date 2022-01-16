package ru.gb;

import java.util.*;

public class phoneBook {

    private HashMap<String, List<String>> phoneBook = new HashMap<>(); // Использую именно Map, так как под одинаковыми фамилиями могут находиться разные номера

    // Добавление ключа.Если имеется ключ surname, тогда добавить к нему номер. Если ключа нет, тогда положить новые значения ключа(String surname) и номер
    public void add(String surname, String number) {
        if (phoneBook.containsKey(surname)) {
            List<String> numbers = phoneBook.get(surname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("По фамилии %s добавлен новый номер %s", surname, number));
            } else {
                 // continue; по какой-то причине continue; выдает ошибку
                System.out.println("Ничего не происходит, так как в любом случае номер записывается");
            }
        } else {
            phoneBook.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("По фамилии %s добавлен новый номер %s", surname, number));
        }
    }

    // Проверка на наличие ключа. Если он есть - вернуть его. Если нет - вывести в консоль
    public List<String> get(String surname) {
        if (phoneBook.containsKey(surname)) {
            return phoneBook.get(surname);
        } else {
            System.out.println(String.format("Нет человека по фамилии %s", surname));
            return new ArrayList<>();
        }
    }
}