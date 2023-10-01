package seminars.seminar_004;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
public class Task001 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long timeStart1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(list1.size()/2, i);
        }
        long timeFinish1 = System.currentTimeMillis();

        long timeStart2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(list2.size()/2, i);
        }
        long timeFinish2 = System.currentTimeMillis();

        System.out.println("List1: " + (timeFinish1 - timeStart1));
        System.out.println("List2: " + (timeFinish2 - timeStart2));
    }
}
