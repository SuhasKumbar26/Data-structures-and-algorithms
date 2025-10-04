package problems;

import java.util.Arrays;
import java.util.Stack;

public class stocksSpan {
    public static void main(String[] args) {
        int[] arr = {85, 80, 60, 70, 60, 75, 85};
               // op: 1 ,  1,  1,  2,  1, 4,  6;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(st.isEmpty()){
                // no element so pushes the first element of an array
                st.push(i);
                res[i] = 1;
            } else{
                while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                    st.pop();
                }
                res[i] = st.isEmpty()? 1 : i - st.peek();
                st.push(i);
            }
        }

        for (int re : res) {
            System.out.print(re+" ");
        }

        // Second approach
        System.out.print("\nSecond Approach: ");
        int[] ans = SPP(arr);
        System.out.println();
        for (int re : ans) {
            System.out.print(re+" ");
        }
    }

    private static int[] SPP(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.fill(ans, 1);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(st.isEmpty()){
                st.push(i);
            } else{
                while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                    st.pop();
                }
                ans[i] = st.isEmpty()? i+1 : i - st.peek();
                st.push(i);
            }
        }
        return ans;
    }
}
