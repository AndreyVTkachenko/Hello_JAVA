package seminars.seminar_003;

import java.util.*;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
public class Task004 {
    public static void main(String[] args) {
        List<String> listPlanets = new ArrayList<>();
        listPlanets.add("Меркурий");
        listPlanets.add("Венера");
        listPlanets.add("Земля");
        listPlanets.add("Марс");
        listPlanets.add("Нептун");
        listPlanets.add("Сатурн");
        listPlanets.add("Уран");
        listPlanets.add("Юпитер");


        List<String> showPlanet = showPlanet(listPlanets, 25);
        System.out.println(showPlanet);
        for (String planet : listPlanets) {
            System.out.print(planet + ": ");
            System.out.println(Collections.frequency(showPlanet, planet));
        }
    }

    static List<String> showPlanet(List<String> listPlanets, int count) {
        List<String> showPlanet = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randIndex = random.nextInt(0, listPlanets.size());
            String planeta = listPlanets.get(randIndex);
            showPlanet.add(planeta);
        }
        return showPlanet;
    }
}
