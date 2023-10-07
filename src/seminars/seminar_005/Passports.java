package seminars.seminar_005;

import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String passport, String lastName) {
        map.put(passport, lastName);
    }

    String findByName(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getValue();
            String passport = entry.getKey();
            if (lastName.equals(name)) {
                stringBuilder.append(passport);
                stringBuilder.append(": ");
                stringBuilder.append(name);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    String getFullInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Весь список:\n");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String name = entry.getValue();
            String passport = entry.getKey();
            stringBuilder.append(passport);
            stringBuilder.append(": ");
            stringBuilder.append(name);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
