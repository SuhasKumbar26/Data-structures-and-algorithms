package Practice.Numbers;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 6;

        long ans = fibonacci(n);
        System.out.println("Answer: "+ans);
    }

    private static long fibonacci(int n) {
        if (n == 0 || n == 1 ){
            return n;       // -> BASE-CASE
        }

        return fibonacci(n-1)       +          fibonacci(n-2);
        //     RECURSIVE-WORK      SELF-WORK      RECURSIVE-WORK
    }
}
