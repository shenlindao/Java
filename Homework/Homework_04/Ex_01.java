// Задание
// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

package Homework.Homework_04;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Ex_01 {
    public static void main(String[] args) {
        Deque<Integer> num1 = new ArrayDeque<>(Arrays.asList(2, 4, 3));
        Deque<Integer> num2 = new ArrayDeque<>(Arrays.asList(5, 6, -4));
        Deque<Integer> sum = sumOFDeque(num1, num2);
        System.out.println(sum);
    }

    static Deque<Integer> sumOFDeque(Deque<Integer> num1, Deque<Integer> num2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
        while (!num1.isEmpty() || !num2.isEmpty()) {
            int sum = carry;
            if (!num1.isEmpty()) {
                sum += num1.pollFirst();
            }
            if (!num2.isEmpty()) {
                sum += num2.pollFirst();
            }
            result.addLast(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) {
            result.addLast(carry);
        }
        return result;
    }
}
