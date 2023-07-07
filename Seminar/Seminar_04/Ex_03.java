// Задание
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строки;
// 2. Если введено print - выводит строки от последней к первой;
// 3. Если введено revert - удаляет предыдущую введенную строку из памяти.

package Seminar.Seminar_04;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        redString();
    }

    static void redString() {
        Deque<String> myList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String data = "end";
        while (true) {
            System.out.println("Input something or print or revert or end");
            data = input.nextLine();
            if (data.equals("end")) {
                input.close();
                return;
            }
            changingList(myList, data);
            // System.out.println(myList);
        }
    }

    static void changingList(Deque<String> myList, String data) {
        if (data.equals("print")) {
            for (String string : myList) {
                System.out.println(string);
            }
        } else if (data.equals("revert")) {
            myList.pollFirst();
        } else {
            myList.addFirst(data);
        }
    }
}
