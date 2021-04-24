// package LinkedList;

public class LinkedList_PakSup {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }
    public void InsertHead(int d) {
        if (head != null) {
            Node newNode = new Node(d);
            newNode.next = head;
            head = newNode;
        } else {
            head = new Node(d);
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

    public void DeleteHead() {
        if (head == null) {
            return;
        }
        head = head.next;
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

    public int Maks() {
        Node temp = head;
        int maks = head.value;
        while (temp.next != null) {
            if (maks < temp.next.value) {
                maks = temp.next.value;
            }
            temp = temp.next;
        }
        return maks;
    }

    public int find(int v) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.value == v)
                return i;
            i++;
            temp = temp.next;
        }
        return -1;
    }

    public void PrintNode() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList slinkedlist = new LinkedList();
        slinkedlist.InsertHead(5);
        slinkedlist.InsertHead(4);
        slinkedlist.InsertHead(1);
        slinkedlist.InsertTail(50);
        slinkedlist.InsertHead(12);
        slinkedlist.PrintNode();
        slinkedlist.DeleteHead();
        slinkedlist.PrintNode();
        slinkedlist.DeleteLast();
        slinkedlist.PrintNode();
        System.out.println(slinkedlist.find(5));
        System.out.println(slinkedlist.Maks());

    }

}
