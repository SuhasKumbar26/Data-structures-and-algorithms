package Array2d;

public class PeakIndex {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 10, 11, 12, 0};

        System.out.println(findPeak(a));
    }

    private static int findPeak(int[] a) {
        int start = 0, end = a.length - 1;
        int ans = -1;

        while(start<= end){
            int mid = start + (end - start) / 2;
            if((mid == 0 || a[mid] > a[mid-1] ) && (mid == a.length - 1 || a[mid] < a[mid + 1]))
                return mid;
            else if(a[mid] > a[mid+1]){
                // second part
                end = mid - 1;
            } else{ // a[mid] < a[mid + 1]
                // first part a[i] < a[i+1] < a[i+2] .......
                ans = mid + 1;
                start = mid + 1;
            }
        }
        return ans;
    }
}
