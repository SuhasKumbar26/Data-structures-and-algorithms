package Thoery;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 4, 2, 0, 2};
        for (int i : arr) {
            System.out.print(i+" ");
        }

        quickSort(arr,0, arr.length-1); // O(n logN)

        System.out.println("\nArray after sorting");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        //base case
        if (start >= end) return;

        //self-work
        int pivot = partition(arr,start,end);

        //recursive work
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int lessThanPivot = 0;

        for(int i = start+1; i <= end; i++){
            if (arr[i] <= pivot) lessThanPivot++;
        }

        int pivotIdx = start + lessThanPivot;
        swap(arr, start, pivotIdx);


        // less than & equal -> pivotIdx LEFT SIDE, greater than pivotIdx -> RIGHT SIDE
        int i = start, j = end;

        while (i<pivotIdx && j>pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }

        }

        return pivotIdx;
    }

    private static void swap(int[] arr, int start, int pivotIdx) {
        int temp = arr[start];
        arr[start] = arr[pivotIdx];
        arr[pivotIdx] = temp;
    }
}
