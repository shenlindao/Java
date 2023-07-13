// Задание 2
// Написать метод, который переведёт число из римского формата записи в арабский

package Seminar.Seminar_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        ex2();
    }

    static void ex2() {
        Map<Character, Integer> romeNums = new HashMap<>();
        romeNums.put('I', 1);
        romeNums.put('V', 5);
        romeNums.put('X', 10);
        romeNums.put('L', 50);
        romeNums.put('C', 100);
        romeNums.put('D', 500);
        romeNums.put('M', 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("Input a number in a Rome case: ");
        char[] romeNumber = input.nextLine().toUpperCase().toCharArray();

        int res = 0;
        for (int i = 0; i < romeNumber.length; i++) {
            // если не последний и текущий меньше, чем следующий
            if (i != romeNumber.length - 1 && romeNums.get(romeNumber[i]) < romeNums.get(romeNumber[i + 1])) {
                res += romeNums.get(romeNumber[i + 1]) - romeNums.get(romeNumber[i]);
                i++;
            } else {
                res += romeNums.get(romeNumber[i]);
            }
        }

        System.out.println(res);
        input.close();
    }
}
