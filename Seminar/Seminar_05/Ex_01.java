// Задание 1
// Создать структуру для хранения номеров паспортов и фамилий сотрудников

package Seminar.Seminar_05;

import java.util.HashMap;
import java.util.Map;

public class Ex_01 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Map<String, String> workers = new HashMap<>();
        workers.put("100", "Ivanov");
        workers.put("101", "Petrov");
        workers.put("102", "Ivanov");
        workers.put("103", "Sidorov");
        workers.put("104", "Ivanov");
        workers.put("105", "Pupkin");

        for (Map.Entry<String, String> worker : workers.entrySet()) {
            if (worker.getValue().equals("Ivanov")) {
                System.out.printf("Passport number: %s, Worker surname: %s\n", worker.getKey(), worker.getValue());
            } 
        }
    }
}
