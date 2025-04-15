package Practice.PrefixSum;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class QueryPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        int[] prefixArr = makePrefixSum(arr);
        ArrayUtility.display1DElements(prefixArr);


        System.out.print("No.of queries: ");
        int q = sc.nextInt();

        while (q > 0){
            System.out.print("Enter range(L and R): ");
            int l = sc.nextInt(); // l-1
            int r = sc.nextInt(); // r-1
            int sum = prefixArr[r]-prefixArr[l-1];
            System.out.println("Sum is: "+sum);
            q--;
        }
    }

    private static int[] makePrefixSum(int[] arr) {
        int[] ans = new int[arr.length+1];
        int k = 1;

        for (int j : arr) {
            ans[k] = ans[k - 1] + j;
            k++;
        }
        return ans;
    }
}
