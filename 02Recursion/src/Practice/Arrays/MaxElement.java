package Practice.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {};

       int max =  maxElement(arr,0);
        System.out.println("Max: "+max);
    }

    private static int maxElement(int[] arr, int i) {
        if (i == arr.length) return 0; // Base case

        int max = maxElement(arr, i+1); // recursive Work

        return Math.max(arr[i],max); // Self-Work
    }
}
