package Practice.TargetSum;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        reverseArray(arr);
        int[] arr1 = {1,2,3,4,5,6,7};
        ArrayUtility.display1DElements(arr1);
        reverseArrayInPlace(arr1);
        ArrayUtility.display1DElements(arr1);
    }

    public static void reverseArrayInPlace(int[] arr) {
        int i = 0;
        int j = arr.length-1;

        while (i < j){
            swapInArray(i,j,arr);
            i++;
            j--;
        }
    }

    private static void swapInArray(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int[] arr) {
        int[] ansArr = new int[arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            ansArr[k++] = arr[i];
        }
        ArrayUtility.display1DElements(ansArr);
    }
}

