package ru.geekbrains.java.gainanovs.homework.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

    private static Scanner scanner;
    private static Random random;

    private static char map[][];
    private static final int SIZE = 3;
    private static final char MAP_ELEMENT_EMPTY = '*';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_O = 'O';

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        random = new Random();

        initMap();
        printMap();

        while (true) {
            playerMove();
            printMap();

            if (checkWin(MAP_ELEMENT_X)) {
                System.out.println("Player WON!!!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Game Over! Draw!");
                break;
            }

            aiMove();
            printMap();

            if (checkWin(MAP_ELEMENT_O)){
                System.out.println("AI WON!!!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Game Over! Draw!");
                break;
            }
        }
    }

    public static boolean checkWin(char element) {
        for (int i = 0; i < SIZE; i++) {
            int checkRow = 0;
            int checkCol = 0;
            int checkDiagonal1 = 0;
            int checkDiagonal2 = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == element) {
                    checkRow += 1;
                }
                if (map[j][i] == element) {
                    checkCol += 1;
                }
                if (map[SIZE - 1 - j][j] == element) {
                    checkDiagonal1 += 1;
                }
                if (map[SIZE - 1 - j][SIZE - 1 - j] == element) {
                    checkDiagonal2 += 1;
                }
            }
            if (checkRow == 3 || checkCol == 3 || checkDiagonal1 == 3 || checkDiagonal2 == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == MAP_ELEMENT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void aiMove() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        map[x][y] = MAP_ELEMENT_O;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x > SIZE || y > SIZE) {
            return false;
        }
        if (map[x][y] != MAP_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void playerMove() {
        int x, y;
        do {
            System.out.println("Please enter coordinates of your move [ y, x ]");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellEmpty(x, y));
        map[x][y] = MAP_ELEMENT_X;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = MAP_ELEMENT_EMPTY;
            }

        }
    }
}
