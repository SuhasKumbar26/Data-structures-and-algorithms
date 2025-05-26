package Thoery;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 4, 2, 0};

        for (int i : arr) {
            System.out.print(i+" ");
        }

        mergeSort(arr,0, arr.length-1); // O(n logN)

        System.out.println("\nArray after sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int[] arr, int l , int r) {
        // base Case
        if(l >= r) return;

        // recursive work
        int mid = ( l + r ) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);

        //self work
        merge(arr, l, mid, r);
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i<n1; i++) left[i] = arr[l+i];
        for (int j = 0; j<n2; j++) right[j] = arr[mid+1+j];

        int i=0,j=0,k=l;

        while (i<n1 && j<n2){
            if (left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        // if J is reached loop and left array has elements
        while (i<n1)
            arr[k++] = left[i++];
        // if I is reached loop and right array has elements
        while (j<n2)
            arr[k++] = right[j++];
    }
}
