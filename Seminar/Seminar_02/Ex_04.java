// Напишите метод, который составит строку,
// состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

package Seminar.Seminar_02;

import java.io.File;
import java.io.FileWriter;

public class Ex_04 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\Seminar_02-1.txt");
        addingToFile(pathFile, longStringCreater("TEST ", 100));
    }

    static String longStringCreater(String word, int iters) {
        StringBuilder newStr = new StringBuilder();
        // взяли слово и сказали сколько раз будет выведено
        for (int i = 0; i < iters; i++) {
            newStr.append(word);
        }
        return newStr.toString();
    }

    static void addingToFile(String filePath, String text) {
        try {
            File myFile = new File(filePath); // создаем файл
            // создаем объект для записи с помощью класса FileWriter (true дозаписывает, false - перезаписывает)
            FileWriter writer = new FileWriter(myFile, true);
            writer.write(text);
            writer.close();

        } catch (Exception e) {
            //выводим ошибки
            System.out.println(e.getMessage());
        }
    }
}
