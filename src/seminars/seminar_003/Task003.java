package seminars.seminar_003;

import java.util.ArrayList;
import java.util.List;

// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й
// позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры.
public class Task003 {

        /*
    [
        ["роман", "война и мир"],
        ["сказки", "колобок", "курочка ряба", "золотая рыбка"],
        ["фентези", "гарри поттер"]
    ]
     */
        public static void main(String[] args) {
            List<List<String>> shopBook = new ArrayList<>();
            addBook(shopBook, "сказки", "курочка ряба");
            addBook(shopBook, "роман", "война и мир");
            addBook(shopBook, "сказки", "колобок");
            addBook(shopBook, "сказки", "золотая рыбка");
            addBook(shopBook, "фентези", "гарри поттер");

            System.out.println(shopBook);
        }

        static void addBook(List<List<String>> shopBook, String genre, String nameBook){
            for (int i = 0; i < shopBook.size(); i++) {
                List<String> curList = shopBook.get(i);
                String curGenre = curList.get(0);
                if (curGenre.equals(genre)){
                    if (!curGenre.contains(nameBook)) {
                        curList.add(nameBook);
                    }
                    return;
                }
            }
            List<String> list = new ArrayList<>();
            list.add(genre);
            list.add(nameBook);
            shopBook.add(list);
        }
    }

