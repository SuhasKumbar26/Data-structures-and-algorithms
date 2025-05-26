package Thoery;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,4,3,1};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        bubbleSort(arr); // O(n2)

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void bubbleSort(int[] arr) {
        // n-1 iterations
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                // last i elements are correctly positioned, so no need to swap them.
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) return;
        }
    }
}
