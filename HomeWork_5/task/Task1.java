package task;

import java.util.ArrayList;
import java.util.Map;

public class Task1 {

    public static void addNumber(String key, String value, Map<String, ArrayList<String>> map) { // Метод, добавляющий номера в книгу
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<String>> map) { // Метод, печатающий список контактов
        for (var item : map.entrySet()) {
            String phones = "";
            for (String el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}
