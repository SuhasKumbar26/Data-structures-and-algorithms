package Practice.ArrayTraversal;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class findMaximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        findMax(arr);

    }

    // Find maximum element in array.
    private static void findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int a : arr){
            if (a > max){
                max = a;
            }
        }
        System.out.println("Max is: "+max);
        System.out.println();
    }
}
