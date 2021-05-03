package ru.geekbrains.java.gainanovs.homework.lesson3;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        // task 1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(arr1));
        swap0and1inArray(arr1);
//        System.out.println(Arrays.toString(arr1));

        // task 2
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
//        System.out.println(Arrays.toString(arr2));

        // task 3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(arr3));
        multiplyBy2ifLessThan6(arr3);
//        System.out.println(Arrays.toString(arr3));


        // task 4
        int arraySize = 9;
        int[][] arr4 = xOf1In2dArray(arraySize);
//        print2dArray(arr4);

        // task 5
        int len = 10;
        int initialValue = 9;
        int[] arr5 = createArray(len, initialValue);
//        System.out.println(Arrays.toString(arr5));

        // task 6
        int[] arr6 = {-11, 2, -12, 100, 102, 6};
        int[] minMax = findMinMaxInArray(arr6);
//        System.out.println(Arrays.toString(minMax));

        //task 7
        int[] arr7 = {-10, 1, 10, 10, 10, 1};
        boolean res = checkBalance(arr7);
        System.out.println(res);

        // task 8
        int[] arr8 = {1, 2, 3, 4};
        int n = -1;
        // positive n == shift to the right
        // negative n == shift to the left
//        System.out.println(Arrays.toString(arr8));
        shiftArrayByNPositions(arr8, n);
//        System.out.println(Arrays.toString(arr8));

    }

    public static void shiftArrayByNPositions(int[] arr, int n) {
        for (int x = 0; x < Math.abs(n); x++) {
            if (n > 0) {
                int temp = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            } else {
                int temp = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = temp;
            }
        }
    }

    public static boolean checkBalance(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int sumLeft = arr[l], sumRight = arr[r];

        while (true) {
            if (sumLeft >= sumRight && Math.abs(r - l) != 1) {
                r -= 1;
                sumRight += arr[r];
            } else if (sumLeft < sumRight && Math.abs(r - l) != 1) {
                l += 1;
                sumLeft += arr[l];
            } else if (sumLeft == sumRight && Math.abs(r - l) == 1) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static int[] findMinMaxInArray(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            min = (a < min) ? a : min;
            max = (a > max) ? a : max;
        }
        int[] res = {min, max};
        return res;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] xOf1In2dArray(int arraySize) {
        int[][] arr = new int[arraySize][arraySize];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || (i + j) == (arr[i].length - 1)) {
                    arr[i][j] = 1;
                }
            }
        }

        return arr;
    }

    public static void multiplyBy2ifLessThan6(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
    }

    public static void swap0and1inArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
}
