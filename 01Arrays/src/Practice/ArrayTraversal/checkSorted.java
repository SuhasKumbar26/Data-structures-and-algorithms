package Practice.ArrayTraversal;

import java.util.Arrays;

public class checkSorted {
    // Ascending order
    public static void main(String[] args) {
        int[] arr = {1,3,5,9,11,13};
        isSorted(arr);

        int[] arr2 = {1,3,5,9,11,13};
        int k = 3;
        int[] ansArr = kthLargestSmallest(arr2,k);
        System.out.print("Smallest: "+ ansArr[0]+" Largest: "+ ansArr[1]);
    }

    private static int[] kthLargestSmallest(int[] arr , int k) {
        Arrays.sort(arr);
        return new int[]{arr[k-1],arr[arr.length-k]};
    }

    private static void isSorted(int[] arr) {
        boolean isSorted = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (!(arr[i] <= arr[i+1])){
                isSorted = false;
                break;
            }
        }

        if (isSorted) System.out.println("Array is sorted in Ascending Order.");
        else System.out.println("Not sorted");
    }
}
