// Задание
// 3) Реализовать простой калькулятор

package Homework.Homework_01;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = getNumber("Input your first number: ", scanner);
        int secondNumber = getNumber("Input your second number: ", scanner);
        drawCalc();
        resultOfChoice(firstNumber, secondNumber, scanner);
        scanner.close();
    }

    static int getNumber(String text, Scanner scanner) {
        System.out.println(text);
        int num = scanner.nextInt();
        return num;
    }

    static void plusNum(int firstNumber, int secondNumber) {
        int plus = firstNumber + secondNumber;
        System.out.println("\nresult: ");
        System.out.println(firstNumber + " + " + secondNumber + " = " + plus);
    }

    static void minusNum(int firstNumber, int secondNumber) {
        int minus = firstNumber - secondNumber;
        System.out.println("\nresult: ");
        System.out.println(firstNumber + " - " + secondNumber + " = " + minus);
    }

    static void multNum(int firstNumber, int secondNumber) {
        int mult = firstNumber * secondNumber;
        System.out.println("\nresult: ");
        System.out.println(firstNumber + " * " + secondNumber + " = " + mult);
    }

    static void divNum(double firstNumber, double secondNumber) {
        double division = firstNumber / secondNumber;
        System.out.println("\nresult: ");
        System.out.println((int) firstNumber + " / " + (int) secondNumber + " = " + division);
    }

    static void drawCalc() {
        System.out.println("\n1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
    }

    static void resultOfChoice(int firstNumber, int secondNumber, Scanner scanner) {
        System.out.println("\nSelect the operation number: ");
        int user_choice = scanner.nextInt();
        switch (user_choice) {
            case 1:
                plusNum(firstNumber, secondNumber);
                break;
            case 2:
                minusNum(firstNumber, secondNumber);
                break;
            case 3:
                multNum(firstNumber, secondNumber);
                break;
            case 4:
                divNum(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}