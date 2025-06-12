package RotatedSortedArray;

public class SearchTargetInRotatedDuplicateArray {
    public static void main(String[] args){
        int[] a = {1, 1, 1, 1, 2, 3, 4, 1, 1};

        System.out.println(findTarget(a, 3));
    }

    private static boolean findTarget(int[] a, int target) {
        int start = 0, end = a.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(a[mid] == target) return true;
            // all the same (mid == start == end)
            else if (a[mid] == a[start] && a[mid] == a[end]) {
                start++;
                end--;
            }
            // start -> mid (Sorted)
            else if(a[mid] > a[start]){
                // check target lies b/w start to mid
                if(target>=a[start] && target<a[mid]){
                    // if yes, move end -> mid - 1;
                    end = mid - 1;
                } else{
                    // target doesn't lie b/w start to mid so, move start -> mid + 1
                    start = mid + 1;
                }
            }  else{ // mid -> end sorted
                // check target lie b/w mid to end
                if(target>a[mid] && target<=a[end]){
                    // if yes, move start -> mid + 1
                    start = mid + 1;
                } else{
                    // target doesn't lie b/w mid to end so, move end -> mid - 1;
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
