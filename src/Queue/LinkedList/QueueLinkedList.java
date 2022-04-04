package Queue.LinkedList;

public class QueueLinkedList {
    SingleLinkedList.SinglyLinkedList list;

    // constructor
    public QueueLinkedList() {
        list = new SingleLinkedList.SinglyLinkedList();
        System.out.println("The Queue is Successfully created");
    }

    // isEmpty()
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue()
    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue");
    }

    // deQueue()
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            value = list.head.value;
            list.deleteNode(0);
        }
        return value;
    }

    // peek()
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // delete()
    public void delete() {
        list.head = null;
        list.tail = null;
        System.out.println("Queue is deleted Successfully");
    }




    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enQueue(10);
        queueLinkedList.enQueue(20);
        queueLinkedList.enQueue(30);

//        int result = queueLinkedList.deQueue();
//        System.out.println(result);

//        boolean result1 = queueLinkedList.isEmpty();
//        System.out.println(result1);

//        int result1 = queueLinkedList.peek();
//        System.out.println(result1);

//        queueLinkedList.delete();

    }
}