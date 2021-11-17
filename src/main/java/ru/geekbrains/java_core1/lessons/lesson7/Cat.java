package ru.geekbrains.java_core1.lessons.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Bowl bowl) {
        if (appetite > bowl.getFoodAmount()) {
            satiety = false;
            System.out.printf("%s can't eat out of a bowl \n", name);
        } else {
            satiety = true;
            bowl.decreaseFood(appetite);
            System.out.printf("Cat %s has ate for %d food \n", name, appetite);
        }
    }
    public void satietyCheck() {
        if (satiety == true) {
            System.out.printf("%s not hungry \n", name);
        } else {
            System.out.printf("%s hungry \n", name);
        }
    }
}
