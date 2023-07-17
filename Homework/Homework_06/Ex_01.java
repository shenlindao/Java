// Задание
// Реализуйте класс Cat, включающий в себя от трех полей и от двух методов,
// определяющих базовый функционал класса(за основу можно взять наработки с семинара).
// Создать два экземпляра класса Cat и вывести информацию о них на экран.

package Homework.Homework_06;

import java.io.IOException;

public class Ex_01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        Cat shashlik = new Cat("Шашлык", 2, "Американский бобтейл");
        Cat barsik = new Cat("Барсик", 4, "Мейн-кун");

        printCat(shashlik);
        printCat(barsik);

        shashlik.рurr();
        barsik.meow();

        System.out.println();
    }

    public static void printCat(Cat cat) {
        System.out.println("кличка кота: " + cat.name);
        System.out.println("возраст кота: " + cat.age + " года");
        System.out.println("порода кота: " + cat.breed + "\n");
    }

    public static class Cat {
        String name;
        int age;
        String breed;

        public Cat(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        public void рurr() {
            System.out.println(name + " ласкается и нежно мурчит: Муррр");
        }

        public void meow() {
            System.out.println(name + " громко заявляет: Мяу!");
        }
    }

}
