package ru.geekbrains.java.gainanovs.homework.lesson7.animals;

public class Cat extends Animals {
    public static int catsCount;

    public Cat(String name) {
        this.isHungry = true;
        this.name = name;
        this.type = "Кот";
        this.maxRunDistance = 200;
        this.maxSwimDistance = 0;
        this.appetite = 10;
        catsCount++;
    }
}
