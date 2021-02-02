package org.horizoncolumbus.hs;

// 2/2/2021
public class SumOfMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {9, 2, 4}, {9, 0, 4}, {1, 2, 5}};
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int x = 0; x < 3; x++) {
                sum+= matrix[i][x];
                System.out.print(matrix[i][x] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println(sum);
    }
}