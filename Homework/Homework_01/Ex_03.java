// Задание
// 3) Реализовать простой калькулятор

package Homework.Homework_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = GetNumber("Input your first number: ", scanner);
        int secondNumber = GetNumber("Input your second number: ", scanner);
        DrawCalc();
        ResultOfChoice(firstNumber, secondNumber, scanner);
        scanner.close();
    }

    static int GetNumber(String text, Scanner scanner) {
        System.out.println(text);
        int num = scanner.nextInt();
        return num;
    }

    static void PlusNum(int firstNumber, int secondNumber) {
        int plus = firstNumber + secondNumber;
        System.out.println("\nresult: ");
        System.out.println(firstNumber + " + " + secondNumber + " = " + plus);
    }

    static void MinusNum(int firstNumber, int secondNumber) {
        int minus = firstNumber - secondNumber;
        System.out.println("\nresult: ");
        System.out.println(firstNumber + " - " + secondNumber + " = " + minus);
    }

    static void MultNum(int firstNumber, int secondNumber) {
        int mult = firstNumber * secondNumber;
        System.out.println("\nresult: ");
        System.out.println(firstNumber + " * " + secondNumber + " = " + mult);
    }

    static void DivNum(double firstNumber, double secondNumber) {
        double division = firstNumber / secondNumber;
        System.out.println("\nresult: ");
        System.out.println((int) firstNumber + " / " + (int) secondNumber + " = " + division);
    }

    static void DrawCalc() {
        System.out.println("\n1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
    }

    static void ResultOfChoice(int firstNumber, int secondNumber, Scanner scanner) {
        System.out.println("\nSelect the operation number: ");
        int user_choice = scanner.nextInt();
        switch (user_choice) {
            case 1:
                PlusNum(firstNumber, secondNumber);
                break;
            case 2:
                MinusNum(firstNumber, secondNumber);
                break;
            case 3:
                MultNum(firstNumber, secondNumber);
                break;
            case 4:
                DivNum(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}