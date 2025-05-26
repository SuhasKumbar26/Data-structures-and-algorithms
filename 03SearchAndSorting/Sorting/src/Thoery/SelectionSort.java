package Thoery;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10,1,23,14,45,2,0,63,7};

        for (int i : arr) {
            System.out.print(i+" ");
        }

        selectionSort(arr);
        System.out.println();

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {

            int minIdx = i;


            //find the minimum element using this loop
            for (int j = i+1; j < arr.length ; j++) { // unsorted part
               if (arr[j] < arr[minIdx]){
                   minIdx = j;
               }
            }

            //swap minimum index with the arr[i] element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
