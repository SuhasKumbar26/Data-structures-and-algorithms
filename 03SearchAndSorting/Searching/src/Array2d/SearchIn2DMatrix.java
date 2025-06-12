package Array2d;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][]  a = {{1, 4, 7, 11, 15},{2, 5, 8, 12,19},{23, 30, 34, 60}};
        int target = 169;

        System.out.println(SearchIn2D(a,target));
    }

    private static boolean SearchIn2D(int[][] a, int target) {
        int r = a.length, c = a[0].length;
        int start = 0;
        int end = r * c - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            int midElt = a[mid/c][mid%c]; // convert number to COL and ROW

            if(midElt == target) return true;

            else if (midElt > target) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return false;
    }
}
