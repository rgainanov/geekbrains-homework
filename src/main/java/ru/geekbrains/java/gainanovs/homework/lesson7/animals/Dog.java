package ru.geekbrains.java.gainanovs.homework.lesson7.animals;

public class Dog extends Animals {
    public static int dogsCount;

    public Dog(String name) {
        this.isHungry = true;
        this.name = name;
        this.type = "Пёс";
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
        this.appetite = 30;
        dogsCount++;
    }

}
