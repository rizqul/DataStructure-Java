class Queue<T> {
    int size, rear, front;
    Object[] data;

    Queue(int size){
        this.size = size;
        data = new Object[size];
        rear = -1;
        front = -1;
    }

    T getObject(int i){
        T t = (T)data[i];
        return t;
    }

    public boolean isEmpty(){
        if (rear==-1 && front==-1) {
            return true;
        } 
            return false;
    }

    public boolean isFull(){
        if (rear == (size-1) && front == 0) {
            return true;
        }
        return false;
    }

    public void enQueue(int value){
        if (isFull()) {
            System.out.println("Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            data[rear] = value;
        }
    }

    public Object deQueue(){
        Object element;
        if (isEmpty()) {
            System.out.println("Already Empty");
            return -1;
        } else {
            element = data[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            return (element);
        }
    }




}
