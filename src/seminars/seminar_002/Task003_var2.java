package seminars.seminar_002;

public class Task003_var2 {
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
        String s1 = x.toLowerCase();
        StringBuilder res = new StringBuilder(s1);
        String s2 = res.reverse().toString();
        return s1.equals(s2);
    }

}
