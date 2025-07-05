package Leetcode;

public class findNthNodeFromLast {
    public static class linkedList{
        public static class listNode{
            int val;
            listNode next;
            listNode(int data){
                val = data;
                next = null;
            }
        }

        listNode head = null;
        listNode tail = null;

        public void insert(int val){
            listNode n = new listNode(val);

            if(head == null){
                head = n;
                return;
            }
            listNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = n;
            tail = n;
        }

        public void display(){
            listNode temp = head;
            if(head == null) return;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }

            System.out.println();
        }

        public void displayFrom(listNode node){
            listNode temp = node;
            //if(head == null) return;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }

            System.out.println();
        }

        public int size(){
            listNode temp = head;
            int size = 0;
            if(head == null) return 0;
            while(temp != null){
                size++;
                temp = temp.next;
            }
            return size;
        }

        public listNode nthNodeFromLast (int n){
            if(n==size()){
                head = head.next;
                return head;
            }

            int m = size();
            int idx = m - n + 1;
            listNode temp = head;
            for (int i=1; i<=idx-1; i++){
                temp = temp.next;
            }

            //temp.next = temp.next.next;
            return temp;
        }

        public listNode nthNodeFromLastSLPointer(int n){ // IMPORTANT
            listNode slow = head;
            listNode fast = head;
            for (int i = 1; i <= n; i++) {
                fast = fast.next;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
            return head;
        }
    }



    public static void main(String[] args) {
        linkedList ll = new linkedList();

        ll.insert(12);
        ll.insert(10);
        ll.insert(100);
        ll.insert(8);
        ll.insert(11);
        ll.insert(14);

        ll.display();

        System.out.println("Size: "+ll.size());

//        ll.displayFrom(ll.nthNodeFromLast(4));
        ll.displayFrom(ll.nthNodeFromLastSLPointer(3));







    }
}
