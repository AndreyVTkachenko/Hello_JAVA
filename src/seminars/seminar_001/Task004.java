package seminars.seminar_001;

public class Task004 {
    //    Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
    public static void main(String[] args) {
        String line = "Добро пожаловать на курс по Java";
        String [] words = line.split(" ");
        String result = " ";
        for (int i = words.length - 1; i >=0 ; i--) {
            result += words[i];
            result += " ";
        }
        System.out.println(result.trim());
    }
}
