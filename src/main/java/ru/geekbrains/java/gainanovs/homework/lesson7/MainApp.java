package ru.geekbrains.java.gainanovs.homework.lesson7;

import ru.geekbrains.java.gainanovs.homework.lesson7.animals.Cat;
import ru.geekbrains.java.gainanovs.homework.lesson7.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        Plate catsPlate = new Plate(35);
        Plate dogsPlate = new Plate(100);

        Dog[] dogs = {
                new Dog("Мухтар"),
                new Dog("Буран"),
                new Dog("Белка"),
                new Dog("Стрелка"),
                new Dog("Бандит")

        };

        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Матроскин"),
                new Cat("Фёдор")
        };

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].eat(dogsPlate);
        }
        System.out.println();

        for (Dog dog : dogs) {
            System.out.printf("Голоден ли %s? -- %s\n", dog.getName(), dog.isHungry());
        }
        System.out.println();

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(catsPlate);
        }
        System.out.println();

        for (Cat cat : cats) {
            System.out.printf("Голоден ли %s? -- %s\n", cat.getName(), cat.isHungry());
        }
        System.out.println();

    }
}
