package Queue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int begginningOfQueue;

    // Constructor
    public QueueArray(int size){
        this.arr = new int[size];
        topOfQueue = -1;
        begginningOfQueue = -1;
        System.out.println("Thw Queue is created with the size of " + size);
    }

    // isEmpty()
    public boolean isEmpty(){
        if (begginningOfQueue == -1 || begginningOfQueue == arr.length){
            System.out.println("Stack is Empty");
            return true;
        }
        else {
            return false;
        }
    }

    // isFull()
    public boolean isFull(){
        if (topOfQueue == arr.length - 1){
            return true;
        }
        else {
            return false;
        }
    }

    // enQueue()
    public void enQueue(int value){
        if (isFull()){
            System.out.println("Queue is full");
        }else if (isEmpty()){
            begginningOfQueue = 0; // index 0
            topOfQueue++;          // index 0
            arr[topOfQueue] = value;
            System.out.println("Succesfully inserted " + value + " is the queue");
        }else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Succesfully inserted " + value + " is the queue");
        }
    }

    // deQueue()
    public int deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }
        else {
            int result = arr[begginningOfQueue];
            begginningOfQueue++;
            if (begginningOfQueue > topOfQueue){
                begginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }
    }

    // peek()
    public int peek(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        }
        else {
            return arr[begginningOfQueue];
        }
    }

    // deleteQueue()
    public void deleteQueue(){
        arr = null;
        System.out.println("Deleted Queue Successfully");
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(4);
        queueArray.enQueue(10);
        queueArray.enQueue(20);
        queueArray.enQueue(30);
        queueArray.enQueue(40);
//        queueArray.enQueue(10);

        int result = queueArray.peek();
        System.out.println(result);

        queueArray.deleteQueue();



//        queueArray.isEmpty();
//        queueArray.isFull();
    }
}
