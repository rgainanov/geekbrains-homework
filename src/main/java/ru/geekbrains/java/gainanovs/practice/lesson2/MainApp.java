package ru.geekbrains.java.gainanovs.practice.lesson2;

public class MainApp {
    public static void main(String[] args) {
        int size = 6;
//        chessPattern(size);
//        diagonalPattern(size);
//        squareBlankCenter(size);
//        squareWithDiagonal(size);
//        triangleBalnk(size);
//        squaren2(size);
//        lastFigure(size);
//        christmasTree();
    }

    public static void christmasTree() {
        int size = 5;
        int x = 3;
        //Ёлка
        for (int iter = 0; iter <= 3; iter++) {
            for (int i = iter; i <= size; i++) {
                if (i == x) {
                    x++;
                    break;
                }
                for (int j = 0; j <= size + i; j++) {
                    if ((j >= size - i && j <= size + i || j == size + 1)) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                // стебель
                if (iter ==3 && i == size ) {
                    for (int b = 0; b < 3; b++) {
                        for (int j = 0; j <= size + i; j++) {
                            if ((j >= size - 1 && j <= size + 1 || j == size + 1)) {
                                System.out.print("0 ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
        }


    }


    public static void lastFigure(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i < size - (size / 3) && j < size - (size / 3) || i >= (size / 3) && j >= (size / 3)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void squaren2(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= 1 || j >= size - 2 || j <= 1 || i >= size - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangleBalnk(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == size - 1) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void squareWithDiagonal(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
                    System.out.print("* ");
                } else if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void squareBlankCenter(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void chessPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void diagonalPattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else if (j > i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
