package problems;

public class ReverseLinkedList {
    static class LinkedList{
        int val;
        LinkedList next;

        LinkedList(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void display(LinkedList node){
        if(node == null) return;
        System.out.print(node.val+" ");
        display(node.next);
    }

    public static LinkedList reverse(LinkedList head){
        if(head.next == null) return head;
        LinkedList newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        LinkedList a = new LinkedList(10);
        LinkedList b = new LinkedList(20);
        LinkedList c = new LinkedList(30);
        LinkedList d = new LinkedList(40);
        LinkedList e = new LinkedList(50);
        LinkedList f = new LinkedList(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

//        display(a);

        LinkedList r = reverse(a);

        display(r);

    }
}
