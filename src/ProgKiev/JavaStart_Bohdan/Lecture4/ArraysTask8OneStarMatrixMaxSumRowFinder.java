package ProgKiev.JavaStart_Bohdan.Lecture4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Олександр Шаповал on 20.07.2016.
 *
 * Лекция 4. Задача 8. Arrays - Одна звезда:
 * Написать метод поиска индекса строки с максимальной суммой элементов.
 * Если таких строк несколько, вернуть индекс первой.
 * Предполагается, что матрица прямоугольная.
 * int findMaxSumRow(int[][] matrix)
 */

public class ArraysTask8OneStarMatrixMaxSumRowFinder {
    public static void main(String[] args) {
        matrixFiller();
    }

    private static void matrixFiller() {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println();
        System.out.print("Enter matrix row count: ");
        int row = scanner.nextInt();

        System.out.print("Enter matrix col count: ");
        int col = scanner.nextInt();

        scanner.close();

        int[][] matrix = new int[col][row];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = rnd.nextInt(10);
            }
        }

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix){
        System.out.println();
        System.out.println("Our matrix, has next digits: ");

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        findMaxSumRow(matrix);
    }

    public static void findMaxSumRow(int[][] matrix){
        int rowSum = 0;
        int maxRowSum = 0;
        int maxRowSumIndex = 0;

        for (int i = 0; i < matrix.length; i++){
            rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++){
                rowSum += matrix[i][j];
            }

            if (rowSum > maxRowSum){
                maxRowSum = rowSum;
                maxRowSumIndex = i;
            }
        }

        maxSumRowIndexPrinter(maxRowSum, maxRowSumIndex);
    }

    public static void maxSumRowIndexPrinter(int maxRowSum, int maxRowSumIndex){
        System.out.println();
        System.out.println("Max summa: " + maxRowSum + " from our matrix in " + (maxRowSumIndex + 1) + " row" + " (index row = " + maxRowSumIndex + ")");
    }
}