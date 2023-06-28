package Seminar.Seminar_01;

import java.util.Scanner;

// Во фразе "Добро пожаловать на курс Java" переставить слова в обратном порядке.

public class Ex_04 {
    public static void main(String[] args) {
        reversePhrase();
    }

    static void reversePhrase() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input yor phrase: ");
        String phrase = scanner.nextLine();
        String[] words = phrase.split(" ");
        String[] res = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            res[i] = words[words.length - 1 - i];
        }
        for (String word : res) {
            System.out.println(word + " ");
        }
        scanner.close();
    }

}
