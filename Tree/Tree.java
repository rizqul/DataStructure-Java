import javax.lang.model.util.ElementScanner6;

class Node{
    Node left, right;
    int data;

    Node(int data){
        this.data = data;
    }

    public void insert(int value){
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains (int value){
        if (data == value) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else{
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else{
                return right.contains(value);
            }
        }
    }

    public void printInOrder(){
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
}

class Tree{
    public static void main(String[] args) {
        Node a = new Node(12);
        a.insert(5);
        a.insert(19);
        a.insert(39);
        a.insert(25);

        a.printInOrder();
    }
}