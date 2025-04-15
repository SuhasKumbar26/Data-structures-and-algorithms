package Practice.TwoPointers;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class sort0and1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        //sortZerosAndOnes(arr);

        sortZerosAndOnesInPlace(arr);

        ArrayUtility.display1DElements(arr);


    }

    private static void sortZerosAndOnesInPlace(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            if (arr[left]== 1 && arr[right]==0){ // swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
    }

    private static void sortZerosAndOnes(int[] arr) {
        int countZeros = 0;
        for (int a : arr){
            if (a == 0){
                countZeros++;
            }
        }
        // make zeros on index
        for (int i = 0; i < arr.length; i++) {
            if (i < countZeros) arr[i] = 0;
            else arr[i] = 1;
        }
    }
}
