package BasicsOfList;

public class implementation {
    //linkedList
    public static class linkedList{
        // node
        static class Node{
            // data
            int data;
            // next Node
            Node next;

            Node(int data){
                this.data = data;
                next = null;
            }
        }

        // head
        Node head = null;

        // tail
        Node tail = null;

        // insert At the END
        public void insertAtEnd(int val){
            // create a new node
            Node n = new Node(val);

            // if head is null, store new node at head
            if(head == null){
                head = n;
                tail = n;
                return;
            }

//            Node temp = head;
//            while(temp.next != null){
//                temp = temp.next;
//            }
//
//            temp.next = n;
//            tail = n;
//
            tail.next = n;
            tail = n;
        }

        // insert at HEAD
        public void insertAtHead(int val){
            Node n = new Node(val);
            if(head == null){
                head = n;
                tail = n;
            }

            n.next = head;
            head = n;
        }

        // display
        public void display(){
            Node head = this.head;
            while (head != null){
                System.out.print(head.data+" ");
                head = head.next;
            }
        }

        // calculate size
        public int size(){
            int size = 0;
            Node head = this.head;
            while (head != null){
                size++;
                head = head.next;
            }
            return size;
        }

        // insert at position
        public void insertAtPos(int pos, int val) {
            if (pos < 1 || pos > size() + 1) {
                System.out.println("Wrong index");
                return;
            }

            if (pos == 1) {
                insertAtHead(val);
                return;
            }

            if (pos == size() + 1) {
                insertAtEnd(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }

            Node n = new Node(val);
            n.next = temp.next;
            temp.next = n;
        }

        // get element from index
        public int getAt(int idx){
            if(idx<0 || idx > size()-1){
                return -1;
            }

            int count = 0;
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

        // delete at index
        public void deleteAtPos(int idx){
            if(head == null) return;
            if(idx == 0){
                head = head.next;
                return;
            }

            if(idx >= size()){
                System.out.println("Wrong idx");
                return;
            }

            Node temp = head;
            for(int i = 1; i <=idx-1 ; i++){
                temp = temp.next;
            }

            if(idx == size()-1){
                temp.next = temp.next.next;
                tail = temp;
                return;
            }
            temp.next = temp.next.next;
        }
    }


    public static void main(String[] args) {
        linkedList ll = new linkedList();

        // insert at END
//        ll.insertAtHead(100);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        //ll.display();
        //System.out.println("\nSize: "+ ll.size());

        ll.insertAtEnd(12);
        //ll.display();
        //System.out.println("\nSize: "+ ll.size());

        // insert at HEAD
        ll.insertAtHead(13);
        //ll.display();
        //System.out.println("\nSize: "+ ll.size());

        ll.insertAtPos(4, 10);
        ll.display();

        //System.out.println("\nAt: "+ll.getAt(2));

        System.out.println();
        ll.deleteAtPos(2);
        ll.display();

        System.out.println("\ntail: "+ll.tail.data);
    }
}
