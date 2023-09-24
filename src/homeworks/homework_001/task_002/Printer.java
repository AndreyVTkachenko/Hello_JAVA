package homeworks.homework_001.task_002;
//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
//каждое на новой строке.
//Напишите свой код в методе printPrimeNums класса Answer.
//
//Пример
//1
//2
//3
//5
//7
//11
//...
class Answer {
    public static void printPrimeNums() {
        for (int i = 1; i <= 1000; i++) {
            boolean Prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                System.out.println(i);
            }
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}