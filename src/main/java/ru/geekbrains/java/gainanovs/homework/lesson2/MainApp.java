package ru.geekbrains.java.gainanovs.homework.lesson2;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Task 1");
        boolean res = checkSumWithinBoundaries(5, 15);
        System.out.println(res + "\n");

        System.out.println("Task 2");
        checkSignPrint(-10);

        System.out.println("Task 3");
        boolean res2 = checkSignReturn(10);
        System.out.println(res2 + "\n");

        System.out.println("Task 4");
        printStringNtimes("java", 5);

        System.out.println("Task 5");
        boolean res3 = checkIfLeapYear(2004);
        System.out.println(res3);
    }

    public static boolean checkIfLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void printStringNtimes(String s, int timesToPrint) {
        if (timesToPrint > 0) {
            for (int i = 0; i < timesToPrint; i++) {
                System.out.println(s);
            }
            System.out.println();
        } else {
            System.out.println("Times to Print value must be greater than 0" + "\n");
        }
    }

    public static void checkSignPrint(int a) {
        System.out.println(a >= 0 ? "positive" : "negative" + "\n");
    }

    public static boolean checkSignReturn(int a) {
        return a < 0;
    }

    public static boolean checkSumWithinBoundaries(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }


}
