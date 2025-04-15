package StarPatterns.Rectangle;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int r = sc.nextInt();

        squarePattern(r);
    }

    private static void squarePattern(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
