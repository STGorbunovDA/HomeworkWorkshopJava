import java.io.Console;
import java.util.Scanner;

public class Main {
    static OnlineStore onlineStore = new OnlineStore();
    public static void main(String[] args) {

        while (true) {
            //не нашёл очистку терминала, банальненько
            System.out.print("\033[H\033[2J");
            selectNote();
        }

    }
    //Интерфейс пользователя
    public static void selectNote() {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите по какому критерию необходимо отобрать ноутбуки:\n" +
                "1 - производитель\n" +
                "2 - цвет\n" +
                "3 - диагональ\n" +
                "4 - объем жесткого диска\n" +
                "5 - объем оперативной памяти\n" +
                "6 - операционна система\n" +
                "7 - Price\n"+
                "8 - показать всё");
        int command = in.nextInt();
        if (command == 1) {
            onlineStore.selectCompany();
        } else if (command == 2) {
            onlineStore.selectColor();
        } else if (command == 3) {
            onlineStore.selectDiagonal();
        } else if (command == 4) {
            onlineStore.selectVolHardDisk();
        } else if (command == 5) {
            onlineStore.selectVolRam();
        } else if (command == 6) {
            onlineStore.selectOs();
        } else if (command == 7) {
            onlineStore.selectPrice();
        } else if (command == 8) {
            onlineStore.printInfo();
        }
    }

}
