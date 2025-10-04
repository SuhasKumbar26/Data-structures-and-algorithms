package problems;

import java.util.Arrays;
import java.util.Stack;

public class nextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 3, 5};
        int[] ans = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = arr.length-1; i >= 0 ; i--) {
            if(st.isEmpty()){
                st.push(i);
                ans[i] = -1;
            } else{
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    st.pop();
                }
                ans[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }
        }

        for (int a : ans) {
            System.out.print(a+" ");
        }

        // second Approach
        int[] res = nSmaller(arr);
        System.out.println();
        for (int a : res) {
            System.out.print(a+" ");
        }
    }

    private static int[] nSmaller(int[] arr) {
        int[] res = new int[arr.length];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(st.isEmpty()){
                st.push(i);
            } else{
                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                    res[st.peek()] = i;
                    st.pop();
                }
                st.push(i);
            }
        }
        return res;
    }
}
