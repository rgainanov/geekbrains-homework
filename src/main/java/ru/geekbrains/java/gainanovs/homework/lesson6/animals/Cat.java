package ru.geekbrains.java.gainanovs.homework.lesson6.animals;

public class Cat extends Animals {
    private static int catInstancesCount;

    public Cat(String name) {
        catInstancesCount++;
        this.name = name;
    }

    public static int getCatInstancesCount() {
        return catInstancesCount;
    }

    @Override
    public void run(int obstacleLength){
        if (obstacleLength > 0 && obstacleLength <= 200) {
            System.out.println(name + " ran " + obstacleLength + " m.");
        } else {
            System.out.println("Invalid distance for a cat");
            System.out.println("Valid distance for Cat is between 1 and 200 meters");
        }

    }
}
