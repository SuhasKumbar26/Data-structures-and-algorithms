package Basics;

import java.util.Stack;

public class display {

    public static void displayRevRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayRevRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void displayRec(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRec(st);
        st.push(top);
    }

    public static void insertAtBottom(Stack<Integer> st, int val){
        if(st.isEmpty()){
            st.push(val);
            return;
        }

//        System.out.println(st);
        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }

    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty()) return;
//        System.out.println(st);
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st,top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(17);

//        System.out.println(st);
//        displayRec(st);
//        System.out.println();
//        displayRevRec(st);
//        System.out.println();
//        System.out.println(st);

//        System.out.println(st);
//        insertAtBottom(st, 1000);
//        System.out.println(st);

        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
