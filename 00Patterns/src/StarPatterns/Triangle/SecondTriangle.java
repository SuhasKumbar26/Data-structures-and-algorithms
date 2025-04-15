package StarPatterns.Triangle;

public class SecondTriangle {
    public static void main(String[] args) {
        int r = 5;

        // right triangle
        rightTriangle(r);

        System.out.println();

        // reverse right triangle
        reverseRightTriangle(r);

    }

    private static void reverseRightTriangle(int r) {
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j < i ; j++) {
                System.out.print("  ");
            }

            // print star
            for (int j = 1; j <=(r-i+1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rightTriangle(int r) {
        for (int i = 1; i <= r; i++) {
            // print space
            for (int j = 1; j <= r-i; j++) {
                System.out.print("  ");
            }

            // print star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
