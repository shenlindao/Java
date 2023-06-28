package Homework.Homework_01;
// Задание
// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// 2) Вывести все простые числа от 1 до 1000
// 3) Реализовать простой калькулятор
// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        getNumber();
    }
    static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number: ");
        int num = scanner.nextInt();
        int sum = (num * (num + 1)) / 2;
        System.out.printf("Triangular number = %d\n", sum);
        scanner.close();
    }
}
