package seminars.seminar_005;
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
public class Task001 {
    public static void main(String[] args) {
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");

        System.out.println(passports.findByName("Иванов"));
        System.out.println(passports.getFullInfo());
    }
}
