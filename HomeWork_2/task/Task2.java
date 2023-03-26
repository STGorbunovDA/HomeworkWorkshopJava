//Дана строка json:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//  Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
//  Студент [фамилия] получил [оценка] по предмету [предмет].
//  Например:
//     Студент Иванов получил 5 по предмету Математика.
//     Студент Петрова получил 4 по предмету Информатика.
//     Студент Краснов получил 5 по предмету Физика.
package task;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public static void parsingJSON()
    {
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

                StringBuilder result = new StringBuilder();
                String line1= line.replace("[", "");
                String line2= line1.replace("]", "");
                String[] parts = line2.split(",");

                for (String part : parts) {

                    String[] kv = part.split(":");

                    if (kv[0].equals("{\"фамилия\"") || kv[0].equals(" {\"фамилия\"")) {

                        result.append("Студент ")
                                .append(kv[1].replaceAll("\"", ""))
                                .append(" ");

                    } else if (kv[0].equals("\"оценка\"")) {

                        result.append("получил ")
                                .append(kv[1].replaceAll("\"", ""))
                                .append(" ");

                    } else if (kv[0].equals("\"предмет\"")) {

                        result.append("по предмету ")
                                .append(kv[1].replaceAll("\"", "")
                                        .replace("}","")).append(".");
                    }
                }
                System.out.println(result.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
