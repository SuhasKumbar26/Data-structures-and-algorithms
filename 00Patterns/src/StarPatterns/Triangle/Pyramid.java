package StarPatterns.Triangle;

public class Pyramid {
    public static void main(String[] args) {
        int r = 5;

        // pyramid
        pyramidPattern(r);

        System.out.println();

        // reverse pyramid
        reversePyramidPattern(r);
    }

    private static void reversePyramidPattern(int r) {
        int nsp = 0;
        int nst = 2*r-1;
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j <= nsp ; j++) {
                System.out.print("  ");
            }

            // print star
            for (int j = 1; j <= nst ; j++) {
                System.out.print("* ");
            }

            //update
            nsp++;
            nst-=2;
            System.out.println();
        }
    }

    private static void pyramidPattern(int r) {
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j <=r-i; j++) {
                System.out.print("  ");
            }

            // print star
            for (int k = 1; k <= ((i-1)*2+1) ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
