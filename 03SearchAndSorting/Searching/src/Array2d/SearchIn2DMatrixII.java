package Array2d;

public class SearchIn2DMatrixII {
    public static void main(String[] args) {
        int[][]  a = {
                {1,  4,  7, 11, 15},
                {2,  5,  8, 12, 19},
                {3,  6,  9, 16, 22},
                {10,13, 14, 17, 24}};
        // each row and col both are sorted

        int target = 130;

        System.out.println(findTarget(a,target));
    }

    private static boolean findTarget(int[][] a, int target) {
        int i = 0;
        int j = a[0].length - 1;

        while(i<a.length && j>=0){
            if(target == a[i][j]) return true;

            else if (target > a[i][j]) {
                i++;
            } else { // target < a[i][j]
                j--;
            }
        }
        return false;
    }
}
