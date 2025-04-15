package Practice.TwoDArrays;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for pascal triangle: ");
        int n = sc.nextInt();

        int[][] pTriangle = pascale(n);
        ArrayUtility.display2DElements(pTriangle);
    }

    private static int[][] pascale(int n) {
        int[][] pMatrix = new int[n][];

        for (int i = 0; i < pMatrix.length; i++) { // row

            pMatrix[i] = new int[i+1]; // declare an array

            pMatrix[i][0] = pMatrix[i][i] = 1; // first and last elements always ZERO

            for (int j = 1; j < pMatrix[i].length - 1 ; j++) { // column
                pMatrix[i][j] = pMatrix[i-1][j-1] + pMatrix[i-1][j];
            }

        }
        return pMatrix;
    }
}
