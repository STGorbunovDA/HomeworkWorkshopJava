package homeWork_3;
import task.QueueUsingLinkedList_Task2;
import task.ReverseLinkedList_Task1;

import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

/* Task1
            _______________________________________________________
            Пусть дан LinkedList с несколькими элементами.
            Реализуйте метод, который вернет “перевернутый” список.
            _______________________________________________________


        LinkedList<Integer> list = new LinkedList<>();

        //Применяем методы из Task2
        for (int i = 0; i < 10; i++) {
            QueueUsingLinkedList_Task2.enqueue(list, QueueUsingLinkedList_Task2.getRandomNumber());
        }
        System.out.println("Исходный список: " + list);

        LinkedList<Integer> reversedList = ReverseLinkedList_Task1.reverseLinkedList(list);
        System.out.println("Перевернутый список: " + reversedList);

*/


/* Task2
            _______________________________________________________________
            Реализуйте очередь с помощью LinkedList со следующими методами:
            enqueue() - помещает элемент в конец очереди,
            dequeue() - возвращает первый элемент из очереди и удаляет его,
            first() - возвращает первый элемент из очереди, не удаляя.
            _______________________________________________________________


        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            QueueUsingLinkedList_Task2.enqueue(list, QueueUsingLinkedList_Task2.getRandomNumber());
        }
        System.out.println("Созданный LinkedList: " + list);
        System.out.println("Первый элемент в очереди: " + QueueUsingLinkedList_Task2.dequeue(list));
        System.out.println("Удалили первый элемент в очереди: " + list);
        System.out.println("Новый первый элемент в очереди: " + QueueUsingLinkedList_Task2.first(list));
        System.out.println("Созданный LinkedList: " + list);
        System.out.println();
*/


    }
}

