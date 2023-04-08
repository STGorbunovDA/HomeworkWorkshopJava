package task;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static Integer numberTranslation(String word) {
        int result = 0;
        int number = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = word.length() - 1; i >= 0; i--) {
            int current = map.get(word.charAt(i));
            if (current < number) {
                result -= current;
            } else {
                result += current;
            }
            number = current;
        }
        return result;
    }
}
