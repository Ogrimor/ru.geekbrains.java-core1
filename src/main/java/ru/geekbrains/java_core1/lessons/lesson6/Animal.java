package ru.geekbrains.java_core1.lessons.lesson6;

public class Animal {

    protected static int counterAllAnimals = 0;
    private int cout = 0;
    protected int endurance;
    protected String name;
    protected String color;

    public Animal() {
        System.out.println("New animal its create");
    }

    public Animal(String name, String color, int endurance) {
        this();
        this.name = name;
        this.color = color;
        this.endurance = endurance;
        counterAllAnimals++;
    }

    public void run() {
        System.out.printf("%s run \n", name);
    }

    public void printAnimals() {
        System.out.printf("Its animal, her name is %s, color is %s and endurance is %d \n", name, color, endurance);
    }

    public static void counterAnimals() {
        System.out.printf("Количество животных: %d \n", counterAllAnimals);
    }

    public void run(int distanceRun) {
        if (distanceRun > this.endurance) {
            System.out.printf("%s couldn't cover the distance \n", this.name);
        } else {
            System.out.printf("%s running %sm \n", this.name, distanceRun);
//            workout(distanceRun);
//            System.out.printf("Для тренировки понадопилось %d дней \n", cout);
        }
    }

    public void swim(int distanceSwim) {
        if (distanceSwim > this.endurance) {
            System.out.printf("%s couldn't cover the distance \n", this.name);
        } else {
            System.out.printf("%s swimming %sm \n", this.name, distanceSwim);
        }
    }

//    public int workout(int distance) {
//        while (this.endurance < distance) {
//            this.endurance = this.endurance/10 + this.endurance;
//            cout++;
//        }
//        return cout;
//
//    }
}