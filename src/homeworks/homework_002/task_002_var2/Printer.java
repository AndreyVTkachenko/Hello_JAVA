package homeworks.homework_002.task_002_var2;

import java.util.Arrays;
import java.util.Objects;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder myQuery = new StringBuilder(QUERY);
        String clearParams = PARAMS.replaceAll("[\\[\\{\",\\}]", "").replaceAll(":", " ");

        String[] convertParams = clearParams.split(" ");
        int count = 0;
        for (int i = 0; i < convertParams.length; i += 2) {
            if (!convertParams[i + 1].contains("null")) {
                if (count != 0) {
                    myQuery.append(" and ").append(convertParams[i]).append("='").append(convertParams[i + 1]).append("'");
                    count++;
                } else {
                    myQuery.append(convertParams[i]).append("='").append(convertParams[i + 1]).append("'");
                    count++;
                }
            }
        }
        return myQuery;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        } else {
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}