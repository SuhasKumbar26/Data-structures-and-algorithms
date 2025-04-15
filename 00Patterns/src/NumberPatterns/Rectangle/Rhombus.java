package NumberPatterns.Rectangle;

public class Rhombus {
    public static void main(String[] args) {
        int r = 5;

        rhombusPattern1(r);

        System.out.println();

        rhombusPattern2(r);
    }

    private static void rhombusPattern2(int r) {
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // print star
            for (int j = 1; j <= r ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void rhombusPattern1(int r) {
        for (int i = 1; i <= r ; i++) {
            // print space
            for (int j = 1; j <= r-i ; j++) {
                System.out.print("  ");
            }

            // print star
            for (int j = 1; j <= r ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
