package Questions.PracticeLinkedList;

import java.util.HashSet;

public class Questions {

    // Program od Delete Duplicates
    // Program 1
    void deleteDups(LinkedList ll) {
        HashSet<Integer> hs = new HashSet();
        Node current = ll.head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    // Program of Return Nth to Last
    // Program 2
    public Node nthToLast(LinkedList ll, int n){
        Node p1 = ll.head;
        Node p2 = ll.head;
        // moving till the last node
        for (int i=0; i<n; i++){
            if (p2 == null) {
                return null;   // means, out of bounds
            }
            p2 = p2.next; // our pointer locate the nth node
        }
        while (p2 != null){  // p2 not = last
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    // Program of Sum Lists
    // Program 4
    public LinkedList sumLists(LinkedList llA, LinkedList llB){
        Node n1 = llA.head; // head of 1st LinkedList
        Node n2 = llB.head; // head of 2nd LinkedList
        // TODO: know when to stop!
        // ex: if you have reached the end of l1, then apply carry to l2, if needed, and return
        // ex: if you have reached the end of l2, then apply carry to l1, if needed, and return
        int carry = 0;

        LinkedList resultLL = new LinkedList();
        while (n1 != null || n2 != null){
            int result = carry;
            if (n1 != null){
                result = result + n1.value;
                n1 = n1.next;
            }
            if (n2 != null){
                result = result + n2.value;
                n2 = n2.next;
            }
            resultLL.insertNode(result%10);
            carry = result/10;
        }
        return resultLL;
    }


    // Main Class
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertNode(100);
        ll.insertNode(200);
        ll.insertNode(300);
        ll.insertNode(100);
        ll.traversalLL();
        Questions que = new Questions();
//        que.deleteDups(ll);
//        ll.traversalLL();
        Node n = que.nthToLast(ll,2);
        System.out.println(n.value);

        // Program of Sumlists
//        LinkedList llA = new LinkedList();
//        llA.insertNode(7);
//        llA.insertNode(1);
//        llA.insertNode(6);
//        LinkedList llB = new LinkedList();
//        llB.insertNode(5);
//        llB.insertNode(9);
//        llB.insertNode(2);
//        Questions que = new Questions();
//        LinkedList result = que.sumLists(llA,llB);
//        result.traversalLL();

    }
}
