package Practice.ArrayTraversal;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class occurrenceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        System.out.print("enter element to search: ");
        int element = sc.nextInt();

        countOccurrence(arr,element);
    }

    private static void countOccurrence(int[] arr, int element) {
        int count = 0;

        for (int a : arr){
            if (a == element){
                count++;
            }
        }
        System.out.print("Occurrence is: "+count);
    }
}
