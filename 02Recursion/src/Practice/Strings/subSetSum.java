package Practice.Strings;

public class subSetSum {
    public static void main(String[] args) {
        int[] arr = {2,4,5};

        SubSetSum(arr,0,0);
    }

    private static void SubSetSum(int[] arr, int ans, int idx) {
        //base case
        if (idx == arr.length){
            System.out.print(ans+" ");
            return;
        }

        //self work
        int cur = arr[idx];

        //recursive work
        SubSetSum(arr, cur+ans, idx+1); //include
        SubSetSum(arr, ans, idx+1); //exclude
    }
}
