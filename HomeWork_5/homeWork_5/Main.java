package homeWork_5;

import task.Task1;
import task.Task2;
import task.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static task.Task2.repeatNameCountAndSortedMap;
import static task.Task3.numberTranslation;

public class Main {
    public static void main(String[] args) {

        /* Task1
            _______________________________________________________
            Реализуйте структуру телефонной книги с помощью HashMap,
            учитывая, что 1 человек может иметь несколько телефонов.
            ________________________________________________________

        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        Task1.addNumber("Дмитрий Горбунов", "89011090100", phoneBook);
        Task1.addNumber("Александр Комаров", "89201090101", phoneBook);
        Task1.addNumber("Дмитрий Голов", "89243090100", phoneBook);
        Task1.addNumber("Дмитрий Горбунов", "89141090100", phoneBook);
        Task1.addNumber("Дмитрий Голов", "89100112111", phoneBook);
        Task1.addNumber("Егор Лавыгин", "89011090100", phoneBook);
        Task1.printBook(phoneBook);

         */

        /* Task2
            ______________________________________________________
            Написать программу, которая найдёт
            и выведет повторяющиеся имена с количеством повторений.
            Отсортировать по убыванию популярности.
            ______________________________________________________

        Map<String, Integer> nameMap = new HashMap<>();
        String employees = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова " +
                "Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова " +
                "Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников " +
                "Петр Петин Иван Ежов ";
        System.out.println(repeatNameCountAndSortedMap(employees,nameMap));

         */

        /* Task3
            _______________________________________
            Написать метод, который переводит число
            из римского формата записи в арабский.
            _______________________________________

            String wordRoman = "MMXXII";
            System.out.println(numberTranslation(wordRoman));

         */

        /* Task4
            ________________________________________________________
            Реализовать алгоритм пирамидальной сортировки (HeapSort).
            ________________________________________________________
            
        int[] arr = new int[] { 1, 2, 5, 8, 0, 90, 12, 1099, -2};
        System.out.println("Обычный массив");
        System.out.println(Task4.arrayToString(arr));
        System.out.println("HeapSort");
        System.out.println(Task4.arrayToString(Task4.heapsort(arr)));

         */



    }
}
