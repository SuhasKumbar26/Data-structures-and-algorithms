package Practice;

public class PracticeQuickSort {
    public static void main(String[] args){
        int[] arr = {8,7,10,6,18,21,0,5,12,15,1};

        quickSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void quickSort(int[] arr, int start, int end){
        //base case
        if(start >= end) return;
        //self-work
        int pivotIndex = pivot(arr,start,end);
        //recursive work
        quickSort(arr, start, pivotIndex-1);
        quickSort(arr, pivotIndex+1, end);
    }

    public static int pivot(int[] arr, int start, int end){
        // choose start as a pivot element
        int pivot = arr[start];

        //count no.of elements less than a pivot element
        int noOfLessThanPivot = 0;
        for(int i = start; i<=end; i++){
            if(arr[i] < pivot){
                noOfLessThanPivot++;
            }
        }

        //place pivot to its correct position
        int pivotIdx = start + noOfLessThanPivot;
        swap(arr,start,pivotIdx);

        //make less than pivot left side and greater to right side
        int i = start, j = end;
        while (i<pivotIdx && j>pivotIdx){

            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if(i<pivotIdx && j>pivotIdx){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
        }
        return  pivotIdx;
    }

    public static void swap(int[] a, int start, int pivotIndx){
        int temp = a[start];
        a[start] = a[pivotIndx];
        a[pivotIndx] = temp;
    }
}
