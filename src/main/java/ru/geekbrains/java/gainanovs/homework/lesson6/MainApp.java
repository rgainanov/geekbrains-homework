package ru.geekbrains.java.gainanovs.homework.lesson6;

import ru.geekbrains.java.gainanovs.homework.lesson6.animals.Animals;
import ru.geekbrains.java.gainanovs.homework.lesson6.animals.Cat;
import ru.geekbrains.java.gainanovs.homework.lesson6.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik");
        Cat catMurzik = new Cat("Murzik");
        Cat catMatroskin = new Cat("Matroskin");
        Dog dogBobik = new Dog("Bobik");

        catMurzik.run(50);
        dogBobik.run(10);

        dogBobik.run(500);
        dogBobik.swim(10);

        int dogInstanceCount = dogBobik.getDogInstancesCount();
        int catInstanceCount = catBarsik.getCatInstancesCount();
        int animalInstanceCount = catBarsik.getInstancesCount();

        System.out.println("Total instances of Animal Class - " + animalInstanceCount);
        System.out.println("Instances of a Dogs Class - " + dogInstanceCount);
        System.out.println("Instances of a Cats Class - " + catInstanceCount);

    }
}
