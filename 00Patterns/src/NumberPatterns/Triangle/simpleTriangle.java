package NumberPatterns.Triangle;

public class simpleTriangle {
    public static void main(String[] args) {
        int r = 5;

        SimpleTriangle1(r);

        System.out.println();

        ReverseSimpleTriangle1(r);
    }

    private static void ReverseSimpleTriangle1(int r) {
        for (int i = 1; i <= r ; i++) {
            // print star
            for (int j = 1; j <=r-i+1 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void SimpleTriangle1(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
