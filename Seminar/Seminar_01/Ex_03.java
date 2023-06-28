package Seminar.Seminar_01;

// Задан массив, например nums = [1,7,3,6,5,6],
// Написать программу, которая найдет индекс i для этого массива такой,
// что сумма элементов с индексами < i равна сумме элементов с индексами > i

public class Ex_03 {
    public static void main(String[] args) {
        magicIndex();
    }

    static void magicIndex() {
        int[] array = new int[] { 1, 3, 5, 2, 2 };

        for (int i = 0; i < array.length - 1; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int i1 = 0; i1 < array.length; i1++)
                leftSum += array[i1];

            for (int i2 = i + 1; i2 < array.length; i2++)
                rightSum += array[i2];
            
            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
    }

}
