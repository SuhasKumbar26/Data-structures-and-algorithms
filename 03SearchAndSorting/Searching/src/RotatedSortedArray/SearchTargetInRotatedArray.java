package RotatedSortedArray;

public class SearchTargetInRotatedArray {
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 8, 9, 1, 2, 3};

        System.out.print(findTarget(a,0));
    }

    private static int findTarget(int[] a, int t) {
        int s = 0, e = a.length-1;

        while(s<=e){
            int mid = s +(e-s) / 2;
            if(a[mid] ==  t ) return mid;

            else if (a[mid] < a[e]) {//sorted
                if(t > a[mid] && t <= a[e]){ // check target lies b/w mid and end
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            } else {
                if(t >= a[s] && t < a[mid]){ // check target lies b/w start and mid
                    e = mid - 1;
                } else{
                    s = mid + 1;
                }
            }
        }
        return -1;
    }
}
