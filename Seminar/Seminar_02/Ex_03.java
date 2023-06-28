// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

package Seminar.Seminar_02;

public class Ex_03 {
    public static void main(String[] args) {
        System.out.println(stringPal("12366321"));
    }

    static boolean stringPal(String str) {
        // StringBuilder res = new StringBuilder(str);
        // for (int i = str.length() - 1; i >= 0; i--)
        //     res.append(str.charAt(i));
        // return str.equals(res.toString());

        var arrStr = str.toCharArray();
        int left = 0;
        int right = arrStr.length - 1;

        while (left < right) {
            if (arrStr[left] != arrStr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
