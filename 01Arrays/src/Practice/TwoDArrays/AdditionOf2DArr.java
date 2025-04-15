package Practice.TwoDArrays;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class AdditionOf2DArr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A array size(R/C): ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        ArrayUtility.input2DElements(A);


        System.out.print("Enter B array size(R/C): ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];
        ArrayUtility.input2DElements(B);

        ArrayUtility.display2DElements(A);
        ArrayUtility.display2DElements(B);

        int[][] sumArr = additionOf2DArrays(A,r1,c1,B,r2,c2);

        ArrayUtility.display2DElements(sumArr);
    }

    private static int[][] additionOf2DArrays(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        int[][] sumArr = new int[r1][c1];
        if (r1 != r2 || c1 != c2){
            System.out.println("Addition is not possible due to Dimensional ERROR");
            return sumArr;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sumArr[i][j] = a[i][j] + b[i][j];
            }
        }
        return sumArr;
    }
}
