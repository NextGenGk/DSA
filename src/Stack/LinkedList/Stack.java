package Stack.LinkedList;


import LinkedList.SingleLinkedList;

public class Stack {
    SingleLinkedList.SinglyLinkedList linkedList = new SingleLinkedList.SinglyLinkedList();


    // push
    public void push(int value){
        linkedList.insertInLinkedList(value,0);
        System.out.println("Inserted " + value + " in Stack");
    }

    // isEmpty()
    public boolean isEmpty(){
        if (linkedList.head == null){
            return true;
        }
        else {
            return false;
        }
    }

    // pop
    public int pop(){
        int result = -1;  // stack is empty
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            result = linkedList.head.value;
            linkedList.deleteNode(0);
        }
        return result;
    }

    // peek
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else {
            return linkedList.head.value;
        }
    }

    // delete
    public void deleteStack(){
        linkedList.head = null;
        System.out.println("The Stack is deleted successfully");
    }
}
