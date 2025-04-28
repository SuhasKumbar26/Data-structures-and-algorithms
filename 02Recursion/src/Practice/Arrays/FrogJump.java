package Practice.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] arr = {10,30,40,20,10};

        System.out.println("Minimum Cost: "+findCost(arr,0));
    }

    private static int findCost(int[] arr, int idx) {
        //base case
        if(idx == arr.length-1) return 0;

        int fCost = Math.abs(arr[idx] - arr[idx+1]) + findCost(arr, idx+1);

        if(idx == arr.length-2) return fCost;

        int sCost = Math.abs(arr[idx] - arr[idx+2]) + findCost(arr, idx+2);

        return Math.min(fCost,sCost);
    }

    private static int findCost1(int[] arr, int idx) {
        //base case
        if(idx == arr.length-1) return 0;

        int fCost = Math.abs(arr[idx] - arr[idx+1]) + findCost(arr, idx+1);

        int sCost = Integer.MAX_VALUE;
        if(idx < arr.length-2) {
            sCost = Math.abs(arr[idx] - arr[idx + 2]) + findCost(arr, idx + 2);
        }

        return Math.min(fCost,sCost);
    }
}
