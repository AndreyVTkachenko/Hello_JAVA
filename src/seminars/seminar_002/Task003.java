package seminars.seminar_002;

import java.util.Locale;

public class Task003 {
    /*
    Напишите метод, который принимает на вход строку (String) и определяет, является ли
    строка палиндромом (возвращает boolean значение).
    Палиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
     */
    public static void main(String[] args) {
        String x = "Потоп";
        if(palindrom(x)){
            System.out.println("Является палиндромом");
        }
        else{
            System.out.println("Не является палиндромом");
        }
    }
    static boolean palindrom(String x){
        x = x.toLowerCase();
        char [] sum = x.toCharArray();
        for (int i = 0; i < sum.length / 2; i++) {
            if (sum[i] != sum[sum.length-1-i])
                return false;
        }
        return true;
    }

}
