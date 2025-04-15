package Practice.ArrayTraversal;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        // input array and calculate sum
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        calculateSum(arr);
    }

    // Calculate array elements sum.
    private static void calculateSum(int[] arr) {
        int sum = 0;
        for (int a : arr){
            sum += a;
        }
        System.out.print("Sum is: "+sum);
        System.out.println();
    }
}
