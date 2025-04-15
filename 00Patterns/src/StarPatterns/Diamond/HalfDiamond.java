package StarPatterns.Diamond;

public class HalfDiamond {
    public static void main(String[] args) {
        int r = 5;

        // half diamond
        halfDiamondPattern(r);

        System.out.println();

        // reverse half diamond
        reverseHalfDiamondPattern(r);
    }

    private static void reverseHalfDiamondPattern(int r) {
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j <= r - i ; j++) {
                System.out.print("  ");
            }
            // print star
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        r = r - 1;

        for (int i = 1; i<= r;i++){
            // print space
            for (int k = 1; k<=i;k++){
                System.out.print("  ");
            }
            // print star
            for (int j = 1; j <= r-i+1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void halfDiamondPattern(int r) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        r = r - 1;
        for (int i = 1; i <= r; i++ ){
            for (int k = 1; k<=r-i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
