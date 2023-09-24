package seminars.seminar_001;

import java.time.LocalTime;
import java.util.Scanner;

public class Task001 {
    // В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
    // "Доброе утро, <Имя>!" если время от 05:00 до 11:59
    // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >= 5 && hour < 12){
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18){
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23){
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
