import java.util.LinkedList;

public class JCFLinkedList {
    public static void main(String[] args) {
        //1. Create an Linked List
        LinkedList<Integer> ll = new LinkedList<>();

        //2. Add in LL
        ll.addLast(1);
        ll.addFirst(0);
        ll.addLast(2);

        //3. Print
        System.out.println(ll);

        //4. Remove from LL
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}