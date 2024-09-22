//1. Print numbers from n to 1 (descending order):
// public class RecursionBasics
// {
//     public static void printDec(int n){
//         if(n == 1){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
// }


//2. Print numbers from 1 to n (ascending order):
// public class RecursionBasics
// {
//     public static void printAsc(int n){
//         if(n == 1){
//             System.out.print(n + " ");
//             return;
//         }
//         printAsc(n - 1);
//         System.out.print(n + " ");
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printAsc(n);
//     }
// }


//3. Print factorial of a number:
// Time Complexity & Space Complexity = O(n)
// public class RecursionBasics
// {
//     public static int factorial(int num){
//         if(num == 0){
//             return 1;
//         }
//         int fact = num * factorial(num - 1);
//         return fact;
//     }
//     public static void main(String[] args) {
//         int num = 5;
//         System.out.println("Factorial = " + factorial(num));
//     }
// }


//4. Print sum of n natural numbers:
// Time Complexity & Space Complexity = O(n)
// public class RecursionBasics
// {
//     public static int printSum(int num){
//         if(num == 1){
//             return 1;
//         }
//         int sum = num + printSum(num - 1);
//         return sum;
//     }
//     public static void main(String[] args) {
//         int num = 10;
//         System.out.println("Sum = " + printSum(num));
//     }
// }


//5. Print nth fibonacci number:
// Time Complexity = O(2^n) Exponential TC
// Space Complexity = O(n)
// public class RecursionBasics
// {
//     public static int fibo(int num){
//         if(num==0 || num==1){
//             return num;
//         }
//         int n = fibo(num - 1) + fibo(num - 2);
//         return n;
//     }
//     public static void main(String[] args) {
//         int num = 10;
//         System.out.println(fibo(num));
//     }
// }


//6. Check if a given array is sorted or not: (return true/false)
// Time Complexity & Space Complexity = O(n)
// public class RecursionBasics
// {
//     public static boolean checkSorted(int[] arr, int i){
//         if(i == arr.length-1){
//             return true;
//         }
//         if(arr[i] > arr[i+1]){
//             return false;
//         }
//         return checkSorted(arr, i+1);
//     }
//     public static void main(String[] args) {
//         // int[] arr = {0, 11, 2, 25, 4, 3, 1, 60};
//         int[] arr = {0, 1, 2, 3, 5};
//         System.out.println(checkSorted(arr, 0));
//     }
// }


//7. WAF to find the first occurence of an element in an array:
// Time & Space Complexity = O(n)
// public class RecursionBasics
// {
//     public static int findIndexFirstOccur(int[] arr, int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         if(key == arr[i]){
//             return i;
//         }
//         return findIndexFirstOccur(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 8, 5, 7, 3, 5, 9, 0, 8};
//         int key = 9;
//         System.out.println(findIndexFirstOccur(arr, key, 0));
//     }
// }


//8. WAF to find the last occurence of an element in an array:
// Time & Space Complexity = O(n)
// By Using my own method..
// public class RecursionBasics
// {
//     public static int findIndexLastOccur(int[] arr, int key, int i){
//         if(i < 0){
//             return -1;
//         }
//         if(key == arr[i]){
//             return i;
//         }
//         return findIndexLastOccur(arr, key, i-1);
//     }
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 30, 30, 30, 40, 50, 60, 70, 80, 40};
//         int key = 30;
//         System.out.println(findIndexLastOccur(arr, key, arr.length-1));
//     }
// }

// By using Apna College Method..
// public class RecursionBasics
// {
//     public static int findIndexLastOccur(int[] arr, int key, int i){
//         if(i == arr.length){
//             return -1;
//         }
//         int isFound = findIndexLastOccur(arr, key, i+1);
//         if(isFound == -1 && arr[i] == key){
//             return i;
//         }
//         return isFound;
//     }
//     public static void main(String[] args) {
//         int[] arr = {10, 10, 10, 20, 10};
//         int key = 10;
//         System.out.println(findIndexLastOccur(arr, key, 0));
//     }
// }


//9. Print x^n: (x to power n)
// Time Complexity = O(n)
// Space Complexity = O(n)
// public class RecursionBasics
// {
//     public static int printPower(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         return x * printPower(x, n-1);
//     }
//     public static void main(String[] args) {
//         int x = 2, n = 10;
//         System.out.println(x + " to the power " + n + " = " + printPower(x, n));
//     }
// }

//10. Print x^n in O(logn):
// Time Complexity = O(logn)
// Space Complexity = O()
// public class RecursionBasics
// {
//     public static int optimizedPower(int x, int n){
//         // Base Case
//         if(n==0){
//             return 1;
//         }

//         // n is even
//         int halfPower = optimizedPower(x, n/2);
//         int halfPowerSq = halfPower * halfPower;

//         // n is odd
//         if(n%2 != 0){
//             halfPowerSq = x * halfPowerSq;
//         }

//         return halfPowerSq;
//     }
//     public static void main(String[] args) {
//         int x = 2, n = 10;
//         System.out.println(x + " to the power " + n + " = " + optimizedPower(x, n));
//     }
// }


//11. Tiling Problem:
/* Given a "2 X n" board and tiles of size "2 X 1", count the number of ways to tile the given board using the "2 X 1" tiles. */
// Note:- A tile can either be placed horizontally or vertically.
// Time Complexity = O(n)
// Space Complexity = O(n)
// public class RecursionBasics
// {
//     public static int tilingProblem(int n){     //(2 X n) - floor size
//         // Base Case
//         if(n==0 || n==1){
//             return 1;
//         }

//         // Work to be done
//         // 1.Vertical choice
//         int verticalTiles = tilingProblem(n - 1);

//         // 2.Horizontal choice
//         int horizontalTiles = tilingProblem(n - 2);

//         // Total Ways
//         int totalWays = verticalTiles + horizontalTiles;
//         return totalWays;
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         System.out.println(tilingProblem(n));
//     }
// }


//12. Remove Duplicates in a String:
// Time Complexity = O()
// Space Complexity = O()
// public class RecursionBasics
// {
//     public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean map[]){
//         // Base Case
//         if(index == str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         // Work to be done
//         char currentChar = str.charAt(index);
//         if(map[currentChar-'a'] == true){
//             // duplicate element
//             removeDuplicates(str, index+1, newStr, map);
//         }
//         else{
//             map[currentChar-'a'] = true;
//             removeDuplicates(str, index+1, newStr.append(currentChar), map);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "bbbhhuuusshhhh";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }


//13. Friends Pairing Problem:
/* Given "n" friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up */
// Time Complexity = O()
// Space Complexity = O()
// public class RecursionBasics
// {
//     public static int friendsPairing(int n){
//         // Base Case
//         if(n==1 || n==2){
//             return n;
//         }

//         // Choice
//         // 1.Single
//         int single = friendsPairing(n - 1);
        
//         // 2.Pairs
//         int pairs = friendsPairing(n - 2);
//         int totalPairWays = (n-1) * pairs;

//         // Total Ways
//         int totalWays = single + totalPairWays;
//         return totalWays;
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         System.out.println(friendsPairing(n));
//     }
// }


//14. Binary Strings Problem:
// Print all binary strings of size "N" without consecutive ones(1).
public class RecursionBasics
{
    public static void printBinStrings(int n, int lastPlace, String str){
        // Base Case
        if(n==0){
            System.out.println(str);
            return;
        }

        // Work to be done
        // if(lastPlace == 0){
        //     //sit 0 on chair n
        //     printBinStrings(n-1, 0, str+"0");
        //     //sit 1 on chair n
        //     printBinStrings(n-1, 1, str+"1");
        // }
        // else{
        //     printBinStrings(n-1, 0, str+"0");
        // }

        // Better code for work to be done
        printBinStrings(n-1, 0, str+"0");
        
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printBinStrings(n, 0, "");
    }
}