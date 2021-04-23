package ru.geekbrains.java.gainanovs.homework.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Method printThreeWords()");
        printThreeWords();
        System.out.println();

        System.out.println("Method checkSumSign()");
        checkSumSign();
        System.out.println();

        System.out.println("Method printColor()");
        printColor();
        System.out.println();

        System.out.println("Method compareNumbers()");
        compareNumbers();
        System.out.println();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10, b = -20;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if ( value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 2, b = 20;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println(" a < b");
        }
    }
}
