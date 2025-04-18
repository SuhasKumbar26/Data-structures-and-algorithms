package Practice.TwoDArrays;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array (r/c = n): ");
        int n = sc.nextInt();


        int[][] arr = generateSpiralMatrix(n);
        ArrayUtility.display2DElements(arr);
    }

    private static int[][] generateSpiralMatrix(int n) {
        int[][] arr = new int[n][n];
        int totalElements = 0;

        int topRow = 0, bottomRow = n-1;
        int leftCol = 0, rightCol = n-1;

        while(totalElements < n * n){
            //topRow -> from leftCol to rightCol
            for (int i = leftCol; i <= rightCol && totalElements < n * n; i++) {
                totalElements++;
                arr[topRow][i] = totalElements;
            }
            topRow++;

            //rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < n * n; i++) {
                totalElements++;
                arr[i][rightCol] = totalElements;
            }
            rightCol--;

            //bottomRow -> rightCol to leftCol --
            for (int i = rightCol; i >= leftCol && totalElements < n * n; i--) {
                totalElements++;
                arr[bottomRow][i] = totalElements;
            }
            bottomRow--;

            //leftCol -> bottomRow to topRow --
            for (int i = bottomRow; i >= topRow && totalElements < n * n; i--) {
                totalElements++;
                arr[i][leftCol] = totalElements;
            }
            leftCol++;
        }
        return arr;
    }
}
