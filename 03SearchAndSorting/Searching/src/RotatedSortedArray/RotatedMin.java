package RotatedSortedArray;

public class RotatedMin {
    public static void main(String[] args) {
        int[] a = {3,4,5,6,1,2};
        int min = findMin(a);
        System.out.print(min);
    }

    private static int findMin(int[] a) {
        int s = 0, e = a.length-1;
        int ans = 0;

        while(s<=e){
            int mid = s +(e - s) / 2;

            if(a[mid] > a[a.length-1]){
                s = mid + 1;
            } else { // a[mid] < a[a.length-1]
                ans = a[mid];
                e = mid - 1;
            }
        }

        return ans;
    }
}
