package homeworks.homework_006_var_002;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(Laptop.createLaptop(8, 128, "without os", "grey"));
        laptops.add(Laptop.createLaptop(8, 128, "without os", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "without os", "black"));
        laptops.add(Laptop.createLaptop(12, 256, "without os", "black"));
        laptops.add(Laptop.createLaptop(12, 512, "without os", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "without os", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "without os", "grey"));
        laptops.add(Laptop.createLaptop(32, 512, "without os", "grey"));
        laptops.add(Laptop.createLaptop(32, 512, "without os", "black"));
        laptops.add(Laptop.createLaptop(64, 1024, "without os", "grey"));
        laptops.add(Laptop.createLaptop(8, 128, "windows", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "windows", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "windows", "grey"));
        laptops.add(Laptop.createLaptop(12, 512, "windows", "black"));
        laptops.add(Laptop.createLaptop(12, 512, "windows", "grey"));
        laptops.add(Laptop.createLaptop(12, 256, "windows", "grey"));
        laptops.add(Laptop.createLaptop(16, 256, "windows", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "windows", "grey"));
        laptops.add(Laptop.createLaptop(16, 1024, "windows", "black"));
        laptops.add(Laptop.createLaptop(32, 1024, "windows", "white"));
        laptops.add(Laptop.createLaptop(8, 128, "linux", "white"));
        laptops.add(Laptop.createLaptop(8, 128, "linux", "black"));
        laptops.add(Laptop.createLaptop(8, 256, "linux", "white"));
        laptops.add(Laptop.createLaptop(12, 256, "linux", "grey"));
        laptops.add(Laptop.createLaptop(12, 256, "linux", "black"));
        laptops.add(Laptop.createLaptop(16, 256, "linux", "black"));
        laptops.add(Laptop.createLaptop(16, 512, "linux", "grey"));
        laptops.add(Laptop.createLaptop(16, 1024, "linux", "white"));
        laptops.add(Laptop.createLaptop(16, 1024, "linux", "grey"));
        laptops.add(Laptop.createLaptop(32, 1024, "linux", "white"));
        laptops.add(Laptop.createLaptop(16, 512, "mac os", "white"));
        laptops.add(Laptop.createLaptop(16, 512, "mac os", "black"));
        laptops.add(Laptop.createLaptop(32, 1024, "mac os", "white"));
        laptops.add(Laptop.createLaptop(32, 1024, "mac os", "black"));
        laptops.add(Laptop.createLaptop(64, 2048, "mac os", "grey"));

        List<String> criteria = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите через запятую номера критериев для фильтрации:");
        System.out.println("1 - RAM");
        System.out.println("2 - ROM");
        System.out.println("3 - OS");
        System.out.println("4 - Color");
        System.out.println("5 - Без фильтрации");

        String criteriaInput = scanner.nextLine().toLowerCase();
        String[] selectedCriteria = criteriaInput.split(",");

        for (String selectedCriterion : selectedCriteria) {
            switch (selectedCriterion.trim()) {
                case "1":
                    System.out.println("Введите минимальный размер оперативной памяти (от 0 до 64 ГБ):");
                    int minRam = scanner.nextInt();
                    if (minRam < 0) {
                        System.out.println(
                                "Размер оперативной памяти не может быть отрицательным. " +
                                        "Активируйте приложение заново.");
                        return;
                    } else {
                        criteria.add("ram:" + minRam);
                    }
                    break;
                case "2":
                    System.out.println("Введите минимальный размер жёсткого диска (от 0 до 2024 ГБ):");
                    int minRom = scanner.nextInt();
                    if (minRom < 0) {
                        System.out.println(
                                "Объём жёсткого диска не может быть отрицательным. " +
                                        "Активируйте приложение заново.");
                        return;
                    } else {
                        criteria.add("rom:" + minRom);
                    }
                    break;
                case "3":
                    System.out.println("Введите желаемую операционную систему (without os, windows, linux, mac os):");
                    String os = scanner.next();
                    criteria.add("os:" + os);
                    break;
                case "4":
                    System.out.println("Введите предпочитаемый цвет (black, white, grey):");
                    String color = scanner.next();
                    criteria.add("color:" + color);
                    break;
                case "5":
                    System.out.println("Вывод всех ноутбуков без фильтрации:");
                    for (Laptop laptop : laptops) {
                        System.out.println(laptop);
                    }
                    return;
                default:
                    System.out.println(
                            "Вы ввели неверный фильтр: " + selectedCriterion +
                            ". Активируйте приложение заново.");
                    return;
            }
        }

        boolean hasMatch = false;

        for (Laptop laptop : laptops) {
            boolean isMatch = true;

            for (String criterion : criteria) {
                String[] parts = criterion.split(":");
                String property = parts[0];
                String value = parts[1];

                if (property.equals("ram") && (laptop.getRam() < Integer.parseInt(value))) {
                    isMatch = false;
                    break;
                } else if (property.equals("rom") && (laptop.getRom() < Integer.parseInt(value))) {
                    isMatch = false;
                    break;
                } else if (property.equals("os") && (!laptop.getOs().equalsIgnoreCase(value))) {
                    isMatch = false;
                    break;
                } else if (property.equals("color") && (!laptop.getColor().equalsIgnoreCase(value))) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                if (!hasMatch) {
                    System.out.println("По выбранным фильтрам вам подойдут следующие ноутбуки:");
                    hasMatch = true;
                }
                System.out.println(laptop);
            }
        }

        if (!hasMatch) {
            System.out.println("По выбранным фильтрам не найден ни один ноутбук.");
        }
    }
}
