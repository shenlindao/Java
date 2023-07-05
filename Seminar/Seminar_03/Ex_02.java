// Задание 2
// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке

package Seminar.Seminar_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex_02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        ArrayList<String> planetsList = PlanetsList(30);
        printList(planetsList);
        planetsCounter(planetsList);
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
            "Neptune"
        );
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
    }

    public static void planetsCounter(ArrayList<String> list) {
        System.out.println("\n");
        Set<String> set = new HashSet<>();
        for (String planet : list) {
            if (set.add(planet))
                System.out.println("planet " + planet + " ─ count: " + Collections.frequency(list, planet));
        }
        System.out.println("\n");
    }
}
