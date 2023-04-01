package task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task2 {
    public static ArrayList<Integer> delValueInList(ArrayList<Integer> list) {

        Iterator<Integer> iteratorList = list.iterator();

        while (iteratorList.hasNext()) {
            int item = iteratorList.next();
            if (item % 2 == 0) iteratorList.remove();
        }
        return list;
    }

    public static ArrayList<Integer> getRandomList(int size, int upperBond) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(upperBond));
        }
        return list;
    }
}
