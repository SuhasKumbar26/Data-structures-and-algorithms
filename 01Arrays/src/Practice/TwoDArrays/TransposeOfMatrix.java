package Practice.TwoDArrays;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (R/C): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        ArrayUtility.input2DElements(arr);
        ArrayUtility.display2DElements(arr);

       int[][] transMatrix = TransposeMatrix(arr); // Jagged array (2 x 3) or Squared matrix (3 x 3)
       ArrayUtility.display2DElements(transMatrix);

        // Transpose in-place only applicable for Square matrix
        // transposeInPlace(arr);
        // ArrayUtility.display2DElements(arr);

    }

    private static void transposeInPlace(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j<arr[i].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    public static int[][] TransposeMatrix(int[][] arr) {
        int r = arr[0].length; // col to row
        int c = arr.length; // row to col

        int[][] ansMatrix = new int[r][c];

        for (int i = 0; i < ansMatrix.length; i++) {
            for (int j = 0; j < ansMatrix[i].length; j++) {
                ansMatrix[i][j] = arr[j][i];
            }
        }

        return ansMatrix;
    }
}
