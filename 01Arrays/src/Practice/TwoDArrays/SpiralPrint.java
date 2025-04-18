package Practice.TwoDArrays;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (R/C): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        ArrayUtility.input2DElements(arr);
        ArrayUtility.display2DElements(arr);

        printSpiralOrder(arr,r,c);
    }

    private static void printSpiralOrder(int[][] arr , int r , int c) {
        int topRow = 0 , bottomRow = r-1;
        int leftCol = 0 , rightCol = c-1;

        int totalElements = 0;

        while (totalElements < r * c){
            // topRow -> leftCol to rightCol
            for (int i = leftCol; i <= rightCol  && totalElements < r * c ; i++) {
                System.out.print(arr[topRow][i]+" ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElements < r * c  ; i++) {
                System.out.print(arr[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int i = rightCol; i >= leftCol && totalElements < r * c  ; i--) {
                System.out.print(arr[bottomRow][i]+" ");
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < r * c ; i--) {
                System.out.print(arr[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
}
