package Practice.TargetSum;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class rotateByKSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        System.out.print("Enter steps to rotate: ");
        int k = sc.nextInt();

        rotateArrayByKStep(arr, k);

        ArrayUtility.display1DElements(arr);
    }

    public static void rotateArrayByKStep(int[] arr,int k) {
        k = k % arr.length;
        int n = arr.length;

        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
