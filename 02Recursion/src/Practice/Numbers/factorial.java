package Practice.Numbers;

public class factorial {
    public static void main(String[] args) {
        int n = 6;

        long ans = fact(n);
        System.out.println("Answer: "+ans);
    }

    private static long fact(int n) {
        // fat(5) = 5 * fact(4)
        //              fact(4) = 4 * fact(3)
        //                            fact(3) = 3 * fact(2)
        //                                          fact(2) = 2 * fact(1)
        //                                                        fact(1) = 1

        if(n == 1){
            return 1; // -> BASE CASE
        }

        long smallAns = fact(n-1); // -> SMALL-WORK

        return n * smallAns;  // -> SELF-WORK
    }
}
