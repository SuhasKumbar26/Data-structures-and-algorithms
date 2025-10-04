package problems;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
//        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4, 4};
        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        int[] res = new int[arr.length];

        for (int i = arr.length-1; i >= 0; i--) {
            if(st.isEmpty()){
                st.push(arr[i]);
                res[i] = -1;
            } else {
                while(!st.isEmpty() && st.peek() <= arr[i]){
                    st.pop();
                }

                res[i] = st.isEmpty() ? -1 : st.peek();
//              if (st.isEmpty()) res[i] = -1;
//              else res[i] = st.peek();
                st.push(arr[i]);
            }
        }

        for (int re : res) {
            System.out.print(re+" ");
        }

        // second approach
        System.out.print("\nSecond Approach: ");
        int[] ans = NGE(arr);
        System.out.println();
        for (int re : ans) {
            System.out.print(re+" ");
        }
    }

    private static int[] NGE(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(st.isEmpty()){
                st.push(i);
            } else{
                while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                   ans[st.peek()] = arr[i];
                   st.pop();
                }
                st.push(i);
            }
        }
        return ans;
    }
}
