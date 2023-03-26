// Вычислить n-ное треугольное число (сумма чисел от 1 до n) и n!
package Task_1;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        
        int sum;
        sum = n*(n+1)/2;        
        System.out.printf("Сумма чисел от 1 до " + n + " равна: %s\n", sum); 
    }
}

