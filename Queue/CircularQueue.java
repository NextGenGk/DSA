package Queue;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int begginningOfQueue;
    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        topOfQueue = -1;
        begginningOfQueue = -1;
        System.out.println("Queue is created with th size of " + size);
    }

    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        // topOfQueue = -1; -> (-1 + 1 == begginningOfQueue)
        if (topOfQueue + 1 == begginningOfQueue) {
            return true;
        } else if (begginningOfQueue == 0 && topOfQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        // insert in the begginning
        else if (isEmpty()) {
            begginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
        // unused cell,topOfQueue points to the last cell,and we have empty
        // cell in the beginning of the array , so this means we have to insert element at the beginning of the array.
        // topOfQueue = 0; first cell in this case
        else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            int result = arr[begginningOfQueue];
            arr[begginningOfQueue] = 0;
            if (begginningOfQueue == topOfQueue) { // only one element
                begginningOfQueue = -1;
                topOfQueue = -1;
            } else if (begginningOfQueue + 1 == size) {
                begginningOfQueue = 0;
            } else {
                begginningOfQueue++;
            }
            return result;
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else {
            return arr[begginningOfQueue];
        }
    }

    public void delete(){
        arr = null;
        System.out.println("Queue is Deleted Successfully");
    }


    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
//        boolean result = circularQueue.isEmpty();
//        System.out.println(result);

//        boolean result = circularQueue.isFull();
//        System.out.println(result);

//        circularQueue.enQueue(10);
//        circularQueue.enQueue(20);
//        circularQueue.enQueue(30);

//        int result = circularQueue.dequeue();
//        System.out.println(result);

//        int result = circularQueue.peek();
//        System.out.println(result);

//        circularQueue.delete();
    }
}
