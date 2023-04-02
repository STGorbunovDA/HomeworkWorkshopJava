package task;

import java.util.LinkedList;

public class ReverseLinkedList_Task1 {

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {

        // создаем новый LinkedList для хранения перевернутого списка
        LinkedList<Integer> reversedList = new LinkedList<>();

        // проходим по элементам исходного списка в обратном порядке
        // и добавляем их в новый список
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
