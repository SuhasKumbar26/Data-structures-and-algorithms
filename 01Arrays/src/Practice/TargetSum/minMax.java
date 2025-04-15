package Practice.TargetSum;

public class minMax {
    public static void main(String[] args) {
        int[] arr = {5,4,21,35,99};

        findSecondMax(arr);
    }

    private static void findSecondMax(int[] arr) {
        int fMax = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int a : arr){
            if (a > fMax){
                sMax = fMax;
                fMax = a;
            }
        }

        System.out.println("Second max: "+sMax);
    }
}
