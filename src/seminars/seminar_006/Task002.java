package seminars.seminar_006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
// значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
public class Task002 {
    public static void main(String[] args) {
        int min = 0;
        int max = 24;
        int count = 10;
        Integer[] myArray = createArray(min, max, count);
        System.out.println(Arrays.toString(myArray));
        System.out.println(percent(myArray));

    }

    static Integer[] createArray(int min, int max, int count) {
        Integer[] myArray = new Integer[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            myArray[i] = random.nextInt(min, max + 1);
        }
        return myArray;
    }

    static double percent(Integer[] myArray) {
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(myArray));
        return (hashSet.size() * 100.0) / myArray.length;
    }
}