package Practice.TwoDPrefixSum;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (r/c): ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        ArrayUtility.input2DElements(arr);
        ArrayUtility.display2DElements(arr);

        System.out.print("Enter r1,c1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("Enter r2,c2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();


        // Brute force approach
        // findPrefixSum(arr,r1,c1,r2,c2);

        // pre calculate Horizontal Sum
        // PreCalPrefixSum(arr,r1,c1,r2,c2);

        // optimized way for no.of queries
        // pre-calculating both horizontal and vertical
           optimized(arr,r1,c1,r2,c2);

    }

    private static void optimized(int[][] arr, int r1, int c1, int r2, int c2) {
        int ans = 0;
        int sum = 0, left = 0, up = 0, upLeft = 0;

        calculatePrefixSum(arr);

        sum = arr[r2][c2];
        if(r1 >= 1)
            up = arr[r1-1][c2];
        if (c1 >= 1)
            left = arr[r2][c1-1];
        if (r1 >= 1 && c1 >= 1)
            upLeft = arr[r1-1][c1-1];

        ans = sum - up - left + upLeft;

        System.out.println("Sum: "+ ans);
    }

    private static void calculatePrefixSum(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        // calculate horizontal prefixSum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }

        // calculate vertical prefixSum
        for (int i = 0; i < c; i++) { // column
            for (int j = 1; j < r; j++) { // row
                arr[j][i] += arr[j-1][i];
            }
        }

        System.out.println("Prefix summed array: ");
        ArrayUtility.display2DElements(arr);
    }

    public static void PreCalPrefixSum(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0;
        findPrefixSumMatrix(arr);

        for (int i = r1; i <= r2; i++) {
            if(c1 >= 1)
                sum += arr[i][c2] - arr[i][c1-1];
            else
                sum += arr[i][c2];
        }

        System.out.print("Sum: "+sum);
    }

    private static void findPrefixSumMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] += arr[i][j-1];
            }
        }
        System.out.println("Prefix summed array: ");
        ArrayUtility.display2DElements(arr);
    }

    public static void findPrefixSum(int[][] arr ,int r1,int c1, int r2, int c2) {
        int sum  = 0;

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        System.out.print("Sum: "+sum);
    }
}
