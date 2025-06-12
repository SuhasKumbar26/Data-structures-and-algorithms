package RotatedSortedArray;

public class RotatedMax {
    public static void main(String[] args){
        int[] a = {3,4,5,69,70,71,1,2};

        System.out.println(findMax(a));
    }

    private static int findMax(int[] a) {
        int st  = 0, end = a.length-1, ans = 0;

        while(st<=end){
            int mid = st + (end - st) / 2;

            if(a[mid] > a[a.length-1]){
                ans = a[mid];
                st = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
