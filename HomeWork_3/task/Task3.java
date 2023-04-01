package task;

import java.util.ArrayList;

public class Task3 {
    public static Double getAverageValue(ArrayList<Integer> list) {
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        double averageValue = (double) sum / list.size();
        return averageValue;
    }
}
