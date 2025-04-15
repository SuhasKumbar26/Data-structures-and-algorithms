package NumberPatterns.Rectangle;

public class NumRectangle {
    public static void main(String[] args) {
        int r = 5;

        numberRectPattern1(r); // i changing

        System.out.println();

        numberRectPattern2(r); // j changing
    }

    private static void numberRectPattern2(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j<= r; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void numberRectPattern1(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j<= r; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
