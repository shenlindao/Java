// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd. Результат - a4b3cd2 для примера.

package Seminar.Seminar_02;

public class Ex_02 {
    public static void main(String[] args) {
        System.out.println(stringCompress("aaaabbbcdd"));
    }

    static String stringCompress(String str) {
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0); // берем первый символ из строки
        newStr.append(symbol); // добавили символ в новую строку
        int count = 0; // установили счётчик

        for (char letter : str.toCharArray()) {  // перебираем строку как массив
            if (letter == symbol)
                count++;
            else {
                if (count != 1) newStr.append(count);
                newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;
            }
        }
        return newStr.toString();
    }
}
