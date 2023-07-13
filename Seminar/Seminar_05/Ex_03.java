// Задание 3
// Написать метод, который сортирует строки по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны "потеряться".

package Seminar.Seminar_05;

import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        ex3_2();
    }

    static void ex3() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String[] words = input.nextLine().split(" ");

        Map<Integer, String> sortedWords = new TreeMap<>();

        for (String word : words) {
            sortedWords.put(word.length(), word);
        }
        System.out.println(sortedWords);
        input.close();
    }

    static void ex3_2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String[] words = input.nextLine().split(" ");

        Map<Integer, LinkedList<String>> sortedWords = new TreeMap<>();

        for (String word : words) {
            if (sortedWords.containsKey(word.length())) {
                sortedWords.get(word.length()).add(word);
            } else {
                sortedWords.put(word.length(), new LinkedList<>());
                sortedWords.get(word.length()).add(word);
            }
        }

        System.out.println(sortedWords);
        input.close();
    }
}
