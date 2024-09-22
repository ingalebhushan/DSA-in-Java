import java.util.ArrayList;

//1. Creation and Operations of ArrayList:
// public class ArrayLists
// {
//     public static void main(String[] args) {
//         //1. Creating an ArrayList object:
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> str = new ArrayList<>();


//         //2. Operations on ArrayList:
        
//         //2.a. Add Element in ArrayList:    TC = O(1)
//         list.add(10);
//         list.add(20);
//         list.add(50);
//         list.add(30);
//         list.add(40);
//         //Another way to add element
//         list.add(1, 15);    // TC = O(n)
//         str.add("Bhus");
//         System.out.println(list);

//         //2.b. Get Element of an ArrayList:  TC = O(1)
//         System.out.println(list.get(0));
//         System.out.println(list.get(1));
//         System.out.println(str.get(0));

//         //2.c. Remove Element from ArrayList:  TC = O(n)
//         list.remove(2);
//         System.out.println(list);

//         //2.d. Set Element at specified index:  TC = O(n)
//         list.set(0, 100);
//         System.out.println(list.get(0));
//         System.out.println(list);

//         //2.e. Contains Element - Check whether an element is present in the ArrayList or not:  TC = O(n)
//         // gives "true" - if element is present
//         // returns "false" - if element is not present
//         System.out.println(list.contains(10));
//         System.out.println(list.contains(40));


//         //3. Size of ArrayList: .size() method gives its length
//         ArrayList<Character> chars = new ArrayList<>();
//         chars.add('A');
//         chars.add('B');
//         chars.add('C');
//         chars.add('D');
//         chars.add('E');
//         chars.add('F');
//         System.out.println(chars.size());
        
//         //Iteration
//         for(int i=0; i<chars.size(); i++){
//             System.out.print(chars.get(i) + " ");
//         }
//         System.out.println();
//     }
// }


//2. Print Reverse of an ArrayList:
// public class ArrayLists
// {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>(5);
//         for(int i=0; i<5; i++){
//             list.add(i+1);
//         }
//         //Reverse
//         for(int i=list.size()-1; i>=0; i--){
//             System.out.print(list.get(i) + " ");
//         }
//         System.out.println();
//     }
// }


//3. Find Maximum in an ArrayList:
// Time Complexity = O(n)
// public class ArrayLists
// {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(6);
//         list.add(8);
//         //Max
//         int max = Integer.MIN_VALUE;
//         int index = -1;
//         for(int i=0; i<list.size(); i++){
//             if(list.get(i) > max){
//                 max = list.get(i);
//                 index = i;
//             }
//             //On place of 'if', we can use..
//             // max = Math.max(max, list.get(i));
//         }
//         System.out.println("Largest Element = " + max + " is present at index = " + index);
//     }
// }


//4. Swap 2 Numbers:
// Time Complexity = O()
// import java.util.*;
// public class ArrayLists
// {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         //Index Inputs
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter indexes: ");
//         int index1 = scan.nextInt();
//         int index2 = scan.nextInt();
//         //Swap
//         int temp = list.get(index1);
//         list.set(index1, list.get(index2));
//         list.set(index2, temp);
//         //Print new ArrayList
//         System.out.println(list);
//         scan.close();
//     }
// }


//5. Sorting an ArrayList:
// Time Complexity = O(nlogn)   TC of Collections.sort()
// Space Complexity = O(1)      SC of Collections.sort()
// import java.util.Collections;
// public class ArrayLists
// {
//     public static void main(String[] args) {
//         ArrayList<Integer> num = new ArrayList<>();
//         num.add(2);
//         num.add(5);
//         num.add(9);
//         num.add(3);
//         num.add(6);
        
//         //To Sort in Ascending order
//         Collections.sort(num);
//         System.out.println(num);

//         //To sort in Descending order
//         Collections.sort(num, Collections.reverseOrder());
//         System.out.println(num);
//     }
// }


//6. Multi-dimensional ArrayList:
// Time Complexity = O()
// Space Complexity = O()
// public class ArrayLists
// {
//     public static void main(String[] args) {
//         //1.
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         list1.add(1);    list1.add(2);
//         mainList.add(list1);
        
//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(3);   list2.add(4);
//         mainList.add(list2);
//         System.out.println(mainList);

//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
        

//         //2.
//         ArrayList<ArrayList<Character>> charList = new ArrayList<>();
//         ArrayList<Character> ch = new ArrayList<>();
//         ch.add('A');    ch.add('B');
//         charList.add(ch);
//         System.out.println(charList);


//         //3.
//         ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
//         ArrayList<Integer> listA = new ArrayList<>();
//         ArrayList<Integer> listB = new ArrayList<>();
//         ArrayList<Integer> listC = new ArrayList<>();

//         for(int i=1; i<=5; i++){
//             listA.add(i*1);
//             listB.add(i*2);
//             listC.add(i*3);
//         }
//         mainList2.add(listA);
//         mainList2.add(listB);
//         mainList2.add(listC);
//         listB.remove(3);
//         listB.remove(2);
//         System.out.println(mainList2);

//         //nested loops
//         for(int i=0; i<mainList2.size(); i++){
//             ArrayList<Integer> currList2 = mainList2.get(i);
//             for(int j=0; j<currList2.size(); j++){
//                 System.out.print(currList2.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//7.a. Container with Most Water:   //Brute Force
//Time Complexity = O(n^2)
// For given 'n' lines on 'x-axis', use 2 lines to form a container such that it holds maximum water.
// public class ArrayLists
// {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;

//         for(int i=0; i<height.size(); i++){
//             for(int j=i+1; j<height.size(); j++){
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j - i;
//                 int currWater = ht * width;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         // 1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));
//     }
// }


//7.b. Container with Most Water:   //2 Pointer Approach
//Time Complexity = O(n)
// public class ArrayLists
// {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;
//         int leftPointer = 0;
//         int rightPointer = height.size()-1;

//         while(leftPointer < rightPointer){
//             //Calculate water area
//             int ht = Math.min(height.get(leftPointer), height.get(rightPointer));
//             int width = rightPointer - leftPointer;
//             int currWater = ht * width;
//             maxWater = Math.max(maxWater, currWater);

//             //Update Pointer
//             if(height.get(leftPointer) < height.get(rightPointer)){
//                 leftPointer++;
//             }
//             else{
//                 rightPointer--;
//             }
//         }

//         return maxWater;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         // 1, 8, 6, 2, 5, 4, 8, 3, 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));
//     }
// }


//8.a. Pair Sum - 1:  //Brute force Approach
// Find if any pair in a Sorted ArrayList has a target sum.
//Time Complexity = O(n^2)
// public class ArrayLists
// {
//     public static boolean pairSum1(ArrayList<Integer> list, int target){
//         for(int i=0; i<list.size(); i++){
//             for(int j=i+1; j<list.size(); j++){
//                 if(list.get(i) + list.get(j) == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//         System.out.println(pairSum1(list, target));
//     }
// }


//8.b. Pair Sum - 1:  //2 Pointer Approach
// Find if any pair in a Sorted ArrayList has a target sum.
//Time Complexity = O(n)
// public class ArrayLists
// {
//     public static boolean pairSum1(ArrayList<Integer> list, int target){
//         int leftPointer = 0;
//         int rightPointer = list.size()-1;

//         while(leftPointer != rightPointer){
//             //case1
//             if(list.get(leftPointer) + list.get(rightPointer) == target){
//                 return true;
//             }

//             //case2
//             if(list.get(leftPointer) + list.get(rightPointer) < target){
//                 leftPointer++;
//             }
//             else{   //Case3
//                 rightPointer--;
//             }
//         }

//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target = 5;
//         System.out.println(pairSum1(list, target));
//     }
// }


//9.b. Pair Sum - 2:  //2 Pointer Approach
// Find if any pair in a Sorted Rotated ArrayList has a target sum.
// Step-1 -> Find out the pivot point(Breaking point of Sorted array)
// Step-2 -> Use the while loop
//Time Complexity = O(n)
public class ArrayLists
{
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n = list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){    //breaking point
                bp = i;
                break;
            }
        }

        int lp = bp+1;  //Smallest element
        int rp = bp;    //Largest element

        while(lp != rp){
            //Case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //Case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }
            else{
                //Case 3
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - Sorted & Rotated ArrayList
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        System.out.println(pairSum2(list, target));
    }
} 