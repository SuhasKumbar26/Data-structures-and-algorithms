package Practice.ArrayTraversal;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class lastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        System.out.print("Enter element: ");
        int element = sc.nextInt();
        findLastOccurrence(arr,element);

        countGreaterElements(arr,element);
    }

    private static void countGreaterElements(int[] arr, int element) {
        int count = 0;

        for(int a : arr){
            if (a > element){
                count++;
            }
        }

        System.out.println("Greater elements count is: "+count);
    }

    private static void findLastOccurrence(int[] arr,int e) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e){
                lastIndex = i;
            }
        }
        System.out.println("Last index is: "+lastIndex);
    }
}
