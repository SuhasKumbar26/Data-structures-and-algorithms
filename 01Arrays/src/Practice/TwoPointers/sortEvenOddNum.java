package Practice.TwoPointers;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class sortEvenOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        sortEveOdd(arr);
        ArrayUtility.display1DElements(arr);
    }

    private static void sortEveOdd(int[] arr) {
        int l = 0;
        int r = arr.length-1;

        while (l < r){
            if (arr[l] % 2 == 1 && arr[r] % 2 == 0){
                //swap
                arr[l] = arr[l] + arr[r];
                arr[r] = arr[l] - arr[r];
                arr[l] = arr[l] - arr[r];
                l++;
                r--;
            }

            if (arr[l] % 2 == 0) l++;

            if (arr[r] % 2 == 1) r--;
        }
    }
}
