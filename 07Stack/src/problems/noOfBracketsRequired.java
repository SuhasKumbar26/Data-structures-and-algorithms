package problems;

import java.util.Stack;

public class noOfBracketsRequired {
    public static void main(String[] args) {
        String s = "(())())";

        int ans = noOfBracket(s);
        System.out.println("No of brackets required to remove is: "+ans);
    }

    private static int noOfBracket(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '(') st.push(ch);
            else{
                // )
                if(!st.isEmpty() && st.peek() == '(') st.pop();
                else st.push(ch);
            }
        }

        return st.size();
    }
}
