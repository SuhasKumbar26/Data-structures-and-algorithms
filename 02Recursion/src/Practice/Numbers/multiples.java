package Practice.Numbers;

public class multiples {
    public static void main(String[] args) {
        int n = 12, k = 5;

        printMultiples(n,k);
    }

    private static void printMultiples(int n, int k) { // 12, 24, 36, 48, 60
        //Base case
        if(k == 0){
//            System.out.print(n+" ");
            return;
        }

        // Recursive work
         printMultiples(n,k-1); // 12, 24, 36, 48

        //Self work
        System.out.print(n*k+" "); // 60
    }
}
