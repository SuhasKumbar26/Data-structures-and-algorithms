package problems;

import java.util.Stack;

public class balancedBrackets {
    public static void main(String[] args) {
        String s = "((((((";

        if(isBalanced(s)){
            System.out.println("BALANCED");
        } else{
            System.out.println("Un - BALANCED");
        }
    }

    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') st.push(ch);
            else{ // )
                if(st.isEmpty()) return false;
                else {
                    if(st.peek() == '(') st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
