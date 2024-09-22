//1. Implementation of Stack using an ArrayList:
// push TC = O(1)
// pop TC = O(1)
// peek TC = O(1)

// import java.util.*;
// public class StackInJava
// {
//     static class Stack{
//         static ArrayList<Integer> list = new ArrayList<>();

//         //a. isEmpty() Operation:
//         public boolean isEmpty(){
//             return list.size() == 0;
//         }

//         //b. push() Operation:
//         public void push(int data){
//             list.add(data);
//         }

//         //c. pop() Operation:
//         public int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }

//         //d. peek() Operation:
//         public int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
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



//2. Implementation of Stack using an LinkedList:
// push TC = O(1)
// pop TC = O(1)
// peek TC = O(1)

// public class StackInJava
// {
//     static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Stack{
//         static Node head = null;

//         //a. isEmpty() Operation:
//         public boolean isEmpty(){
//             return head == null;
//         }

//         //b. push() Operation:
//         public void push(int data){
//             Node newNode = new Node(data);

//             if(isEmpty()){
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         //c. pop() Operation:
//         public int pop(){
//             if(isEmpty()){
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         //d. peek() Operation:
//         public int peek(){
//             if(isEmpty()){
//                 return -1;
//             }

//             return head.data;
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



//3. Implementation of Stack using Java Collections Framework:
// push TC = O(1)
// pop TC = O(1)
// peek TC = O(1)

// import java.util.*;
// public class StackInJava
// {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }



//4. Push at the Bottom of the Stack: (By using Recursion)
// TC = O(n)
// SC = O(1)

// import java.util.*;
// public class StackInJava
// {
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);

//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
// }



//5. Reverse a String using a Stack:
// TC = O()
// SC = O()

// import java.util.*;
// public class StackInJava
// {
//     public static String reverseString(String str){
//         Stack<Character> s = new Stack<>();
//         int index = 0;
        
//         while(index < str.length()){
//             s.push(str.charAt(index));
//             index++;
//         }

//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr = s.pop();
//             result.append(curr);
//         }

//         return result.toString();
//     }
//     public static void main(String[] args) {
//         String str = "Hello World";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }



//6. Reverse a Stack:   (By using Recursion)
// TC = O(n)
// SC = O(1)

// import java.util.*;
// public class StackInJava
// {
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);

//     }
//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         reverseStack(s);
//         printStack(s);
//     }
// }



//7. Stock Span Problem:
// TC = O(n)
// SC = O(1)

// import java.util.*;
// public class StackInJava
// {
//     public static void stockSpan(int stocks[], int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stocks.length; i++){
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && (currPrice > stocks[s.peek()])){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i] = i + 1;
//             }
//             else{
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String args[]){
//         int stocks[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks, span);

//         for(int i=0; i<span.length; i++){
//             System.out.println(span[i] + " ");
//         }
//     }
// }



//8. Next Greater Element:
// The next greater element of some element 'x' in an array is the first greater element that is to the 'right of x' in the same array
// TC = O(n)
// SC = O()
// Different questions asked on the same problem:
// a. next greater element right
// b. next greater element left
// c. next smaller element right
// d. next smaller element left

// import java.util.*;
// public class StackInJava
// {
//     public static void main(String args[]){
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>();
//         int nextGreater[] = new int[arr.length];

//         for(int i = arr.length-1; i>=0; i--){
//             //1.while loop
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
//                 s.pop();
//             }

//             //2. if-else
//             if(s.isEmpty()){
//                 nextGreater[i] = -1;
//             }
//             else{
//                 nextGreater[i] = arr[s.peek()];
//             }

//             //3. push in stack
//             s.push(i);
//         }

//         for(int i=0; i<nextGreater.length; i++){
//             System.out.print(nextGreater[i] + " ");
//         }
//         System.out.println();
//     }
// }



//9. Valid Parentheses:
// TC = O(n)
// SC = O()

// import java.util.*;
// public class StackInJava
// {
//     public static boolean isValid(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);

//             if(ch=='(' || ch=='{' || ch=='['){
//                 s.push(ch);
//             }
//             else{
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if((s.peek() == '(' && ch == ')') ||
//                    (s.peek() == '{' && ch == '}') ||
//                    (s.peek() == '[' && ch == ']')){
//                     s.pop();
//                 }
//                 else{
//                     return false;
//                 }
//             }
//         }

//         if(s.isEmpty()){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         String str = "({})[]";
//         System.out.println(isValid(str));
//     }
// }



//10. Duplicate Parenthese:
// TC = O(n)
// SC = O()

// import java.util.*;
// public class StackInJava
// {
//     public static boolean isDuplicate(String str){
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             //closing brac, 
//             if(ch == ')'){
//                 int count = 0;
//                 while(s.peek() != '('){
//                     s.pop();
//                     count++;
//                 }
//                 if(count < 1){
//                     return true;    //duplicate is present
//                 }
//                 else{
//                     s.pop();    //opening pair
//                 }
//             }
//             //opening brac, operator, or operand
//             else{
//                 s.push(ch);
//             }
//         }
//         return false;   //duplicate is not present
//     }
//     public static void main(String args[]){
//         String str1 = "((a+b))";
//         String str2 = "(a-b)";
//         System.out.println(isDuplicate(str1));
//         System.out.println(isDuplicate(str2));
//     }
// }



//11. Max Area in Histogram:
// TC = O(n)
// SC = O()

import java.util.*;
public class StackInJava
{
    public static void maxArea(int height[]){
        int maxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];

        //Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for(int i=height.length-1; i>=0; i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                nsr[i] = height.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //Next Smaller Left
        s = new Stack<>();
        for(int i=0; i<height.length; i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current Area: width = j-i-1 = nsr[i]-nsl[i]-1
        for(int i=0; i<height.length; i++){
            int width = nsr[i] - nsl[i] - 1;
            int currArea = width * height[i];
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Max Area in Histogram = " + maxArea);
    }

    public static void main(String args[]){
        int height[] = {2, 1, 5, 6, 2, 3};
        maxArea(height);
    }
}