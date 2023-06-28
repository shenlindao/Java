// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package Seminar.Seminar_02;

public class Ex_01 {
    public static void main(String[] args) {
        System.out.println(longStringBuilding(11, 'a', 'b'));
    }

    static String longStringBuilding(int n, char c1, char c2) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
        }
        return newStr.toString();
    }
}
