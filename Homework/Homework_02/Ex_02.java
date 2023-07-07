// Задание
// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Homework.Homework_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Ex_02 {
    public static void main(String[] args) throws SecurityException, IOException {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath.concat("\\Homework\\Homework_02\\Homework_02.txt");
        int[] arr = { 32, 12, 2, 66, 81, 10, 7, 4 };
        BubbleSort(filePath, arr);
    }

    public static int[] BubbleSort(String filePath, int[] arr) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Ex_02.class.getName());
        FileHandler fh = new FileHandler("Homework\\Homework_02\\Homework_02_log.txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            loggingResult(filePath, arr);
        }
        return arr;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void loggingResult(String filePath, int[] arr) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Ex_02.class.getName());
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile);
            for (int i : arr)
                writer.write(i + "\t");
            writer.close();

        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
    }
}
