package Practice.Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Sum: "+arraySum(arr,0));
    }

    private static int arraySum(int[] arr, int i) {
        if (i == arr.length ) return 0; // Base work

        return arr[i] + arraySum(arr,i+1); // self-work + recursive work
    }
}
