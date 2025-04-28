package Practice.Numbers;

public class GCD {
    public static void main(String[] args) {
        int x = 15, y= 24;

        System.out.println("GCD: "+bruteForce(x,y)); //Brute force

        System.out.println("GCD: "+longDivision(x,y)); //long Division

        System.out.println("GCD: "+EuclidsAlgo(x,y)); //Algorithm
    }

    private static int EuclidsAlgo(int x, int y) {
        if (y == 0) {
            return x;
        }

        return EuclidsAlgo(y,x%y);
    }

    private static int longDivision(int x, int y) {
        while (x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    private static int bruteForce(int x, int y) {
        int min = Math.min(x,y);

        for (int i = min; i >= 1; i--) {
            if (x % i == 0 && y % i == 0){
                return i;
            }
        }
        return 1;
    }
}
