package org.horizoncolumbus.hs;

// 2/2/2021
public class SumOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {9, 2, 4}, {9, 0, 4}, {1, 2, 5}};
        int sum = 0;
        int rows = matrix.length;
        int colm = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int sumRows = 0;
            for (int x = 0; x < colm; x++) {
                sumRows = sumRows + matrix[i][x];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sumRows);
        }
        for (int i = 0; i < rows; i++) {
            for (int x = 0; x < colm; x++) {
                System.out.print(matrix[i][x] + "\t");
            }
            System.out.println("\n");
        }
    }
}