package BasicsOfList;

public class basics {
    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }

    // display through function
    public static void display(Node head){
        //Node temp = head;
        System.out.print("Print: ");
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    // display Reverse through function
    public static void displayReverse(Node head){
        //Node temp = head;
        System.out.print("Print: ");
        while (head != null){
            head = head.next;
            System.out.print(head.data+" ");
        }
    }

    // display reverse using recursion
    public static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.data+" ");
        displayRec(head.next);
    }

    // count length using Function
    public static int funLength(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

    // count length using Recursion
    public static int RecLength(Node head) {
        if(head == null) return 0;
        return 1 + RecLength(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(23);
        Node b = new Node(17);
        Node c = new Node(25);
        Node d = new Node(90);
        // a b c d

        System.out.println(a); // $Node@6acbcfc0
        System.out.println(a.data); // 23
        System.out.println(b); // $Node@5f184fc6
        a.next = b; // a -> b
        System.out.println(a.next); // $Node@5f184fc6 means b
        System.out.println(b); // $Node@5f184fc6

        System.out.println(b.data); // 17
        System.out.println(a.next.data);// 17

        b.next = c; // a -> b --> c
        c.next = d; // a -> b --> c --> d


        // display elements

//        Node temp = a;
//        System.out.print("Print: ");
//        for (int i = 0; i < 4; i++) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

//        temp = a;
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

        // display through function
        display(a);
        System.out.println(a.data);

        // display through recursion
        displayRec(a);

        // display reverse using recursion
        displayRec(a);

        // count length using Function
        System.out.println("\nlength using Function: "+funLength(a));

        // count length using Recursion
        System.out.println("length using Recursion: "+RecLength(a));



    }

    //
}
