//1. Implementation of Queue using Array:

// public class QueuesInJava {
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear = -1;

//         Queue(int n){
//             arr = new int[n];
//             size = n;
//         }

//         //Is empty function
//         public boolean isEmpty(){
//             return rear == -1;
//         }

//         //Add Function (Enque)
//         //TC - O(1)
//         public void add(int data){
//             if(rear == size-1){
//                 System.out.println("Queue is Full!!");
//                 return;
//             }
//             rear = rear + 1;
//             arr[rear] = data;
//         }

//         //Remove Function (Dequeue)
//         //TC - O(n)
//         public int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty!");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i=0; i<rear; i++){
//                 arr[i] = arr[i+1];
//             }
//             rear--;
//             return front;
//         }

//         //Peek Function
//         //TC - O(1)
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty!");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//2. Implementation of Circular Queue using Array:
//Here, the time complexity for removing an element from the queue is O(1)
//In this, while implementing Array for circular queue, a IsFull function is added extra

// public class QueuesInJava {
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         //Is empty function
//         public boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }

//         //Is full function
//         public boolean isFull(){
//             return (rear + 1)%size == front;
//         }

//         //Add Function (Enque)
//         //TC - O(1)
//         public void add(int data){
//             if(isFull()){
//                 System.out.println("Queue is Full!!");
//                 return;
//             }
//             //adding 1st element
//             if(front == -1){
//                 front = 0;
//             }
//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         //Remove Function (Dequeue)
//         //TC - O(1)
//         public int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty!");
//                 return -1;
//             }
//             int result = arr[front];
//             //removing last element
//             if(rear == front){
//                 rear = front = -1;
//             }
//             else{
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         //Peek Function
//         //TC - O(1)
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty!");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(3);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//3. Implementation of Queue using Linked List

// public class QueuesInJava {
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue{
//         static Node head = null;
//         static Node tail = null;

//         //Is empty function
//         public boolean isEmpty(){
//             return head == null && tail == null;
//         }

//         //Add Function (Enque)
//         //TC - O(1)
//         public void add(int data){
//             Node newNode = new Node(data);
//             if(head == null){
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         //Remove Function (Dequeue)
//         //TC - O(1)
//         public int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty!");
//                 return -1;
//             }
//             int front = head.data;
//             if(tail == head){
//                 tail = head = null;
//             }else{
//                 head = head.next;
//             }
//             return front;
//         }

//         //Peek Function
//         //TC - O(1)
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty!");
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//4. Implementation of Queue using JCF Linked List
// Note: Queue in JCF is not a class, but its a Interface, and we can never make objects of the interfaces.
// Hence, we make object of the classes(here Linked List) which implements the Queue
// Note: For eg. The classes that can be used are Linked List and ArrayDeque
// In JCF, TC of all operations if O(1)

// import java.util.LinkedList;
// import java.util.Queue;
// public class QueuesInJava {
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//5. Implementation using 2 Stacks
// Here, we have to implement Queue(FIFO) using 2 Stacks(LIFO)

//5.a. First Approach:  
    //Push(add) - TC: O(n)
    //Pop(remove) - TC: O(1)
    //Peek(front) - TC: O(1)

// import java.util.*;
// public class QueuesInJava {
//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         //Is Empty Function
//         public boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         //Add Function: TC - O(n)
//         public void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }

//         //Remove Function: TC - O(1)
//         public int remove(){
//             if(s1.isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return s1.pop();
//         }

//         //Peek Function: TC - O(1)
//         public int peek(){
//             if(s1.isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return s1.peek();
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//5.b. Second Approach:  
    //Pop(remove) - TC: O(n)
    //Peek(front) - TC: O(n)
    //Push(add) - TC: O(1)

// import java.util.*;
// public class QueuesInJava {
//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         //Is Empty Function
//         public boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         //Add Function: TC - O(1)
//         public void add(int data){
//             s1.push(data);
//         }

//         //Remove Function: TC - O(n)
//         public int remove(){
//             if(s1.isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             int val = s2.pop();
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//             return val;
//         }

//         //Peek Function: TC - O(n)
//         public int peek(){
//             if(s1.isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             int val = s2.peek();
//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//             return val;
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//6. Implementation of Stack using 2 Queues
// Here, we have to implement Stack(LIFO) using 2 Queues(FIFO)

//6.a. First Approach:  
    //Push(add) - TC: O(n)
    //Pop(remove) - TC: O(1)
    //Peek(front) - TC: O(1)

//6.b. Second Approach:  
    //Pop(remove) - TC: O(n)
    //Peek(front) - TC: O(n)
    //Push(add) - TC: O(1)

// import java.util.*;
// import java.util.LinkedList;
// public class QueuesInJava {
//     static class Stack{
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         //Is Empty Function
//         public boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         //Add Function: TC - O(1)
//         public void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }
//             else{
//                 q2.add(data);
//             }
//         }

//         //Remove Function: TC - O(n)
//         public int pop(){
//             if(isEmpty()){
//                 System.out.println("Empty Stack");
//                 return -1;
//             }
//             int top = -1;

//             //case 1
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }
//             //case 2
//             else{
//                 while(!q2.isEmpty()){
//                     top = q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }

//         //Peek Function: TC - O(n)
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Stack");
//                 return -1;
//             }
//             int top = -1;

//             //case 1
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             }
//             //case 2
//             else{
//                 while(!q2.isEmpty()){
//                     top = q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



//7. First Non-repeating letter in a stream of characters
// TC - O(n)

// import java.util.LinkedList;
// import java.util.Queue;
// public class QueuesInJava{
//     public static void printNonRepeating(String str){
//         int freq[] = new int[26];
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a']++;

//             while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                 q.remove();
//             }

//             if(q.isEmpty()){
//                 System.out.print(-1 + " ");
//             }
//             else{
//                 System.out.print(q.peek() + " ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String str = "aabccxb";
//         printNonRepeating(str); 
//     }
// }



//8. Interleave 2 Halves of a Queue (even length)
// TC - O(n)
// SC - O(n), As extra queue is required

// import java.util.LinkedList;
// import java.util.Queue;
// public class QueuesInJava{
//     public static void interleaveTwoHalves(Queue<Integer> q1){
//         Queue<Integer> q2 = new LinkedList<>();
//         int size = q1.size();
//         for(int i=0; i<size/2; i++){
//             q2.add(q1.remove());
//         }
//         while(!q2.isEmpty()){
//             q1.add(q2.remove());
//             q1.add(q1.remove());
//         }
//     }
//     public static void main(String[] args) {
//         Queue<Integer> q1 = new LinkedList<>();
//         for(int i=1; i<11; i++){
//             q1.add(i);
//         }
//         interleaveTwoHalves(q1);
//         while(!q1.isEmpty()){
//             System.out.print(q1.remove() + " ");
//         }
//     }
// }



//9. Queue Reversal
// TC - O(n)
// SC - O(n), As extra stack is required

// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.*;
// public class QueuesInJava{
//     public static void reverseQueue(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();
//         while(!q.isEmpty()){
//             s.push(q.remove());
//         }
//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         for(int i=1; i<=5; i++){
//             q.add(i);
//         }
//         reverseQueue(q);
//         while(!q.isEmpty()){
//             System.out.print(q.remove() + " ");
//         }
//     }
// }



//10. Deque (Double ended queue)
// Implementation of Queue using JCF
// In Deque, all the operations(add, remove and get(peek)) can be performed from both sides of the queue(Front as well as Rear(Last))

// import java.util.*;
// import java.util.LinkedList;

// public class QueuesInJava{    
//     public static void main(String[] args) {
//         Deque<Integer> dq = new LinkedList<>();
//         dq.addFirst(1);
//         dq.addFirst(2);
//         dq.addLast(3);
//         dq.addLast(4);
//         System.out.println(dq);

//         dq.removeFirst();
//         System.out.println(dq);
//         dq.removeLast();
//         System.out.println(dq);

//         System.out.println("First Element = " + dq.getFirst());
//         System.out.println("First Element = " + dq.getLast());
//     }
// }



//11. Implementation of Stack using Deque
// i.e. Implementing all the stack operations(push, pop and peek)
// TC of all operations is O(1)
// Push -> addLast()
// Pop -> removeLast()
// Peek -> getLast()

// import java.util.*;
// import java.util.LinkedList;

// public class QueuesInJava{   
//     static class Stack{
//         Deque<Integer> dq = new LinkedList<>();

//         //Push Operation:   TC - O(1)
//         public void push(int data){
//             dq.addLast(data);
//         }

//         //Pop Operation:   TC - O(1)
//         public int pop(){
//             return dq.removeLast();
//         }

//         //Peek Operation:   TC - O(1)
//         public int peek(){
//             return dq.getLast();
//         }
//     } 
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         System.out.println("Peek = " + s.peek());
//         s.pop();
//         System.out.println("Peek = " + s.peek());
//     }
// }



//12. Implementation of Queue using Deque
// i.e. Implementing all the queue operations(add, remove and peek)
// TC of all operations is O(1)
// Add -> addLast()
// Remove -> removeFirst()
// Peek -> getFirst()

import java.util.*;
import java.util.LinkedList;

public class QueuesInJava{   
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        //Add Operation:   TC - O(1)
        public void add(int data){
            dq.addLast(data);
        }

        //Remove Operation:   TC - O(1)
        public int remove(){
            return dq.removeFirst();
        }

        //Peek Operation:   TC - O(1)
        public int peek(){
            return dq.getFirst();
        }
    } 
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek = " + q.peek());
        q.remove();
        System.out.println("Peek = " + q.peek());
    }
}