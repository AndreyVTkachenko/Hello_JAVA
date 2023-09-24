package seminars.seminar_002;

import java.io.FileWriter;

public class Task004_var2 {
    /*
Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
    public static void main(String[] args) {
        String filePath = "src/seminars/seminar_002/test.txt";
        String s = "NewTest";
        int count = 5;
        String temp = repeat(s, count);
        writeToFile(filePath, temp);
    }

    static String repeat(String s, int n){
        return s.repeat(n);
    }

    static void writeToFile(String filePath, String s){
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(s);
            writer.write("\n");
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Запись не удалась");
        }
    }
}
