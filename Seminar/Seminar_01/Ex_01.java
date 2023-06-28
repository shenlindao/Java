package Seminar.Seminar_01;
import java.util.Scanner;
import java.time.LocalDateTime;

// 1.1. Написать программу, которая запросит пользователя ввеси <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение "привет, <Имя>".

// 1.2. Поприветствовать пользователя в соответствии с текущим временем суток. 

public class Ex_01 {
    public static void main(String[] args) {
        helloUser();
    }
    static void helloUser() {
        Scanner sc = new Scanner(System.in);
        int hour = LocalDateTime.now().getHour();

        System.out.println("Input your name here: ");
        String name = sc.nextLine();
        String dayTime = "";
        if(hour >+ 4 && hour < 11)
            dayTime = "morning";
        else if(hour >= 11 && hour < 17)
            dayTime = "day";
        else if(hour >= 17 && hour < 23)
            dayTime = "evening";
        else
            dayTime = "night";
        System.out.printf("Good %s, %s", dayTime, name);
        sc.close();
    }
}
