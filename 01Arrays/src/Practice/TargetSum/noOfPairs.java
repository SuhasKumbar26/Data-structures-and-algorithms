package Practice.TargetSum;

public class noOfPairs {
    public static void main(String[] args) {
        int[] arr = {4,6,3,5,8,2};

        int target = 7;

        findPair(arr,target);

        int[] arr1 = {1,4,5,6,3};
        int targetSum = 12;

        tripletPair(arr1,targetSum);
    }

    private static void tripletPair(int[] arr1, int targetSum) {
        int tripletCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length ; j++) {
                for (int k = j+1; k < arr1.length ; k++) {
                    if (arr1[i]+arr1[j]+arr1[k] == targetSum){
                        tripletCount++;
                    }
                }
            }
        }

        System.out.println("count of triplets: "+tripletCount);
    }

    private static void findPair(int[] arr, int target) {
        int countPair = 0;

        for (int i = 0; i< arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] + arr[j] == target){
                    countPair++;
                }
            }
        }

        System.out.println("Pairs: "+countPair);
    }
}
