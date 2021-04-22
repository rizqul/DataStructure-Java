import saving.Node;

public class DoubleLinkedList {
    private Node head;
    private int size;

    public DoubleLinkedList (){
        head = null;
        size = 0;
    }
    
    // Add Method
    public void AddFirst (int data){
        if (head == null) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.previous = newNode;
            head = newNode; 
        }
        size++;
    }

    public void AddAt (int position, int data){
        if (position > size) {
            System.out.println("position not found");
            return;
        }

        if (position == 0) {
            AddFirst(data);
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, data, current.next);
            current.next = newNode;
            size++;
        }
    }


    public void AddLast(int data){
        if (head == null) {
            AddFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(current, data, null);
            size++;
        }
    }

    //Delete Method
    public void DeleteFirst(){
        if (head == null) {
            return;
        } else {
            Node current = head.next;
            current.previous = null;
            head = current;
        }
        size--;
    }

    public void DeleteAt(int position) {
        if (position > size) {
            System.out.println("position not found");
            return;
        }

        if (position == 0) {
            DeleteFirst();
        } else if (position == size){
            DeleteLast();
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            System.out.println(current.Data());
            current.next = current.next.next;
            size--;
        }
    }

    public void DeleteLast(){
        if (head == null) {
            return;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    //Tools Method
    public void printNode(){
        Node current = head;
        while (current != null) {
            System.out.print(current.Data() + " => ");
            current = current.next;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int Size(){
        return size;
    }

    public static void main(String[] args) {
        DoubleLinkedList newDL = new DoubleLinkedList();
        

        newDL.AddLast(3);
        newDL.AddLast(2);
        newDL.AddLast(12);
        newDL.AddFirst(112);
        newDL.DeleteFirst();
        newDL.DeleteLast();
        newDL.AddAt(0, 7);
        newDL.DeleteAt(3);
        
        newDL.printNode();
        System.out.println();
        System.out.println("Size : " + newDL.Size());

    }
}
