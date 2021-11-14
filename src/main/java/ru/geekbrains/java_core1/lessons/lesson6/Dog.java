package ru.geekbrains.java_core1.lessons.lesson6;

public class Dog extends Animal {
    private static int dogCounter = 0;

    public Dog(String name, String color, int endurance) {
        super(name, color, endurance);
        dogCounter++;
    }

    public static void printCounterDogs() {
        System.out.printf("Количество dog: %s \n", dogCounter);

    }
}
