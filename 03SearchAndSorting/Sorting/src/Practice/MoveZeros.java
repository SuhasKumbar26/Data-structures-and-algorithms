package Practice;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,-1,0,3,42};

        for (int i : arr) {
            System.out.print(i+" ");
        }

        moveZeros(arr);
        System.out.println();

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void moveZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;

            for (int j = 0; j < arr.length -1 - i; j++) {
                // current element is ZERO and adjacent element is not zero than swap();
                if (arr[j] == 0 && arr[j+1] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }

            if (!flag) return;
        }
    }
}
