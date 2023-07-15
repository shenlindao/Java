// Задание
// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

package Homework.Homework_05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Ex_01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Map<String, ArrayList<Integer>> contacts = new HashMap<>();
        menu(contacts);
    }

    static void menu(Map<String, ArrayList<Integer>> contacts) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner input = new Scanner(System.in);
        System.out.println("PHONE BOOK - MAIN MENU");
        System.out.println();
        System.out.println("Select the number");
        System.out.println("1 - add new contact");
        System.out.println("2 - show all contacts");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(input.nextLine());
        switch (menuChoise) {
            case 1:
                addContact(contacts, input);
                break;
            case 2:
                showContacts(contacts, input);
                break;
            default:
                break;
        }
        input.close();
    }

    static Map<String, ArrayList<Integer>> addContact(Map<String, ArrayList<Integer>> contacts, Scanner input)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("PHONE BOOK - ADD CONTACT");
        System.out.println();
        System.out.print("Input phone: \n\n");
        Integer phone = Integer.parseInt(input.nextLine());
        System.out.print("\nInput name: \n\n");
        String name = input.nextLine();
        if (contacts.containsKey(name)) {
            contacts.get(name).add(phone);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(phone);
            contacts.put(name, list);
        }
        addMenu(phone, name, contacts, input);
        return contacts;
    }

    static void addMenu(Integer phone, String name, Map<String, ArrayList<Integer>> contacts, Scanner input)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("PHONE BOOK - ADD MENU");
        System.out.println();
        System.out.println("1 - add new contact");
        System.out.println("2 - return to main menu");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(input.nextLine());
        switch (menuChoise) {
            case 1:
                addContact(contacts, input);
                break;
            case 2:
                menu(contacts);
                break;
            default:
                break;
        }
    }

    static void showContacts(Map<String, ArrayList<Integer>> contacts, Scanner input)
            throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("PHONE BOOK - ALL CONTACTS");
        System.out.println();

        Set<String> keySet = contacts.keySet();

        int maxCount = 0;
        int minCount = 1_000_000;

        for (var item : contacts.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }

        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            for (var item : contacts.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }

        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : contacts.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println("\n1 - add new contact");
        System.out.println("2 - return to main menu");
        System.out.println("else key - exit program");
        System.out.println();
        int menuChoise = Integer.parseInt(input.nextLine());
        switch (menuChoise) {
            case 1:
                addContact(contacts, input);
                break;
            case 2:
                menu(contacts);
                break;
            default:
                break;
        }
    }
}
