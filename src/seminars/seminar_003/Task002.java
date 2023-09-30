package seminars.seminar_003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.
public class Task002 {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add(1);
        myList.add(9);
        myList.add("Hello");
        myList.add(2.5);
        myList.add("88");
        myList.add(615265);
        System.out.println(myList);
//        for (int i = 0; i < myList.size(); i++) {
//            Object o = myList.get(i);
//            if (o instanceof Integer) {
//                myList.remove(i);
//                i--;
//            }
//        }

        Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
