package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 20.07.2016.
 *
 * Лекция 4. Задача 7. Arrays - Одна звезда:
 * Написать метод подсчета среднего арифметического всех
 * элементов матрицы.
 * Предполагается, что матрица прямоугольная.
 * double calculateAverage(int[][] matrix)
 */

public class ArraysTask7OneStarMatrixAverageCalculator {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        int i = 0;
        int j = 0;

        matrixFiller(row, col, i, j);
    }

    public static void matrixFiller(int row, int col, int i, int j) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row count: ");
        row = scanner.nextInt();

        System.out.print("Enter col count: ");
        col = scanner.nextInt();

        matrixPrinter();

        int[][] matrix = new int[col][row];

        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        calculateAverage(matrix, col, row);
    }

    public static void matrixPrinter() {
        System.out.println();
        System.out.println("Our matrix has next digits:");
    }

    public static void calculateAverage(int[][] matrix, int col, int row) {
        double avg = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                avg += matrix[i][j];
            }
        }

        int temp = col * row;

        matrixAveragePrinter(avg / temp);
    }

    public static void matrixAveragePrinter(double avg) {
        System.out.println();
        System.out.println("Matrix Average Count = " + avg);
    }
}