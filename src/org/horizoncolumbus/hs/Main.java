package org.horizoncolumbus.hs;

// 2/1/2021
public class Main {

    public static void main(String[] args) {
	// write your code here
        //2d literal array
        int arr[][] = {{8,7,9}, {3,6,1}, {7,4,2}};

        //2d array
        int[][] arr2 = new int[3][3];

        arr2[0][0] = 2;
        arr2[0][1] = 7;
        arr2[0][2] = 9;

        arr2[1][0] = 3;
        arr2[1][1] = 6;
        arr2[1][2] = 1;

        arr2[2][0] = 7;
        arr2[2][1] = 4;
        arr2[2][2] = 2;

        for(int i = 0; i < 3; i++){
            for(int x = 0; x < 3; x++) {
                System.out.print(arr[i][x] + "\t");
            }
            System.out.print("\n");
        }
    }
}
