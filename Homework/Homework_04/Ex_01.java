// Задание
// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

package Homework.Homework_04;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Ex_01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Deque<Integer> deque1 = new ArrayDeque<>(Arrays.asList(2, 4, 3));
        Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(5, 6, -1));
        int number1 = getInteger(deque1);
        int number2 = getInteger(deque2);
        int sum = sumInt(number1, number2);
        int mult = multInt(number1, number2);
        System.out.println(mult);
        Deque<Integer> multDeque = dequeCreate(mult);
        Deque<Integer> sumDeque = dequeCreate(sum);
        System.out.println();
        System.out.println(multDeque);
        System.out.println();
        System.out.println(sumDeque);
    }

    static int getInteger(Deque<Integer> deque) {
        int number = 0;
        boolean posNeg = false;
        while (!deque.isEmpty()) {
            int n = number;
            if (!deque.isEmpty()) {
                int temp = 0;
                temp = deque.pollLast();
                if (temp < 0) {
                    temp *= -1;
                    posNeg = true;
                }
                n += temp;
            }
            number = n * 10;
        }
        number = number / 10;
        if (posNeg)
            number *= -1;
        return number;
    }

    static int sumInt(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    static int multInt(int number1, int number2) {
        int mult = number1 * number2;
        return mult;
    }

    static Deque<Integer> dequeCreate(int num) {
        Deque<Integer> resultDeque = new ArrayDeque<>();
        while (num != 0) {
            int n = num % 10;
            String s = Integer.toString(num);
            if (s.length() > 2 && s.substring(0, 1) == "-") {
                n *= -1;
            }
            resultDeque.push(n);
            num = num / 10;
        }

        return resultDeque;
    }
}
