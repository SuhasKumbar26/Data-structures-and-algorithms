package Practice.Numbers;

public class SumOfNaturalNumAlt {
    public static void main(String[] args){
        int n = 10;

        System.out.println("Answer: "+sumOfNumbers(n));
    }

    private static int sumOfNumbers(int n) {
        if (n == 0) return 0; // Base case

        int smallWork = sumOfNumbers(n-1); // Recursive work

        if (n % 2 == 0) return smallWork - n; // Self-work depends upon condition
        else return smallWork + n;
    }
}
