package Practice.TwoDArrays;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class MulOf2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix 1 size r/c: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] mat1 = new int[r1][c1];

        ArrayUtility.input2DElements(mat1);

        System.out.print("Enter matrix 2 size r/c: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] mat2 = new int[r2][c2];

        ArrayUtility.input2DElements(mat2);

        ArrayUtility.display2DElements(mat1);
        ArrayUtility.display2DElements(mat2);

        int[][] mulArr = multiplicationOfArrays(mat1,r1,c1,mat2,r2,c2);
        ArrayUtility.display2DElements(mulArr);

    }

    public static int[][] multiplicationOfArrays(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        int[][] mulArr = new int[r1][c2];

        if (c1 != r2){
            System.out.println("Invalid dimension so multiplication not possible");
            return mulArr;
        }

        for (int i = 0; i < r1; i++) { // row number
            for (int j = 0; j < c2 ; j++) { // column number
                for (int k = 0; k < c1; k++) {
                    mulArr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return mulArr;
    }
}
