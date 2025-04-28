package Practice.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,4,6,4,2};
        int target = 4;

        //find(arr,target,0);

        //int ans = findIndex(arr,target,0);

        //System.out.println("Index found at: "+ans);

        findAllIndexes(arr,target,0);
    }

    private static void findAllIndexes(int[] arr, int target, int i) {
        // {1,4,5,4,6,4,2}   -> o/p : 1,3,5

        //base case
        if (i>= arr.length) return;

        //self work
        if (arr[i] == target){
            System.out.print(i+" ");
        }

        //recursive work
        findAllIndexes(arr,target,i+1);
    }

    private static int findIndex(int[] arr, int target, int i) {
        // base case
        if (i >= arr.length) return -1;

        // self work
        if (arr[i] == target) return i;

        // recursive work
        return findIndex(arr, target, i+1);
    }

    public static void find(int[] arr,int target, int i) {
        if (i == arr.length){
            System.out.println("NO");
            return;
        }

        if (arr[i] == target){
            System.out.println("YES");
            return;
        }

        find(arr,target,i+1);
    }
}
