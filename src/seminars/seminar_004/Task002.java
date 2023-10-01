package seminars.seminar_004;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task002 {
    //    Реализовать консольное приложение, которое:
    //    Принимает от пользователя строку вида
    //    text~num
    //    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
    //    Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            String line = scanner.nextLine();
            String[] partsLine = line.split("~");
            String text = partsLine[0];
            String strNum = partsLine[1];
            int num = Integer.parseInt(strNum);
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
}
