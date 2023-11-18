package homeworks.homework_006_var_003;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Homework {
    public static void main(String[] args) {
        Set<Laptop> laptops = createLaptopSet();

        Map<String, Object[]> filterCriteria = requestFilterCriteria();
        filterAndPrint(laptops, filterCriteria);
    }

    private static Set<Laptop> createLaptopSet() {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(4, 128, "without OS", "grey"));
        laptops.add(new Laptop(8, 128, "without OS", "black"));
        laptops.add(new Laptop(8, 256, "without OS", "black"));
        laptops.add(new Laptop(16, 256, "without OS", "black"));
        laptops.add(new Laptop(32, 512, "without OS", "black"));
        laptops.add(new Laptop(8, 128, "Windows 10", "black"));
        laptops.add(new Laptop(8, 256, "Windows 10", "black"));
        laptops.add(new Laptop(8, 256, "Windows 10", "grey"));
        laptops.add(new Laptop(16, 512, "Windows 10", "black"));
        laptops.add(new Laptop(16, 512, "Windows 10", "grey"));
        laptops.add(new Laptop(8, 256, "Windows 11", "grey"));
        laptops.add(new Laptop(8, 256, "Windows 11", "black"));
        laptops.add(new Laptop(16, 512, "Windows 11", "grey"));
        laptops.add(new Laptop(16, 1024, "Windows 11", "black"));
        laptops.add(new Laptop(32, 1024, "Windows 11", "white"));
        laptops.add(new Laptop(8, 256, "Linux", "black"));
        laptops.add(new Laptop(8, 512, "Linux", "black"));
        laptops.add(new Laptop(16, 512, "Linux", "white"));
        laptops.add(new Laptop(16, 1024, "Linux", "grey"));
        laptops.add(new Laptop(32, 1024, "Linux", "white"));
        laptops.add(new Laptop(16, 512, "MacOS", "white"));
        laptops.add(new Laptop(16, 512, "MacOS", "black"));
        laptops.add(new Laptop(32, 1024, "MacOS", "white"));
        laptops.add(new Laptop(32, 1024, "MacOS", "black"));
        laptops.add(new Laptop(64, 2048, "MacOS", "grey"));

        return laptops;
    }

    private static Map<String, Object[]> requestFilterCriteria() {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<String, Object[]> criteria = new HashMap<>();

            System.out.println("Введите номер или номера критериев фильтрации через пробел:");
            System.out.println("1 - RAM");
            System.out.println("2 - ROM");
            System.out.println("3 - OS");
            System.out.println("4 - Color");
            System.out.println("5 - Без фильтра");

            String[] selectedCriteria = scanner.nextLine().split(" ");

            for (String selectedCriterion : selectedCriteria) {
                switch (selectedCriterion) {
                    case "1":
                        System.out.print("Введите минимальное значение оперативной памяти (от 0 до 64 ГБ): ");
                        int minRam = Integer.parseInt(scanner.nextLine());
                        criteria.put("ram", new Object[]{minRam});
                        break;
                    case "2":
                        System.out.print("Введите минимальное значение внутренней памяти (от 0 до 2024 ГБ): ");
                        int minRom = Integer.parseInt(scanner.nextLine());
                        criteria.put("rom", new Object[]{minRom});
                        break;
                    case "3":
                        System.out.print("Введите предпочитаемую операционную систему " +
                                "(without os, windows, linux, mac os): ");
                        String os = scanner.nextLine();
                        criteria.put("os", new Object[]{os});
                        break;
                    case "4":
                        System.out.print("Введите желаемый цвет (black, white, grey): ");
                        String color = scanner.nextLine();
                        criteria.put("color", new Object[]{color});
                        break;
                        case "5":
                        criteria.put("showAll", new Object[]{});
                        break;
                    default:
                        System.out.println("Введён неверный критерий фильтрации");
                }
            }

            return criteria;
        }
    }

    private static void filterAndPrint(Set<Laptop> laptops, Map<String, Object[]> criteria) {

        System.out.println("Ноутбуки, удовлетворяющие введённым критериям:");
        boolean laptopsFound = false;
        for (Laptop laptop : laptops) {
            if (matchesCriteria(laptop, criteria)) {
                System.out.println(laptop);
                laptopsFound = true;
            }
        }
        if (!laptopsFound) {
            System.out.println("Не найдено");
        }
    }

    private static boolean matchesCriteria(Laptop laptop, Map<String, Object[]> criteria) {

        if (criteria.containsKey("showAll")) {
            return true;
        }
        for (Map.Entry<String, Object[]> entry : criteria.entrySet()) {
            String criterion = entry.getKey();
            Object[] values = entry.getValue();

            switch (criterion) {
                case "ram":
                    if (laptop.getRam() < (int) values[0]) {
                        return false;
                    }
                    break;
                case "rom":
                    if (laptop.getRom() < (int) values[0]) {
                        return false;
                    }
                    break;
                case "os":
                    if (!laptop.getOs().equalsIgnoreCase((String) values[0])) {
                        return false;
                    }
                    break;
                case "color":
                    if (!laptop.getColor().equalsIgnoreCase((String) values[0])) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
