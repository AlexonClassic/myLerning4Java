package ProgKiev.JavaStart_Bohdan.Lecture4;

/**
 * Created by Олександр Шаповал on 29.06.2016.
 *
 * Лекция 4. Задача 5. Loops - Одна звезда:
 * Вывод на экран матрицы rows * cols, заполненной filler.
 * Если rows < 0 или cols < 0, бросить исключение IllegalArgumentException.
 */

public class LoopsTask5OneStarFilledMatrixPrinter {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int filler = -1;

        if (rows < 0 || cols < 0){
            throw new IllegalArgumentException("\n\nКоличество колонок и/или столбцов, не может быть отрицательным!\n");
        } else {
            for (int i = 1; i <= rows; i++) {
                System.out.println();
                for (int j = 1; j <= cols; j++) {
                    System.out.print(filler + " ");
                }
            }
        }
    }
}