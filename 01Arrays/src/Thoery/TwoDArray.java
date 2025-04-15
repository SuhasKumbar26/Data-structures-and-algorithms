package Thoery;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2D array size(R/C): ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Representation / initialization
        int[][] arr = new int[row][col];

        ArrayUtility.input2DElements(arr);
        ArrayUtility.display2DElements(arr);

        int[][] newArr = {{2,1,3,4},{4,5,6,7}}; // 2 x 4

        ArrayUtility.display2DElements(newArr);
    }
}
