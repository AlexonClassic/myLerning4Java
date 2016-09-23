package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 17.07.2016.
 *
 * Лекция 4. Задача 6. Arrays - Одна звезда:
 * Написать метод вывода матрицы в консоль.
 * Предполагается, что матрица прямоугольная.
 * void printMatrix(int[][] matrix)
 */

public class ArraysTask6OneStarMatrixPrinter {
    public static void main(String[] args) {
        int[][] matrix = new int[0][0];
        int matrixFiller = 8;

        matrixFiller(matrix, matrixFiller);
    }

    public static void matrixFiller(int[][] matrix, int matrixFiller) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter count row: ");
        int row = scanner.nextInt();

        System.out.print("Enter count column: ");
        int col = scanner.nextInt();

        matrix = new int[col][row];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrixFiller;
            }
        }

        for (int i = 0; i < matrix.length; i++, System.out.println()) {
            for (int j = 0; j < matrix[i].length; j++) {
                printMatrix(matrix, i, j);
            }
        }

        scanner.close();
    }

    public static void printMatrix(int[][] matrix, int i, int j) {
        System.out.print(matrix[i][j] + " ");
    }
}