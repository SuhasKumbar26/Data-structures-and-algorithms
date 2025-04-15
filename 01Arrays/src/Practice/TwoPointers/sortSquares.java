package Practice.TwoPointers;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class sortSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        int[] squareArray = squareArray(arr);
        ArrayUtility.display1DElements(squareArray);
    }

    private static int[] squareArray(int[] arr) {
        int[] ansArr = new int[arr.length];
        int l = 0;
        int r = arr.length-1;
        int k = arr.length-1;

        while (l <= r){
            if (Math.abs(arr[l]) > Math.abs(arr[r])){
                ansArr[k--] = arr[l] * arr[l];
                l++;
            } else {
                ansArr[k--] = arr[r] * arr[r];
                r--;
            }
        }
        return ansArr;
    }
}
