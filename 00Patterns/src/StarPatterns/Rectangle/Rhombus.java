package StarPatterns.Rectangle;

public class Rhombus {
    public static void main(String[] args) {
        int r = 4;
        int c = 7;

        // rhombus
        rhombusPattern(r,c);
        System.out.println();
        // reverse rhombus
        reverseRhombus(r,c);
    }

    private static void reverseRhombus(int r, int c) {
        for (int i = 1; i <= r; i++) {

            // print space
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  ");
            }

            // print star
            for (int j = 1; j <= c ; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    private static void rhombusPattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            // print space
            for (int j = 1; j < i ; j++) {
                System.out.print("  ");
            }

            // print star
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
