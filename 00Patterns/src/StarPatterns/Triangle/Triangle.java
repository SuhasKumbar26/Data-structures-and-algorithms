package StarPatterns.Triangle;

public class Triangle {
    public static void main(String[] args) {
        int r = 5;

        // triangle
        trianglePattern(r);

        System.out.println();

        //reverse triangle
        reverseTriangle(r);
    }

    private static void reverseTriangle(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <=( r-i+1) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void trianglePattern(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
