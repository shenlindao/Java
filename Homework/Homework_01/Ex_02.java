// Задание
// 2) Вывести все простые числа от 1 до 1000

package Homework.Homework_01;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        primeNumbers();
    }

    static void primeNumbers() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 1000; i++) {
            if (isNumberPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    public static boolean isNumberPrime(int number) {
        if (number == 2)
            return true;
        for (int i = 2; i < number; i++) {
            if (i == (number - 1))
                return true;
            if ((number % i) == 0)
                return false;
        }
        return false;
    }
}