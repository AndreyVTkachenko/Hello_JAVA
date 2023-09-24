package seminars.seminar_001;

public class Task002 {
    //    Дан массив двоичных чисел, например [1,1,0,1,1,1],
    //    вывести максимальное количество подряд идущих 1.
    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1};
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (max < count) {
                    max = count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println("Ответ: " + max);
    }
}
