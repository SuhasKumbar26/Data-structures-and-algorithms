package Practice.Numbers;

public class CountDigits {
    public static void main(String[] args) {
        int n = 4;

        System.out.println("no.of digits: "+countDigits(n));
    }

    private static int countDigits(int n) {
        if (n>=0 && n<= 9) return 1;

        return countDigits(n / 10) + 1;
    }
}
