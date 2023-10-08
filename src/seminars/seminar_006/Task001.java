package seminars.seminar_006;

import java.util.*;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного
// множества.
// . Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое
// данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного
// множества.
public class Task001 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{4, 5, 1, 2, 3, 2, 1, 6, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(array));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(array));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(array));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

    }

}
