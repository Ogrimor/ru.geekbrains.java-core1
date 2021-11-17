package ru.geekbrains.java_core1.lessons.lesson7;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food increased by %d pts, there is now %d\n", amount, foodAmount);
    }

    public void decreaseFood(int amount) {
        this.foodAmount -= amount;
        System.out.printf("Food decreased by %d pts, there is now %d\n", amount, foodAmount);
    }


    public int getFoodAmount() {
        System.out.printf("Pts in bowl: %d \n", foodAmount);
        return foodAmount;
    }
}
