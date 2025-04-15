package Practice.TargetSum;

public class firstRepeatingNo {
    public static void main(String[] args) {
        int[] arr = {1,8,7,44,6,3,4};

        findFirstRepeating(arr);
    }

    private static void findFirstRepeating(int[] arr) {
        int repeater = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == arr[j]){
                    repeater = arr[i];
                    System.out.println("First repeating number: "+repeater);
                    return;
                }
            }
        }
        System.out.println("First repeating number: "+repeater);
    }
}
