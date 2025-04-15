package Practice.TwoDArrays;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class Rotate90Deg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        ArrayUtility.input2DElements(arr);
        ArrayUtility.display2DElements(arr);

        rotateBy90Deg(arr);
    }

    public static void rotateBy90Deg(int[][] arr) {
        // transpose first
        transposeMatrix(arr);

        // rotate every row one by one
        for (int[] array : arr) {
            rotateRow(array);
        }

        ArrayUtility.display2DElements(arr);
    }

    private static void rotateRow(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            int lastIndex = arr.length-1-i;
            arr[i] = arr[lastIndex];
            arr[lastIndex] = temp;
        }
    }

    private static void transposeMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
