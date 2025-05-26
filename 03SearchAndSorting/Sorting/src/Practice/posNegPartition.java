package Practice;

public class posNegPartition {

    private static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {19, -20, 7, -4, -13, 11, -5, 3};

        displayArray(arr);
        makePartition(arr);
        displayArray(arr);

    }

    private static void makePartition(int[] arr) {
        int l = 0, r = arr.length-1;

        while (l<=r){
            if(arr[l]>0 && arr[r]<0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (arr[l]<0) {
                l++;
            } else {
                r--;
            }
        }
    }
}
