package Thoery;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 4, 2, 0};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        insertionSort(arr); // O(n2)

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j > 0 ; j--) { //come reverse up to Zero(0) j--;

                // swap adjacent elements until it reach correct position.
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }

        }
    }
}
