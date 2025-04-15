package Thoery;

import ArrayUtility.ArrayUtility;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,34,56,78,99};

        System.out.println("Original Array");
        ArrayUtility.display1DElements(arr);

        int[] arr2 = arr.clone();
        System.out.println("Copied Array");
        ArrayUtility.display1DElements(arr2);

        System.out.println("Copied Array2 after changes");
        arr2[0] = 100;
        ArrayUtility.display1DElements(arr);
        ArrayUtility.display1DElements(arr2);

        System.out.println("Copied Array3 after changes");
        int[] arr3 = Arrays.copyOf(arr,2);
        arr3[0] = 1000;
        ArrayUtility.display1DElements(arr);
        ArrayUtility.display1DElements(arr3);

        int[] arr4 = Arrays.copyOfRange(arr,1,5);
        ArrayUtility.display1DElements(arr4);

    }
}
