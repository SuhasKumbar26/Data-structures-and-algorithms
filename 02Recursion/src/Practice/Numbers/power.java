package Practice.Numbers;

public class power {
    public static void main(String[] args) {
        int p = 2, q = 6;

        System.out.printf("Answer(%d,%d) is: %d\n",p,q,pow(p,q));

        //  alternative approach
        System.out.printf("Answer(%d,%d) is: %d",p,q,AltPow(p,q));
    }

    private static int AltPow(int p, int q) {
        if (q == 0 ) return 1;
        int smallPow = AltPow(p,q/2);

        if (q % 2 == 0){
            return smallPow * smallPow;
        } else {
            return p * smallPow * smallPow;
        }
    }

    private static int pow(int p, int q) {
        if (q == 0 ) return 1;

        return pow(p,q-1) * p;
    }
}
