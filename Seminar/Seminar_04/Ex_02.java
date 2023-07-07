// Задание
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида text~num;
// 2. Рассплитить строку по ~, сохранить text в связный список на позицию num;
// 3. Если введено print~num - выводить строку из позиции num в связном списке и удалить её из списка.

package Seminar.Seminar_04;

import java.util.LinkedList;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        redString();
    }

    static void redString() {
        LinkedList<String> myList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String data = "end";
        while (true) {
            System.out.printf("Input text~num, num <=%d \n", myList.size());
            data = input.nextLine();
            if (data.equals("end"))
                return;
            changingList(myList, data);
            input.close();
            System.out.println(myList);
        }

    }

    static void changingList(LinkedList<String> myList, String data) {
        try {
            int index = Integer.parseInt(data.split("~")[1]);
            String text = data.split("~")[0];
            if (text.equals("print")) {
                System.out.println(myList.get(index));
                myList.remove(index);
            } else
                myList.add(index, text);
        } catch (Exception e) {
            System.out.println("You had to input a correct number!");
        }
    }
}
