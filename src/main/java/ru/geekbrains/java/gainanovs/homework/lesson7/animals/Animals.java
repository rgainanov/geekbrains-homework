package ru.geekbrains.java.gainanovs.homework.lesson7.animals;

import ru.geekbrains.java.gainanovs.homework.lesson7.Plate;

public abstract class Animals {
    public static int animalsCount;

    String type;
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    boolean isHungry;
    int appetite;

    public Animals() {
        animalsCount++;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " не умеет плавать");
            return;
        }
        if (distance < maxSwimDistance) {
            System.out.println(type + " " + name + " проплыл дистанцию " + distance + ".");
        } else {
            System.out.println(type + " " + name + " не смог одолеть дистанцию " + distance + ".");
        }

    }

    public void run(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(type + " " + name + " пробежал дистанцию " + distance + ".");
        } else {
            System.out.println(type + " " + name + " не смог одолеть дистанцию " + distance + ".");
        }
    }

    public void eat(Plate plate) {
        int newFoodQtyInPlate = plate.getFoodQty() - appetite;
        if (newFoodQtyInPlate >= 0) {
            plate.setFoodQty(newFoodQtyInPlate);
            isHungry = false;
            System.out.println(type + " " + name + " поел, в тарелке осталось " + plate.getFoodQty() + " еды.");
        } else {
            System.out.printf("Для %s - %s в тарекле недостаточно еды.\n", type, name);
        }

    }

}
