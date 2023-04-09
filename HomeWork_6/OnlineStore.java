import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class OnlineStore {
    HashSet<Notebook> noteSet;
    RepositoryModel repositoryModel;
    public OnlineStore(){
        noteSet = new HashSet<>();
        repositoryModel = new RepositoryModel();
        noteSet = repositoryModel.createNotebook();// наполняем ноутбуками
    }
    //Печать всех ноутбуков
    public void printInfo() {
        for (Notebook elem : noteSet) {
            System.out.println(elem);
        }
    }

    public void selectCompany() {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужную компанию:\n" +
                "1 - Msi\n" +
                "2 - Asus\n" +
                "3 - Acer\n");
        int n = in.nextInt();
        HashMap<Integer, String> comp = new HashMap<Integer, String>();
        comp.put(1, "Msi");;
        comp.put(2, "Asus");;
        comp.put(3, "Acer");;
        int i = 1;
        for (Notebook elem : noteSet) {
            if (elem.getCompany().equals(comp.get(n))) {
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }

    public void selectColor() {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужный цвет:\n" +
                "1 - Black\n" +
                "2 - White\n" +
                "3 - Grey\n");
        int n = in.nextInt();
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        color.put(1, "Black");
        color.put(2, "White");
        color.put(3, "Grey");
        int i = 1;
        for (Notebook elem : noteSet) {
            if (elem.getColor().equals(color.get(n))) {
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }
    public void selectDiagonal() {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите нужную диагональ:\n" +
                "1 - от 13 до 15 дюймов\n" +
                "2 - от 15 до 19 дюймов\n" +
                "3 - от 19 до 24 дюймов\n");
        int n = in.nextInt();
        HashMap<Integer, float[]> diagonal = new HashMap<Integer, float[]>();
        diagonal.put(1, new float[] { 13.0f, 14.9f });
        diagonal.put(2, new float[] { 15.0f, 18.9f });
        diagonal.put(3, new float[] { 19.0f, 23.9f });
        int i = 1;
        for (Notebook elem : noteSet) {
            if (diagonal.get(n)[0] < elem.getDiagonal() && elem.getDiagonal() < diagonal.get(n)[1]) {
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }

    public void selectVolHardDisk() {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите объём жесткого диска:\n" +
                "1 - 64 Гб\n" +
                "2 - 128 ГБ\n" +
                "3 - 256 Гб\n");
        int n = in.nextInt();
        HashMap<Integer, Integer> hardDrive = new HashMap<Integer, Integer>();
        hardDrive.put(1, 64);
        hardDrive.put(2, 128);
        hardDrive.put(3, 256);
        int i = 1;
        for (Notebook elem : noteSet) {
            if (elem.getVolHardDisk() == hardDrive.get(n)) {
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }
    public void selectVolRam() {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите объём оперативной памяти:\n" +
                "1 - 4ГБ\n" +
                "2 - 8ГБ\n" +
                "3 - 12ГБ\n");
        int n = in.nextInt();
        HashMap<Integer, Integer> ram = new HashMap<Integer, Integer>();
        ram.put(1, 4);
        ram.put(2, 8);
        ram.put(3, 12);
        int i = 1;
        for (Notebook elem : noteSet) {
            if (elem.getVolRam() == ram.get(n)) {
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }

    public void selectOs() {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите операционную систему:\n" +
                "1 - Windows\n" +
                "2 - Linux\n" +
                "3 - macOS\n");
        int n = in.nextInt();
        HashMap<Integer, String> os = new HashMap<Integer, String>();
        os.put(1, "Windows");
        os.put(2, "Linux");
        os.put(3, "macOS");
        int i = 1;
        for (Notebook elem : noteSet) {
            if (elem.getOS().equals(os.get(n))) {
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }

    public void selectPrice() {
        Scanner in = new Scanner(System.in);
        System.out.println("выберите Price:\n" +
                "1 - от 10_000 рублей до 30_000\n" +
                "2 - от 31_000 рублей до 50_000\n" +
                "3 - от 51_000 рублей до 500_000\n");
        int n = in.nextInt();
        HashMap<Integer, int[]> price = new HashMap<Integer, int[]>();
        price.put(1, new int[] { 10000, 30000 });
        price.put(2, new int[] { 31000, 50000 });
        price.put(3, new int[] { 51000, 500000 });
        int i = 1;
        for (Notebook elem : noteSet) {
            if (price.get(n)[0] < elem.getPrice() && elem.getPrice() < price.get(n)[1]) {
                System.out.println(i++);
                System.out.println(elem);
            }
        }
    }

}
