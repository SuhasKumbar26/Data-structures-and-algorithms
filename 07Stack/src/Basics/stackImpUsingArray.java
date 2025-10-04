package Basics;

public class stackImpUsingArray {
    static class stack{
        private int pointer;
        private final int[] arr = new int[10];

        public void push(int val){
            if(pointer >= arr.length){
                System.out.print("Stack Overflow");
                return;
            }
            arr[pointer++] = val;
        }

        public int pop(){
            if(pointer<= 0 ){
                System.out.println("Underflow");
                return -1;
            }
            else if (pointer >= arr.length){
                System.out.println("Overflow");
                return -1;
            }

            int temp = arr[pointer-1];
            arr[pointer-1] = 0;
            pointer--;
            return temp;

        }

        public void display(){
            if(pointer <= 0){
                System.out.print("Stack UnderFlow");
                return;
            }

            System.out.print("Elements: ");
            for (int i = 0; i < pointer; i++) {
                System.out.print(arr[i]+" ");
            }

            System.out.println();
        }

        public int peek (){
            if(pointer<= 0 ){
                System.out.println("Underflow");
                return -1;
            }

            return arr[pointer-1];
        }

        public int size(){
            if(pointer < 0 ){
                System.out.println("Underflow");
                return -1;
            }

            return pointer;
        }

        public int capacity(){

            return arr.length;
        }

        public boolean isEmpty(){

            return pointer == 0;
        }

    }

    public static void main(String[] args) {
        stack st = new stack();

        st.push(1);
        System.out.println("Size: "+st.size());
        System.out.println("isEmpty: "+st.isEmpty());
        st.push(2);
        System.out.println("Size: "+st.size());
        st.push(3);
        System.out.println("Size: "+st.size());
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        System.out.println("Size: "+st.size());

        st.display();

        System.out.println("peek: "+st.peek());
        System.out.println("isEmpty: "+st.isEmpty());
        System.out.println("Cap: "+st.capacity());
    }
}
