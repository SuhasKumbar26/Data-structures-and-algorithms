package Array1d;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {2,2,2,5,5,5,5,5,7,8,8,8,8};
        int target = 8;

        int fOcr = firstNum(arr,target);
        System.out.println("Ans: "+fOcr);
    }

    private static int firstNum(int[] arr, int target) {
        int start = 0, end = arr.length-1;
        int fo = -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target) {
                fo = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return fo;
    }
}
