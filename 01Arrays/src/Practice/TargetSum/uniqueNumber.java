package Practice.TargetSum;

import java.util.Scanner;

public class uniqueNumber {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,7,2,3,1};

        findUnique(arr);
    }

    private static void findUnique(int[] arr) {
        int uniqueAns = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int j : arr) {
            if (j > 0) {
                uniqueAns = j;
            }
        }

        System.out.println("Unique: "+uniqueAns);
    }
}
