package Practice.ArrayTraversal;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class SearchValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        System.out.print("Enter element: ");
        int element = sc.nextInt();
        searchValueIndex(arr,element);
    }

    // Search value in array and return index
    private static void searchValueIndex(int[] arr,int e) {
        int index = -1;
        for(int i= 0; i< arr.length;i++){
            if (arr[i] == e){
                index = i;
                break;
            }
        }
        System.out.println("Element found at index: "+index);
    }
}
