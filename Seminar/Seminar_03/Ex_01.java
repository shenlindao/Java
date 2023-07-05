package Seminar.Seminar_03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
// import java.util.Iterator;

public class Ex_01 {
    public static void main(String[] args) {
        
    }

    static void randomNum (int size, int maxVal) {
        ArrayList<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();
        // Iterator<Integer> iter = nums.iterator();

        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(maxVal));
        }

        for (Integer num : nums) {
            System.out.println(num + " ");
        }
        System.out.println();

        nums.sort(Comparator.naturalOrder());
    }
}
