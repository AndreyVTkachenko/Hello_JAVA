package homeworks.homework_006;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map.

// Например:
// Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации
// можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

// Работу сдать как обычно ссылкой на гит репозиторий

// Частые ошибки:
// 1. Заставляете пользователя вводить все существующие критерии фильтрации
// 2. Невозможно использовать более одного критерия фильтрации одновременно
// 3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
// 4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков
// или добавить еще ноутбук, то программа начинает работать некорректно.

import java.util.*;

public class Homework {
    private static Set<Laptop> laptops;

    public static void main(String[] args) {

        laptops = new HashSet<>();

        laptops.add(createLaptop(4, 128, "without OS", "grey"));
        laptops.add(createLaptop(8, 128, "without OS", "black"));
        laptops.add(createLaptop(8, 256, "without OS", "black"));
        laptops.add(createLaptop(16, 256, "without OS", "black"));
        laptops.add(createLaptop(32, 512, "without OS", "black"));
        laptops.add(createLaptop(8, 128, "Windows 10", "black"));
        laptops.add(createLaptop(8, 256, "Windows 10", "black"));
        laptops.add(createLaptop(8, 256, "Windows 10", "grey"));
        laptops.add(createLaptop(16, 512, "Windows 10", "black"));
        laptops.add(createLaptop(16, 512, "Windows 10", "grey"));
        laptops.add(createLaptop(8, 256, "Windows 11", "grey"));
        laptops.add(createLaptop(8, 256, "Windows 11", "black"));
        laptops.add(createLaptop(16, 512, "Windows 11", "grey"));
        laptops.add(createLaptop(16, 1024, "Windows 11", "black"));
        laptops.add(createLaptop(32, 1024, "Windows 11", "white"));
        laptops.add(createLaptop(8, 256, "Linux", "black"));
        laptops.add(createLaptop(8, 512, "Linux", "black"));
        laptops.add(createLaptop(16, 512, "Linux", "white"));
        laptops.add(createLaptop(16, 1024, "Linux", "grey"));
        laptops.add(createLaptop(32, 1024, "Linux", "white"));
        laptops.add(createLaptop(16, 512, "MacOS", "white"));
        laptops.add(createLaptop(16, 512, "MacOS", "black"));
        laptops.add(createLaptop(32, 1024, "MacOS", "white"));
        laptops.add(createLaptop(32, 1024, "MacOS", "black"));
        laptops.add(createLaptop(64, 2048, "MacOS", "grey"));

        System.out.println("Список всех ноутбуков:");
        printLaptops(laptops);
        Map<String, Object> filterCriterion = filterCriterionUser();
        Set<Laptop> filteredLaptops = filterLaptops(filterCriterion);
        printFilterLaptops(filteredLaptops);
    }


    public static Laptop createLaptop(int ram, int rom, String os, String color) {
        Laptop laptop = new Laptop();
        laptop.setRam(ram);
        laptop.setRom(rom);
        laptop.setOs(os);
        laptop.setColor(color);
        return laptop;
    }

    static void printLaptops(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }


    private static Map<String, Object> filterCriterionUser() {
        Map<String, Object> filterCriteron = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите минимальный объем оперативной памяти (RAM) или оставьте пустым: ");
        String ram = scanner.nextLine();
        if (!(ram.isEmpty())) {
            int minRam = Integer.parseInt(ram);
            filterCriteron.put("ram", minRam);
        }

        System.out.print("Введите минимальный объем внутренней памяти (ROM) или оставьте пустым: ");
        String rom = scanner.nextLine();
        if (!(rom.isEmpty())) {
            int minRom = Integer.parseInt(rom);
            filterCriteron.put("rom", minRom);
        }

        System.out.print("Введите операционную систему (OS) или оставьте пустым: ");
        String os = scanner.nextLine();
        if (!(os.isEmpty())) {
            filterCriteron.put("os", os);
        }

        System.out.print("Введите цвет или оставьте пустым: ");
        String color = scanner.nextLine();
        if (!(color.isEmpty())) {
            filterCriteron.put("color", color);
        }

        return filterCriteron;
    }

    private static Set<Laptop> filterLaptops(Map<String, Object> filterCriterion) {
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean meetsCriterion = true;

            if (filterCriterion.containsKey("ram")) {
                int minRam = (int) filterCriterion.get("ram");
                if (laptop.getRam() < minRam) {
                    meetsCriterion = false;
                }
            }

            if (filterCriterion.containsKey("rom")) {
                int minRom = (int) filterCriterion.get("rom");
                if (laptop.getRom() < minRom) {
                    meetsCriterion = false;
                }
            }

            if (filterCriterion.containsKey("os")) {
                String os = (String) filterCriterion.get("os");
                if (!laptop.getOs().equals(os)) {
                    meetsCriterion = false;
                }
            }

            if (filterCriterion.containsKey("color")) {
                String color = (String) filterCriterion.get("color");
                if (!laptop.getColor().equals(color)) {
                    meetsCriterion = false;
                }
            }

            if (meetsCriterion) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }

    private static void printFilterLaptops(Set<Laptop> laptops) {
        if (laptops.isEmpty()) {
            System.out.println("Ноутбуки, удовлетворяющие критериям фильтра, не найдены.");
        } else {
            System.out.println("Ноутбуки, удовлетворяющие критериям фильтра:");
            laptops.forEach(System.out::println);
        }
    }
}