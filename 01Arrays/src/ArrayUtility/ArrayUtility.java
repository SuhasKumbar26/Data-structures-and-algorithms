package ArrayUtility;

import java.util.Scanner;

public class ArrayUtility {

    // 1d elements Input
    public static void input1DElements(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }

    // 1d elements Display
    public static void display1DElements(int[] arr){
        System.out.print("Array elements: ");
        for (int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    // 2d elements input
    public static void input2DElements(int[][] arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2D Elements: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    // 2d elements Display
    public static void display2DElements(int[][] arr){
        System.out.println("Array elements: ");
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
