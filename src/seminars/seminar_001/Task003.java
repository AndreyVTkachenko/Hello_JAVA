package seminars.seminar_001;

import java.util.Arrays;

public class Task003 {
//    Дан массив numbs = [3,2,5,3] и число val = 3.
//    Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//    Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//    а остальные - равны ему.
    public static void main(String[] args){
        int[] array = {3, 2, 5, 3};
        int value = 3;
        int[] result = sort(array, value);
        System.out.println(Arrays.toString(result));
        }
    static int[] sort(int[] array, int value){
        int[] result = new int[array.length];
        Arrays.fill(result, value);
        for (int i = 0, j = 0;  i < array.length; i++){
            if (array[i] != value){
                result[j++] = array[i];
            }
        }
        return result;
    }
}
