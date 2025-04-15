package StarPatterns.Rectangle;

public class Hollow {
    public static void main(String[] args) {
        int r = 5;
        int c = 8;

        hallowRectPattern(r,c);
    }

    private static void hallowRectPattern(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
