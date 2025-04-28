package Practice.Arrays;

public class LastIndices {
    public static void main(String[] args){
        int[] arr = {22,2,4,2,5,2};
        int target = 22;

        int ans = lastIndices(arr,target, arr.length-1);
        System.out.println(ans);
    }

    private static int lastIndices(int[] arr, int target, int i) {
        //base case
        if (i < 0) return -1;

        //self work
        if (arr[i] == target){
            return i;
        }

        //recursive work
        return lastIndices(arr, target, i-1);
    }
}
