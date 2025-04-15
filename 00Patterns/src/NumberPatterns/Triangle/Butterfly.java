package NumberPatterns.Triangle;

public class Butterfly {
    public static void main(String[] args) {
        int r = 7;

        butterflyPattern(r);
    }

    private static void butterflyPattern(int n) {
        // Variables to store number of spaces and stars
        int spaces = 2 * n - 1;
        int stars = 0;

        // The outer loop will run for (2 * N - 1) times
        for (int i = 1; i <= 2 * n - 1; i++) {
            // Upper half of the butterfly
            if (i <= n) {
                spaces = spaces - 2;
                stars++;
            }
            // Lower half of the butterfly
            else {
                spaces = spaces + 2;
                stars--;
            }
            // Print stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= stars; j++) {
                if (j != n) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
