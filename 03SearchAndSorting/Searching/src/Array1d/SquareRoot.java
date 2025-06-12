package Array1d;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 24;

        System.out.println(findSquareRoot(n));
    }

    private static int findSquareRoot(int n) {
        int s = 0, e = n;
        int ans = 0;
        while(s<=e){
            int mid = s + (e-s) / 2;
            int val = mid * mid;

            if(val == n) {
                return mid;
            } else if (val > n) {
                e = mid -1;
            } else {
                s = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

}
