// 1.Detect a Loop/Cycle in a LL:

// public class LinkedList2 {
    
//     public static class Node{
//         int data;
//         Node next;
        
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public static boolean isCycle(){
//         Node slow = head;
//         Node fast = head;

//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head;
//         System.out.println(isCycle());
//     }
// }



// 2.Remove a Loop/Cycle in a LL:

// public class LinkedList2 {
    
//     public static class Node{
//         int data;
//         Node next;
        
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public static boolean isCycle(){
//         Node slow = head;
//         Node fast = head;

//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void removeCycle(){
//         //detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false; //It stores if cycle is present or not
//         while(fast!=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(slow == fast){
//                 cycle = true;
//                 break;
//             }
//         }
//         if(cycle == false){
//             return;
//         }

//         //find their meeting point
//         slow = head;
//         Node prev = null;
//         while(slow != fast){
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         //remove cycle -> last.next = null
//         prev.next = null;
//     }

//     public static void main(String[] args) {
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;
//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
//     }
// }



//3. Zig-Zag Linked List:

public class LinkedList2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void zigzag(){
        //middle node
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        
        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftHead = head;
        Node rightHead = prev;
        Node nextL, nextR;

        //alternate merging (zig-zag merge)
        while(leftHead!=null && rightHead!=null){
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
    }
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        zigzag();
        ll.print();
    }
}