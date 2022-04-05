package Stack;

public class StackOfArray {
    int[] arr;
    int topOfStack;

    public StackOfArray(int size) {
        this.arr = new int[size]; // size of Stack
        this.topOfStack = -1; // denoting that the stack is empty.
        System.out.println("The Stack is created with size of: " + size);
    }

    // isEmpty()
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull()
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("The Stack Is Full");
            return true;
        } else {
            return false;
        }
    }

    // push()
    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("value inserted Successfully");
        }
    }

    // pop()
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is Empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // peek()
    public int peek(){
        if (isEmpty()){
            System.out.println("The Stack is Empty");
            return -1;
        }
        else {
            return arr[topOfStack];
        }
    }

    // delete
    public void deleteStack(){
        arr = null;
        System.out.println("Stack is Successfully deleted");
    }



    public static void main(String[] args) {
        StackOfArray stackOfArray = new StackOfArray(4);
//        boolean result = stackOfArray.isEmpty();
//        System.out.println(result);

//        boolean result = stackOfArray.isFull();
//        System.out.println(result);
//
//        stackOfArray.push(21);
//        stackOfArray.push(20);
//        stackOfArray.push(10);

//        int result = stackOfArray.pop();
//        System.out.println(result);

//        int result = stackOfArray.peek();
//        System.out.println(result);

//        stackOfArray.deleteStack();


    }
}
