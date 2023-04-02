package task;

import java.util.LinkedList;

public class QueueUsingLinkedList_Task2 {

    public static void enqueue(LinkedList<Integer> list, int item) {
        list.addLast(item);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = list.get(0);
        return num;
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
