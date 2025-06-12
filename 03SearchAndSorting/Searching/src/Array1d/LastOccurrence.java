package Array1d;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {12, 13, 13, 13, 13, 15};
        int t = 13;

        System.out.println("Last occurrence: "+lastOcr(arr,t));
    }

    private static int lastOcr(int[] arr, int target) {
        int ans = -1;
        int s = 0, e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target) {
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
