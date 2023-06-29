// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. 
// В случае возникновения исключения, оно должно записаться в лог-файл.

package Seminar.Seminar_02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Ex_05 {
    public static void main(String[] args) throws SecurityException, IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\Seminar\\Seminar_02\\Seminar_02-2.txt");
        addListToFile(pathFile, showCurrentFiles(pathProject));
    }

    static String[] showCurrentFiles(String pathProject) { // сформировать список строк из директории
        File currentDir = new File(pathProject);
        return currentDir.list();
    }

    static void addListToFile(String pathFile, String[] list) throws SecurityException, IOException { //сформировать файл
        Logger logger = Logger.getLogger(Ex_05.class.getName()); //подключаем логгер
        FileHandler fh = new FileHandler("Seminar\\Seminar_02\\Seminar_02-2_log.txt"); // подключаем FileHandler для записи в файл

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);  // как записывать в файл информацию, определить форматер

        try {
            File myFile = new File(pathFile);
            FileWriter writer = new FileWriter(myFile);

            for (String str : list)
                writer.write(str + "\n");

            writer.close();

        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
    }
}
