package seminars.seminar_002;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task005 {
    /*
    Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
    который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "src/seminars/seminar_002/test.txt";
        String logPath = "src/seminars/seminar_002/log.txt";
        String s = "TEXT";
        int count = 5;

        createLogger(logPath);
        String temp = repeat(s, count);
        writeToFile(filePath, temp);
        closeLogger();
    }

    static String repeat(String s, int n){
        return s.repeat(n);
    }

    static void createLogger(String logPath){
        SimpleFormatter formatter = new SimpleFormatter();
        FileHandler handler = null;
        try {
            handler = new FileHandler(logPath, true);
            handler.setFormatter(formatter);
            logger.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers){
            handler.close();
        }
    }

    static void writeToFile(String filePath, String s){
        try (FileWriter writer = new FileWriter(filePath, true)){
            writer.write(s);
            writer.write("\n");
            writer.flush();
            logger.info("Запись в файл выполнена успешно");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Запись не удалась");
            logger.warning("Запись не удалась");
        }
    }
}
