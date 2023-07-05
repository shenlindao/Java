// Задание 2
// Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.

package Homework.Homework_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex_02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        ArrayList<String> planetsList = PlanetsList(30);
        printList(planetsList);
        ArrayList<String> filtredPlanetsList = deleteDuplicates(planetsList);
        printList(filtredPlanetsList);
    }

    public static ArrayList<String> PlanetsList(int n) {
        List<String> planets = List.of(
                "Metcuty",
                "Venus",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptune");
        ArrayList<String> randomPlanets = new ArrayList<String>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            randomPlanets.add(planets.get(random.nextInt(planets.size())));
        }
        return randomPlanets;
    }

    public static void printList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");
    }

    public static ArrayList<String> deleteDuplicates(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (String planet : list) {
            if (!newList.contains(planet)) {
                newList.add(planet);
            }
        }
        return newList;
    }
}
