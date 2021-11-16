package ru.geekbrains.java_core1.lessons.lesson6;

public class Cat extends Animal {
    private static int catCounter = 0;

    public Cat(String name, String color, int endurance) {
        super(name, color, endurance);
        catCounter++;
    }

    public static void printCounterCats() {
        System.out.printf("Количество cat: %s \n", catCounter);
    }

    public void swim(int distanceSwim) {
        System.out.println("Sorry, cats is not swimming");
        }
}



