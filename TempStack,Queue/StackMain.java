class Stack<T> {

    int length;
    Object[] data;
    int top = -1;

    Stack(int length){
        this.length = length;
        data = new Object[length];
    }

    T getObject(int i){
        T t = (T)data[i];
        return t;
    }

    public boolean isFull(){
        return top == length - 1;
    }

    public boolean isEmpty(){
        return length == -1;
    }

    public void push(Object newdata){
        if(isFull()) {
            System.out.println("Stack telah mencapai batas maksimum");
            return;
        }
        top++;
        this.data[top] = newdata;
    }

    public Object pop(){
        if (isEmpty()) {
            System.out.println("Stack sudah kosong");
        }
        Object tes = data[top];
        data[top] = null;
        top -= 1;

        return tes;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            for (int i = 0; i < top+1; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }


}
/**
 * StackMain
 */
public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stk1  = new Stack<Integer>(12);
        stk1.push(12);
        stk1.push(13);
        stk1.push(14);
        stk1.push(15);
        stk1.push(1);
        stk1.push(2);
        stk1.push(3);

        stk1.print();

        stk1.pop();
        stk1.pop();
        stk1.pop();
        stk1.pop();
        stk1.pop();

        stk1.print();

        Stack<String> stk2 = new Stack<String>(5);
        stk2.push("newdata1");
        stk2.push("newdata2");
        stk2.push("newdata3");

        stk2.print();


    }
}
