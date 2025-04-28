package Practice.Numbers;

public class NaturalNoSum {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Sum is: "+sum(n));
    }

    private static int sum(int n) {
        if (n == 0) return n; // base case

        int smallWork = sum(n-1); // recursive work

        return smallWork + n; // self-work adding last number(n)
    }
}
