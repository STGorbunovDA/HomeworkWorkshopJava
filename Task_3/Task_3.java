// Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка только на 1 
// и на само себя (1 - это не простое число);

package Task_3;

public class Task_3 {
    public static void main(String[] args) {
        boolean flag = true;

        for (int number = 2; number <= 1000; number++) {
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                System.out.print(number + " ");
        }
    }
}
