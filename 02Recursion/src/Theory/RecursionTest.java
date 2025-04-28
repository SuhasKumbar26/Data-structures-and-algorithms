package Theory;

import java.util.Scanner;

public class RecursionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        printIncreasing(n);
        System.out.println("\n================");
        printDecreasing(n);
    }

    private static void printDecreasing(int n) {
        // print all natural numbers from N to 1
        // PD(n) =    n ,   { n-1, n-2, n-3, .................1 }
        //        self-work, { PD(n-1) subWork }

        if (n == 1){
            System.out.print(n+" "); // -> BASE CASE
            return;
        }

        System.out.print(n+" ");     // -> SELF WORK

        printDecreasing(n-1);     // -> RECURSIVE WORK
    }

    public static void printIncreasing(int n){
        // print all natural numbers from 1 to N
        // PI(n) = { 1, 2, 3, 4, ........................n-2, n-1 }  n
        //          { PI(n-1) subWork }                             self-work

        if (n == 1){
            System.out.print(n+" "); // -> BASE CASE
            return;
        }

        printIncreasing(n-1);     // -> RECURSIVE WORK

        System.out.print(n + " ");   // -> SELF WORK
    }
}
