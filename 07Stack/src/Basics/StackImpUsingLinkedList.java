package Basics;

public class StackImpUsingLinkedList {
     static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
            next = null;
        }
    }
    public static class LLStack {
        private Node head;
        private int size;

        public void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }

        public int pop(){
            if(head == null) return -1;
            int temp = head.data;
            head = head.next;
            size--;
            return temp;
        }

        public void displayRec(Node temp){
            if(temp == null) return;
            displayRec(temp.next);
            System.out.print(temp.data+" ");
        }

        public int size(){

            return size;
        }

        public int peek(){
            if(head == null) return -1;
            return head.data;
        }


    }

    public static void main(String[] args) {
        LLStack st = new LLStack();

        st.push(4);
        st.displayRec(st.head); // 4
        System.out.println();

        st.push(5);
        st.displayRec(st.head); // 4 5
        System.out.println();

        st.push(1);
        st.displayRec(st.head); // 4 5 1
        System.out.println();

        System.out.println("size: "+st.size()); // 3

        st.pop();

        st.displayRec(st.head); // 4 5
        System.out.println();
        System.out.println("size: "+st.size()); // 2

        st.push(7);
        st.displayRec(st.head); // 4 5 7
        System.out.println();
        System.out.println("peek: "+st.peek());

        st.push(0);
        st.displayRec(st.head); // 4 5 7 0
        System.out.println();

        System.out.println("peek: "+st.peek());
    }
}
