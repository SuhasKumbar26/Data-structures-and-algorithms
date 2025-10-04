package Basics;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(45);
        st.push(12);
        st.push(24);

        st.peek(); // 24
        System.out.println(st);
        st.pop(); // 24

        st.peek(); // 12
        st.pop();
        System.out.println(st);

        System.out.println("Size: "+st.size());
        System.out.println("isEmpty: "+st.isEmpty());

        st.push(23);
        st.push(45);
        st.push(12);
        st.push(24);

        // insert at any index
        Stack<Integer> gt = new Stack<>();
        int pos = 2, val = 100;
        while(st.size()>=2){
            gt.push(st.pop());
        }

        st.push(val);

        while(!gt.isEmpty()){
            st.push(gt.pop());
        }

        System.out.println(st);
    }
}
