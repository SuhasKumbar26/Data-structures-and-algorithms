package Practice.Arrays;

public class printArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        display(arr,0);
    }

    private static void display(int[] arr,int index) { // 1,2,3,4,5
        if (index == arr.length) return; // Base case

        System.out.print(arr[index]+" "); // Self-Work -> 1

        display(arr, index+1); // Recursion -> 2,3,4,5
    }
}
