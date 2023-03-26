//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//        (через FileWriter).
package task;
import java.io.File;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void bubbleSort(int[] arr) {
        File file = new File("test.txt");
        file.delete();
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            write("Промежуточный результат на " + (i+1) + "-й итерации: " + Arrays.toString(arr) + "\n");
        }
        System.out.println("Recorded");
    }
    private static void write(String str){
        try (FileWriter in = new FileWriter("test.txt",true)){
            in.append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

