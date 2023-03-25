//n! (произведение чисел от 1 до n)

package Task_2;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int factorial = 1;
        if (n == 0 && n == 1) {
            factorial = 1;
        } else {
            for (int i = 2; i <= n; i++) {
            factorial *=i;
            }
        }
        System.out.printf("Факториал числа " + n + " равен: %s\n", factorial); 
    }
}
