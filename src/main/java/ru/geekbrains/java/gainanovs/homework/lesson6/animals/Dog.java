package ru.geekbrains.java.gainanovs.homework.lesson6.animals;

public class Dog extends Animals {
    private static int dogInstancesCount;

    public Dog(String name) {
        dogInstancesCount++;
        this.name = name;
    }

    public static int getDogInstancesCount() {
        return dogInstancesCount;
    }

    public void swim(int obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= 10) {
            System.out.println(name + " swam " + obstacleLength + " m.");
        } else {
            System.out.println("Invalid swim distance for a dog");
            System.out.println("Valid swim distance for Dog is between 1 and 10 meters");
        }
    }

    @Override
    public void run(int obstacleLength) {
        if (obstacleLength > 0 && obstacleLength <= 500) {
            System.out.println(name + " ran " + obstacleLength + " m.");
        } else {
            System.out.println("Invalid run distance for a dog");
            System.out.println("Valid run distance for Dog is between 1 and 500 meters");
        }

    }
}
