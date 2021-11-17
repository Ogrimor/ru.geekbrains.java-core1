package ru.geekbrains.java_core1.lessons.lesson7;

public class Lesson7 {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsick", 100),
                new Cat("Murzik", 120),
                new Cat("Vaska", 130),
                new Cat("Richi", 150),
                new Cat("Dingo", 114)
        };
        Bowl bowl1 = new Bowl(500);

        for (Cat cat : cats) {
            cat.satietyCheck();
        }

        for (Cat cat1 : cats) {
            cat1.eat(bowl1);
        }
        for (Cat cat3 : cats) {
            cat3.satietyCheck();
        }

        bowl1.getFoodAmount();
        bowl1.putFood(1000);
        bowl1.getFoodAmount();

        for (Cat cat1 : cats) {
            cat1.eat(bowl1);
        }
        for (Cat cat3 : cats) {
            cat3.satietyCheck();
        }
        bowl1.getFoodAmount();
    }

}
