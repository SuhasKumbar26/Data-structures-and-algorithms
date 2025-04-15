package Practice.TargetSum;

import ArrayUtility.ArrayUtility;

import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        ArrayUtility.input1DElements(arr);
        ArrayUtility.display1DElements(arr);

        int[] fArray = makeFArray(arr);

        System.out.print("Enter no.of queries: ");
        int q = sc.nextInt();

        while (q>0){
            System.out.print("Enter element to Search: ");
            int x = sc.nextInt();

            if (fArray[x]>0){
                System.out.println("Yes");
            } else System.out.println("No");
            q--;
        }
    }

    private static int[] makeFArray(int[] arr) {
        int[] fArr = new int[100];
        for (int j : arr) {
            fArr[j]++;
        }
        return fArr;
    }
}
