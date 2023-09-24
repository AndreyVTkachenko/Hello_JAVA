package seminars.seminar_001;

import java.util.Scanner;

public class Task005 {
    //    Реализовать функцию возведения числа a в степень b; a, b из Z. Сводя количество выполняемых действий
    //    к минимуму.
    //    Пример 1: а = 3, b = 2, ответ: 9
    //    Пример 2: а = 2, b = -2, ответ: 0.25
    //    Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = Integer.valueOf(scanner.nextLine());
        System.out.println("Введите показатель степени: ");
        int m = Integer.valueOf(scanner.nextLine());
        int result = 1;
        result = getResult(m, result, n);
        System.out.println("Число " + n + " в степени " + m + " равно: " + result);
    }

    private static int getResult(int m, int result, int n) {
        if (m == 0){
            return 1;
        }
        for (int i = 0; i < m; i++) {
            result *= n;
        }
        return result;
    }
}