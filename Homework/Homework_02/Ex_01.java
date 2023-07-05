// Задание
// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg

package Homework.Homework_02;

import java.io.File;

public class Ex_01 {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String filesPath = projectPath.concat("\\Homework\\Homework_02");
        String[] files = GetFiles(filesPath);
        for (String file : files) {
            System.out.println(file + " - Расширение: " + GetExtention(file));
        }
    }

    static String[] GetFiles(String projectPath) {
        File currentDir = new File(projectPath);
        return currentDir.list();
    }

    public static String GetExtention(String file) {
        int index = file.lastIndexOf(".");
        if (index == -1) {
            return "";
        }
        return file.substring(index + 1);
    }
}
