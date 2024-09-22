//1. Creating an Linked List:
//2. Add Nodes in the LinkedList: (Both at first and last)
//3. Print a Linked List:
// public class LinkedList
// {
//     //1.
//     //Node Class:
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     //Head and Tail:
//     public static Node head;
//     public static Node tail;


//     //2.
//     //Methods:
//     //a. Add First - TC = O(1) Constant
//     public void addFirst(int data){ 
//         //step1 - create new node
//         Node newNode = new Node(data);

//         //for empty linkedlist
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }

//         //step2 - newNode next = head
//         newNode.next = head;    //link

//         //step3 - head = newNode
//         head = newNode;
//     }

//     //b. Add Last - TC = O(1)
//     public void addLast(int data){
//         //step1 - create new node
//         Node newNode1 = new Node(data);

//         //for empty linkedlist
//         if(head == null){
//             head = tail = newNode1;
//             return;
//         }

//         //step2 - tail next = new Node
//         tail.next = newNode1;    //link

//         //step3 - tail = new Node
//         tail = newNode1;
//     }


//     //3. Print - TC = O(n)
//     public void print(){
//         if(head == null){
//             System.out.println("Linked List is empty!");
//             return;
//         }
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }


//     //4. Add in the middle(at provided index):  TC = O(n)
//     public void add(int index, int data){
//         //if you want to add element at the head
//         if(index == 0){
//             addFirst(data);
//             return;
//         }

//         Node newNode2 = new Node(data);
//         Node temp = head;
//         int i = 0;

//         while(i < index-1){
//             temp = temp.next;
//             i++;
//         }
//         //i = index - 1 (temp->prev)
//         newNode2.next = temp.next;
//         temp.next = newNode2;
//     }
//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addLast(3);
//         ll.print();
//         ll.addLast(4);
//         ll.print();
//         ll.add(1, 5);
//         ll.add(2, 6);
//         ll.print();
//     }
// }



//4. Size of a Linked List:
// public class LinkedList
// {
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

//     public void addFirst(int data){
//         Node newNode1 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode1;
//             return;
//         }
//         newNode1.next = head;
//         head = newNode1;
//     }

//     public void addLast(int data){
//         Node newNode2 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode2;
//             return;
//         }
//         tail.next = newNode2;
//         tail = newNode2;
//     }
//     public void add(int index, int data){
//         if(index == 0){
//             addFirst(data);
//             return;
//         }
//         Node newNode3 = new Node(data);
//         size++;
//         Node temp = head;
//         int i =0;

//         while(i < index-1){
//             temp = temp.next;
//             i++;
//         }
//         newNode3.next = temp.next;
//         temp.next = newNode3;
//     }
//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addLast(3);
//         ll.print();
//         ll.addLast(4);
//         ll.print();
//         ll.add(1, 5);
//         ll.add(2, 6);
//         ll.print();
//         System.out.println("Size of Linked List = " + size);
//     }
// }



//5. Remove in a Linked List: (Both at first and last)
// public class LinkedList
// {
//     public static class Node{
//         char data;
//         Node next;

//         public Node(char data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(char data){
//         Node newNode1 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode1;
//             return;
//         }
//         newNode1.next = head;
//         head = newNode1;
//     }

//     public void addLast(char data){
//         Node newNode2 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode2;
//             return;
//         }
//         tail.next = newNode2;
//         tail = newNode2;
//     }

//     //a. Remove First - TC = O(1)
//     public int removeFirst(){
//         if(size == 0){
//             System.out.println("LinkedList is empty!");
//             return Integer.MIN_VALUE;
//         }
//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     //b. Remove Last - TC = O(1)
//     public int removeLast(){
//         if(size == 0){
//             System.out.println("LinkedList is empty!");
//             return Integer.MIN_VALUE;
//         }
//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         //prev : i = size-2
//         Node prev = head;
//         for(int i=0; i<size-2; i++){
//             prev = prev.next;
//         }
//         int val = prev.next.data;   //tail.data
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }

//     public void add(int index, char data){
//         if(index == 0){
//             addFirst(data);
//             return;
//         }
//         Node newNode3 = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while(i < index-1){
//             temp = temp.next;
//             i++;
//         }
//         newNode3.next = temp.next;
//         temp.next = newNode3;
//     }
//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.addFirst('B');
//         ll.addFirst('A');
//         ll.addLast('E');
//         ll.addLast('F');
//         ll.add(2, 'C');
//         ll.add(3, 'D');
//         ll.print();
//         System.out.println(size);
//         ll.removeFirst();
//         ll.print();
//         System.out.println(size);
//         ll.removeLast();
//         ll.print();
//         System.out.println(size);
//     }
// }



//6. Search in Linked List: (Iterative Search)
// Search for a 'Key' in a linked list. Return the position where it is found. If not found, return '-1'.
// public class LinkedList
// {
//     public static class Node{
//         char data;
//         Node next;

//         public Node(char data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(char data){
//         Node newNode1 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode1;
//             return;
//         }
//         newNode1.next = head;
//         head = newNode1;
//     }

//     public void addLast(char data){
//         Node newNode2 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode2;
//             return;
//         }
//         tail.next = newNode2;
//         tail = newNode2;
//     }

//     public void add(int index, char data){
//         if(index == 0){
//             addFirst(data);
//             return;
//         }
//         Node newNode3 = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while(i < index-1){
//             temp = temp.next;
//             i++;
//         }
//         newNode3.next = temp.next;
//         temp.next = newNode3;
//     }

//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     public int findKey(char key){   // TC = O(n)
//         Node temp = head;
//         int i=0;
//         while(temp != null){
//             if(temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.addFirst('B');
//         ll.addFirst('A');
//         ll.addLast('E');
//         ll.addLast('F');
//         ll.add(2, 'C');
//         ll.add(3, 'D');
//         ll.print();
//         char key = 'C';
//         System.out.println(size);
//         System.out.println(ll.findKey(key));
//     }
// }



//7. Search in Linked List: (Recursive Search)
// Search for a 'Key' in a linked list. Return the position where it is found. If not found, return '-1'. Use 'Recursion'.
// TC = SC = O(n)
// public class LinkedList
// {
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

//     public void addFirst(int data){
//         Node newNode1 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode1;
//             return;
//         }
//         newNode1.next = head;
//         head = newNode1;
//     }

//     public void addLast(int data){
//         Node newNode2 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode2;
//             return;
//         }
//         tail.next = newNode2;
//         tail = newNode2;
//     }

//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
    
//     public int helper(Node head, int key){  // TC = SC = O(n)
//         if(head == null){
//             return -1;  //Key doesn't exist
//         }

//         if(head.data == key){
//             return 0;   //key present at head
//         }

//         int index = helper(head.next, key);
//         if(index == -1){
//             return -1;
//         }
//         return index+1;
//     }

//     public int recursiveSearch(int key){
//         return helper(head, key);
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.addLast(6);
//         ll.print();
//         System.out.println(size);
//         int key = 4;
//         System.out.println(ll.recursiveSearch(key));
//     }
// }



//8. Reverse a Linked List: (Iterative Approach)
// TC = O(n)
// public class LinkedList
// {
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

//     public void addFirst(int data){
//         Node newNode1 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode1;
//             return;
//         }
//         newNode1.next = head;
//         head = newNode1;
//     }

//     public void addLast(int data){
//         Node newNode2 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode2;
//             return;
//         }
//         tail.next = newNode2;
//         tail = newNode2;
//     }

//     public void add(int index, int data){
//         if(index == 0){
//             addFirst(data);
//             return;
//         }
//         Node newNode3 = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while(i < index-1){
//             temp = temp.next;
//             i++;
//         }
//         newNode3.next = temp.next;
//         temp.next = newNode3;
//     }

//     public void reverse(){
//         Node prev = null;   //node before head
//         Node curr = tail = head;   //head node
//         //Tail is also head in case of reversing
//         Node next;

//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }

//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.add(0, 20);
//         ll.addFirst(10);
//         ll.addLast(30);
//         ll.addLast(40);
//         ll.addLast(50);
//         ll.print();
//         System.out.println(size);
//         ll.reverse();
//         ll.print();
//     }
// }



//9. Find & Remove nth node from end:   (Iterative Approach)
// TC = O(n)
// public class LinkedList
// {
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

//     public void addFirst(int data){
//         Node newNode1 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode1;
//             return;
//         }
//         newNode1.next = head;
//         head = newNode1;
//     }

//     public void addLast(int data){
//         Node newNode2 = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode2;
//             return;
//         }
//         tail.next = newNode2;
//         tail = newNode2;
//     }

//     public void add(int index, int data){
//         if(index == 0){
//             addFirst(data);
//             return;
//         }
//         Node newNode3 = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while(i < index-1){
//             temp = temp.next;
//             i++;
//         }
//         newNode3.next = temp.next;
//         temp.next = newNode3;
//     }

//     //To delete nth Node from end
//     public void deleteNthfromEnd(int n){
//         //Calculate size of LinkedList
//         int sz = 0;
//         Node temp = head;
//         while(temp != null){
//             temp = temp.next;
//             sz++;
//         }

//         if(n == sz){
//             head = head.next;   //Remove First
//             size--;
//             return;
//         }

//         //sz-n
//         int i = 1;
//         int indexToFind = sz-n;
//         Node prev = head;
//         while(i < indexToFind){
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//         size--;
//         return;
//     }

//     public void print(){
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList();
//         ll.add(0, 20);
//         ll.addFirst(10);
//         ll.addLast(30);
//         ll.addLast(40);
//         ll.addLast(50);
//         ll.print();
//         System.out.println(size);
//         ll.deleteNthfromEnd(3);
//         ll.print();
//         System.out.println(size);
//     }
// }



//10. Check if LinkedList is a Palindrome:
// TC = O(n)
// SC = O(1)
public class LinkedList
{
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

    public void addFirst(int data){
        Node newNode1 = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode1;
            return;
        }
        newNode1.next = head;
        head = newNode1;
    }

    public void addLast(int data){
        Node newNode2 = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode2;
            return;
        }
        tail.next = newNode2;
        tail = newNode2;
    }

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode3 = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode3.next = temp.next;
        temp.next = newNode3;
    }

    //Slow-Fast Approach (Turtle-Hare Approach)
    public Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;   //+1
            fast = fast.next.next;  //+2
        }
        return slow;    //slow is our middle node
    }

    public boolean chechPalindrome(){
        //base case
        if(head==null || head.next==null){
            return true;
        }

        //step1 - find mid
        Node midNode = findMiddle(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  //right half head
        Node left = head;   //left half head

        //step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.chechPalindrome());
    }
}