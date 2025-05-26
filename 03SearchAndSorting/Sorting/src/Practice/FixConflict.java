package Practice;

/***
 *     Given an array, all its elements are sorted in increasing order
 *     except to swap elements sort in linear time assume there are no duplicates.
 *     i/p: [3, 8, 6, 7, 5, 9, 10]
 *     o/p: [3, 5, 6, 7, 8, 9, 10]
 */
public class FixConflict {
    public static void main(String[] args){
        int[] arr = {11, 8, 6, 7, 5, 9, 0};

        displayArray(arr);
        fixConflict(arr);
        displayArray(arr);

    }

    private static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void fixConflict(int[] arr) {
        int x = -1, y= -1;

        if (arr.length <= 1) return; //edge case

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1] > arr[i]){
                if (x == -1){
                    x = i-1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
