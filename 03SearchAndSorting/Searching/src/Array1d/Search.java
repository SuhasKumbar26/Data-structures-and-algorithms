package Array1d;

public class Search {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 15, 23, 27, 67, 89};
        int target = 15;

        //int isFind = binarySearch(arr,target);
        //System.out.println("Ans: "+isFind);

        boolean find = recursiveBinarySearch(arr,0,arr.length-1,target);
        System.out.println("Ans: "+find);
    }

    private static boolean recursiveBinarySearch(int[] arr, int start, int end, int target) {
        //base case
        if(start > end) return false;

        //self work
        int mid = start + (end-start) / 2;
        if(arr[mid] == target) return true;

        // recursive work
        if (arr[mid] < target) {
            return recursiveBinarySearch(arr, mid + 1, end, target);
        }
        else { // arr[mid] > target
            return recursiveBinarySearch(arr, start, mid-1, target);
        }
    }

    public static int binarySearch(int[] a, int t){
        int start = 0, end = a.length-1;
        while(start <= end){
            int mid = (start + end) / 2;

            if(a[mid] == t) return mid;

            else if(t > a[mid]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
}
