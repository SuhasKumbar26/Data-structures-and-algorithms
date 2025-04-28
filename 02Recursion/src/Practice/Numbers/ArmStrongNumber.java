package Practice.Numbers;
public class ArmStrongNumber {
    public static void main(String[] args){
        int n = 9474;
        System.out.println("is ArmStrong number: "+isArmStrongNumber(ArmStrongNo(n,power(n)),n));
    }
    private static boolean isArmStrongNumber(int ans,int n) {
        return ans == n;
    }
    private static int ArmStrongNo(int n, int power) {
        if (n == 0) return 0;
        return ArmStrongNo(n / 10,power) + (int)Math.pow(n%10,power);
    }
    public static int power(int n){
        if (n >= 0 && n<= 9) return 1;
        return power(n / 10) + 1;
    }
}