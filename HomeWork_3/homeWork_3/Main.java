package homeWork_3;

import task.Task1;
import task.Task2;
import task.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /* Task1
        int[] array = new int[] {2,3,5,1,1};
        System.out.println(Task1.arrayToString(array));
        array = Task1.mergeSort(array);
        System.out.println(Task1.arrayToString(array));
         */

        /* Task2
        ArrayList<Integer> numbers = Task2.getRandomList(10, 15);
        System.out.printf("Первоначальный список:     %s\n", numbers.toString());
        System.out.printf("Список нечетных элементов: %s\n", Task2.delValueInList(numbers).toString());
         */

        /* Task3
        ArrayList<Integer> numbers = Task2.getRandomList(10, 50);
        int maxValue = Collections.max(numbers);
        int minValue = Collections.min(numbers);
        double averageValue = Task3.getAverageValue(numbers);
        System.out.printf("Полученный список: %s\n", numbers.toString());
        System.out.printf("Максимальное значение в списке: %d\nМинимальное значение списка: %d\n" +
                "Среднее арифмитеческое элементов списка: %.2f\n", maxValue, minValue, averageValue);
         */

    }
}
