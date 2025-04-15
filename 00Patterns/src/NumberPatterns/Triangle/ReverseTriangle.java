package NumberPatterns.Triangle;

public class ReverseTriangle {
    public static void main(String[] args) {
        int r  = 5;

        reverseTriangle1(r);

        System.out.println();

        reverseTriangle2(r);

    }

    private static void reverseTriangle2(int r) {
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j < r-i+1; j++) {
                System.out.print("  ");
            }

            // print number
            for(int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void reverseTriangle1(int r) {
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j < i ; j++) {
                System.out.print("  ");
            }

            // print number
            for(int j = 1; j<=r-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
