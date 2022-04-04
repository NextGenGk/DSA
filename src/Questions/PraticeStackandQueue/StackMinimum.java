package Questions.PraticeStackandQueue;

public class StackMinimum {

    public static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static class stackMin {
        Node top;
        Node min;

        public stackMin() {
            top = null;
            min = null;
        }

        public int min() {
            return min.value;
        }

        public void push(int value) {
            if (min == null) {
                min = new Node(value, min);
            } else if (min.value < value) {
                min = new Node(min.value, min);
            } else {
                min = new Node(value, top);
            }
            top = new Node(value, top);
        }

        public int pop() {
            min = min.next;
            int result = top.value;
            top = top.next;
            return result;
        }
    }

    public static void main(String[] args) {
        stackMin stackMin = new stackMin();
        stackMin.push(4);
        stackMin.push(2);
        stackMin.push(1);
        System.out.println(stackMin.min());
        stackMin.pop();
        System.out.println(stackMin.min());
    }
}
