package problems;

import java.util.Stack;

public class removeConsSubSequence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 4, 5, 7, 7, 7, 2, 2, 2};

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(st.isEmpty()) st.push(arr[i]);
            else{
                if(st.peek() == arr[i]){
                    if(i == arr.length-1 || arr[i] != arr[i+1]) st.pop();
                } else {
                    st.push(arr[i]);
                }
            }
        }

        System.out.println(st);
    }
}
