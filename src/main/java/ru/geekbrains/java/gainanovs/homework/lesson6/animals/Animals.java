package ru.geekbrains.java.gainanovs.homework.lesson6.animals;

public abstract class Animals {
    String name;
    private static int instancesCount;

    public Animals() {
        instancesCount++;
    }

    public int getInstancesCount() {
        return instancesCount;
    }

    public abstract void run(int obstacleLength);

}
