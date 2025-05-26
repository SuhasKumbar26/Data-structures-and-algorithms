package Thoery;

public class CountSort {
    public static void main(String[] args){
        int[] arr = {4, 3, 1, 5, 3, 1, 3, 5};
        int[] arr1 = {2,3,2,4,0,1,4,1,0,2};

        displayArray(arr1);
        //BasicCountSort(arr1);// Basic count sort -> unstable
        System.out.println("Array after sorting: ");
        countSort(arr1); // stable count sort
        displayArray(arr1);
    }

    public static void countSort(int[] arr){
        //find max
        int max = findMax(arr);

        int[] countArr = new int[max+1];

        //count array-making
        for (int i = 0; i < arr.length; i++) { // frequency array TC -> n
            countArr[arr[i]]++;
        }

        //prefix sum array
        for (int i = 1; i < countArr.length; i++) { // TC -> max
            countArr[i]+= countArr[i-1];
        }

        //fill elements in arr by traversing backside
        int[] output = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            int idx = countArr[arr[i]]--;
            output[idx-1]= arr[i];
        }

        //copy all elements from output array to Arr;
        for (int i = 0; i < output.length; i++) {
            arr[i]=output[i];
        }
    }

    private static void BasicCountSort(int[] arr) {
        //find a max element
        int max = findMax(arr);

        int[] countArray = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }


        int k = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                arr[k++] = i;
            }
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

    public static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
