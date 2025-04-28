package Practice.Arrays;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {0,1,8,45,93};


        if (IsSorted(arr,0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean IsSorted(int[] arr, int i){
        //base case
        if (i == arr.length-1 ) return true;

        //self work
        if (!(arr[i] <= arr[i+1])){
            return false;
        }

        //recursive work
        return IsSorted(arr, i+1);
    }
}
