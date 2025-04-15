package NumberPatterns.Rectangle;

public class Hallow {
    public static void main(String[] args) {
        int r = 9;

        hallowPattern(r);
    }

    private static void hallowPattern(int r) {
        for (int i = 1; i <= r ; i++) {
            for (int j = 1; j <= r ; j++) {
                if (i == 1 || i == r || j == 1 || j == r){ /*|| i == (r/2)+1*/  /*|| j == r/2+1*/
                    System.out.print(i+" ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
