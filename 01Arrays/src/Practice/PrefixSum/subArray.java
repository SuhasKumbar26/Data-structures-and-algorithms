package Practice.PrefixSum;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        boolean isSubArray = equalSumPartition(arr);
        System.out.println(isSubArray);
    }

    private static boolean equalSumPartition(int[] arr) {
        int total = totalSum(arr);
        int prefix=0, suffix;

        for (int j : arr) {
            prefix += j;
            suffix = total - prefix;
            if (prefix == suffix) {
                return true;
            }
        }

        return false;
    }

    private static int totalSum(int[] arr) {
        int total = 0;
        for (int a : arr){
            total += a;
        }
        return total;
    }

}
