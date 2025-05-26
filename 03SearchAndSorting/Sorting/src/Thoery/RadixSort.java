package Thoery;


public class RadixSort {

    private static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {170, 45, 75, 90, 802, 2};

        displayArray(arr);
        radixSort(arr);
        System.out.println("Array after sorting: ");
        displayArray(arr);

    }

    private static void radixSort(int[] arr) {
        int max = findMax(arr);
        for (int place = 1; max / place > 0 ; place *= 10) {
            countSort(arr, place);
        }
    }

    private static void countSort(int[] arr, int place) {
        int[] countArr = new int[10];

        //count last digit occurrence in numbers
        for (int i = 0; i < arr.length; i++){
            int lastNo = (arr[i]/place) % 10;
            countArr[lastNo]++;
        }

        //make count array prefix
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i-1];
        }

        // fill elements in an output array by traversing reverse from the end.
        int[] output = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int lastNo = (arr[i]/place) % 10;
            int idx = countArr[lastNo];
            output[idx-1] = arr[i];
            countArr[lastNo]--;
        }

        // copy back to arr
        for (int i = 0; i < output.length; i++) {
            arr[i] = output[i];
        }
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max)
                max = j;
        }
        return max;
    }
}
