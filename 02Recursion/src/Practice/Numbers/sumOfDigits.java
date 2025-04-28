package Practice.Numbers;

public class sumOfDigits {
    public static void main(String[] args) {
        int n = 0;

        System.out.println("Sum of digits: "+sumOfDigit(n));
    }

    private static int sumOfDigit(int n) {
        if (n >= 0 && n <= 9) return n;

        return sumOfDigit(n/10) + (n % 10);
    }
}
