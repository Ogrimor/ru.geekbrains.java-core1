package ru.geekbrains.java_core1.lessons.lesson6;

public class lesson6 {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsik", "black", 100);
        Animal dog1 = new Dog("Bobik", "white", 150);
        cat1.printAnimals();
        dog1.printAnimals();
        dog1.run();
        cat1.run();
        Animal.counterAnimals();
        Animal cat2 = new Cat("Vaska","red",120);
        Animal cat3 = new Cat("Richi","grey",110);
        cat3.printAnimals();
        Animal.counterAnimals();
        Animal dog2 = new Dog("Zhuchka","grey",220);
        Cat.printCounterCats();
        Dog.printCounterDogs();
        Animal.counterAnimals();
//        dog1.run(150);
        cat1.run(200);
        dog2.swim(100);
        cat3.swim(90);
        dog1.swim(90);
        dog1.run(200);
    }
}
