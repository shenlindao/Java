package Seminar.Seminar_01;

// Дан массив двоичных чисел, например [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

public class Ex_02 {
    public static void main(String[] args) {
        quantityOfSame();
    }

    static void quantityOfSame() {
        int[] array = new int[] { 1, 1, 0, 1, 1, 1 };

        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 && i != array.length - 1)
                count++;
            else if (count > maxCount) {
                maxCount = count;
                count = 0;
            } else
                count = 0;
        }

        if (count > maxCount)
            maxCount = count;

        System.out.println(maxCount);
    }

}
