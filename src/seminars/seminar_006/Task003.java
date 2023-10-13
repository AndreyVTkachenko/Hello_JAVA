package seminars.seminar_006;

import java.util.HashSet;
import java.util.Set;
// Задача 3.1
// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

// Задача 3.2
// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания,
// можно использовать не все придуманные поля и методы.
// Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
// выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

// Задача 3.3
// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
// Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
// Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях.
// То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

public class Task003 {
    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();

        Cat cat1 = new Cat();
        cat1.setName("Барсик");
        cat1.setAge(10);
        cat1.setPoroda("Персидская");
        cat1.setNameOwner("Василий Иванович");

        Cat cat2 = new Cat();
        cat2.setName("Васька");
        cat2.setAge(5);
        cat2.setPoroda("Сфинкс");
        cat2.setNameOwner("Мария Степановна");

        Cat cat3 = new Cat();
        cat3.setName("Машка");
        cat3.setAge(9);
        cat3.setPoroda("Мейнкин");
        cat3.setNameOwner("Павел Петрович");

        Cat cat4 = new Cat();
        cat4.setName("Барсик");
        cat4.setAge(10);
        cat4.setPoroda("Персидская");
        cat4.setNameOwner("Василий Иванович");

        Cat cat5 = new Cat();
        cat5.setName("Барсик");
        cat5.setAge(8);
        cat5.setPoroda("Персидская");
        cat5.setNameOwner("Василий Иванович");

        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        set.add(cat5);

        System.out.println(cat1.equals(cat4));
        printSet(set);
        System.out.println();
        findByAge(set, 9);
    }

    static void findByAge(Set<Cat> cats, int age){
        for (Cat cat: cats){
            if (cat.getAge() >= age){
                System.out.println(cat);
            }
        }
    }

    static void printSet(Set<Cat> set){
        for (Cat cat: set){
            System.out.println(cat);
        }
    }
}
