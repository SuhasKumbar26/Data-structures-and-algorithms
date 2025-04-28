package Practice.Arrays;

import java.util.ArrayList;

public class IndicesArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,4};
        int target = 4;

        ArrayList<Integer> AnsList = findAllIndices(arr,target,0);
        System.out.println("ArrayList: "+AnsList);
    }
    /*
        Array -> {4,4,5,4}
        target -> 4
        ans(arraylist) -> {0,1,3}
    */

    private static ArrayList<Integer> findAllIndices(int[] arr, int target, int i) {
        //base case
        if (i >= arr.length){
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        //self work
        if (arr[i] == target){ // add -> {0}
            ans.add(i);
        }

        //Recursive Work
        ArrayList<Integer> smallWorkAns = findAllIndices(arr,target,i+1); // add -> {1,3}
        ans.addAll(smallWorkAns); // {0,1,3}

        return ans;
    }
}
