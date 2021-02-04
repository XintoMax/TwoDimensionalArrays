package org.horizoncolumbus.hs;

import java.util.Scanner;

// 2/4/2021
public class Main3 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("How many rows? ");
        int rowSize = scan1.nextInt();
        System.out.print("How many columns? ");
        int columnSize = scan1.nextInt();

        int[][] arr = new int[rowSize][columnSize];

        // get array values
        for (int i = 0; i < rowSize; i++) {
            for (int x = 0; x < columnSize; x++) {
                System.out.print("Value of row[" + i + "][" + x + "]: ");
                arr[i][x] = scan1.nextInt();
            }
        }
        // shows array
        for (int i = 0; i < rowSize; i++) {
            for (int x = 0; x < columnSize; x++) {
                System.out.print(arr[i][x] + "\t");
            }
            System.out.println("\n");
        }
    }
}
