// Задание 1
// 1.Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package Homework.Homework_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Ex_01 {
    public static void main(String[] args) throws IOException, InterruptedException{
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        ArrayList<Integer> arr = new ArrayList<>();
        arr = fillRandom(10);
        System.out.println("Получен новый рандомный список: " + "\n");
        printArray(arr);
        deleteEvenNumbers(arr);
        printArray(arr);
        findMinNumber(arr);
        findMaxNumber(arr);
        fidMidNumber(arr);
    }

    public static ArrayList<Integer> fillRandom(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static void deleteEvenNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("Список отфильтрован, чётные числа удалены: " + "\n");
    }

    public static void findMinNumber(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальное значение в отфильтрованном списке: " + min + "\n");
    }

    public static void findMaxNumber(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int num = list.get(i);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Максимальное значение в отфильтрованном списке: " + max + "\n");
    }

    public static void fidMidNumber(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        int average = sum / list.size();
        System.out.println("Среднее арифметическое значение чисел в отфильтрованном списке: " + average + "\n");
    }

    public static void printArray(ArrayList<Integer> list) {
        for (Integer el : list) {
            System.out.print(el + "\t");
        }
        System.out.println("\n");
    }
}
