
/**
 * LinkedList
 */
public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    // INSERT METHOD
    public void InsertHead(int d) {
        if (head != null) {
            Node newNode = new Node(d);
            newNode.next = head;
            head = newNode;
        } else {
            head = new Node(d);
        }
    }

    public void InsertMiddle(int d, int position) {
        if (position == 0) {
            InsertHead(d);
        } else {
            Node temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(d);
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    
    public void InsertTail(int d) {

        if (head != null) {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newNode = new Node(d);
            temp.next = newNode;
        } else {
            InsertHead(d);
        }
    }

    // DELETE METHOD
    public void DeleteHead() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    public void DeleteMidle(int position) {
        if (position == 0) {
            DeleteHead();
        } else {
            Node temp = head;

            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp =  null;
        }
    }

    public void DeleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    public void PrintNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        LinkedList int_llist = new LinkedList();

        int_llist.InsertHead(5);
        int_llist.InsertHead(0);
        int_llist.InsertHead(1);
        int_llist.InsertHead(8);
        int_llist.InsertHead(6);
        int_llist.InsertHead(2);

        int_llist.PrintNode();

        int_llist.InsertMiddle(13, 2);

        int_llist.PrintNode();

        int_llist.DeleteMidle(2);

        int_llist.PrintNode();

    }
}