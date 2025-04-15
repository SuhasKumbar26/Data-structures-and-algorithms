package StarPatterns.Rectangle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no.of col: ");
        int c = sc.nextInt();

        rectanglePattern(r,c);
    }

    private static void rectanglePattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
