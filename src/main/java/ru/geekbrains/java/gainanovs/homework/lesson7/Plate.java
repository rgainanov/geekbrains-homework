package ru.geekbrains.java.gainanovs.homework.lesson7;

public class Plate {
    private int foodQty;

    public int getFoodQty() {
        return foodQty;
    }

    public void setFoodQty(int foodQty) {
        if (foodQty > 0) {
            this.foodQty = foodQty;
        }

    }

    public Plate(int foodQty) {
        this.foodQty = foodQty;
    }

    public void info() {
        System.out.printf("Plate [ Food: %d ]\n", this.foodQty);
    }

    public void addFood(int foodAmount) {
        this.foodQty += foodAmount;
        System.out.printf("В тарелку добавили %d еды, теперь там %d еды.\n", foodAmount, this.foodQty);
    }
}
