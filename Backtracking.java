//1. Backtracking in Arrays
// Time Complexity = O(n)
// Space Complexity = O(1)

// public class Backtracking
// {
//     public static void changeArray(int arr[], int i, int val){
//         if(i == arr.length){
//             printArray(arr);
//             return;
//         }
//         arr[i] = val;
//         changeArray(arr, i+1, val+1);
        
//         //Backtracking
//         //We subtract 2 from every element of the array
//         arr[i] = arr[i] - 2;
//     }
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         changeArray(arr, 0, 1);
//         printArray(arr);
//     }
// }



//2. Find and Print all the Subsets of a given string
// Time Complexity = O(n * 2^n)
// Space Complexity = O(n) It is because, everytime n levels are created in the call stack

// public class Backtracking
// {
//     public static void findSubsets(String str, String ans, int i){
//         //Base Case
//         if(i == str.length()){
//             if(ans.length() == 0){
//                 System.out.println("null");
//             }
//             System.out.println(ans);
//             return;
//         }

//         //Recursion
//         //Backtracking also happens for both choices.
//         //Choice is Yes
//         findSubsets(str, ans+str.charAt(i), i+1);
//         //Choice is No
//         findSubsets(str, ans, i+1);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }



//3. Find & Print all Permutations of a String
// Time Complexity = O(n * n!)
// Space Complexity = O(n)  //New String is created.

// public class Backtracking
// {
//     public static void findPermutation(String str, String ans){
//         //Base Case
//         if(str.length() == 0){
//             System.out.println(ans);
//             return;
//         }

//         //Recursion - O(n * n!)
//         for(int i=0; i<str.length(); i++){
//             char curr = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             findPermutation(newStr, ans+curr);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         findPermutation(str, "");
//     }
// }



//4.1. N-Queens Problem
// Place N-Queens on a (N x N) chessboard such that no 2 queens can attack each other
// Time Complexity = O(n!)
// Space Complexity = O()

// public class Backtracking
// {
//     public static void nQueens(char board[][], int row){
//         //base case
//         if(row == board.length){
//             printBoard(board);
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);  //function call to place 'Q'
//                 board[row][j] = 'x';    //Backtrack to change 'Q' to 'x'
//             }
//         }
//     }
//     public static boolean isSafe(char board[][], int row, int col){
//         //vertical up direction (same col, but row is decreased)
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         //diagonally left up direction (both row and col are decreased by 1 till both are >=0)
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //diagonally right up direction (row is decreased and col is increased by 1 respectively till row>=0 && col<board.length)
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //else if queen can be placed safely, then
//         return true;
//     }
//     public static void printBoard(char board[][]){
//         System.out.println("-----Chess Board-----");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'x';
//             }
//         }

//         nQueens(board, 0);
//     }
// }



//4.2. N-Queens Problem - Count number of ways
// Count total number of ways in which we can solve N-Queens problem.
// Time Complexity = O(n!)
// Space Complexity = O()

// public class Backtracking
// {
//     public static void nQueens(char board[][], int row){
//         //base case
//         if(row == board.length){
//             count++;
//             return;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);  //function call to place 'Q'
//                 board[row][j] = 'x';    //Backtrack to change 'Q' to 'x'
//             }
//         }
//     }
//     public static boolean isSafe(char board[][], int row, int col){
//         //vertical up direction (same col, but row is decreased)
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         //diagonally left up direction (both row and col are decreased by 1 till both are >=0)
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //diagonally right up direction (row is decreased and col is increased by 1 respectively till row>=0 && col<board.length)
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //else if queen can be placed safely, then
//         return true;
//     }
    
//     static int count = 0;   //count variable declared as static
//     public static void main(String[] args) {
//         int n = 5;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'x';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println("Total number of ways = " + count);
//     }
// }



//4.3. N-Queens Problem - Print only 1 solution
// Check if problem can be solved & print only 1 solution to N Queens problem.
// Time Complexity = O(n!)
// Space Complexity = O()

// public class Backtracking
// {
//     public static boolean nQueens(char board[][], int row){
//         //base case
//         if(row == board.length){
//             count++;
//             return true;
//         }
//         //column loop
//         for(int j=0; j<board.length; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 if(nQueens(board, row+1)){  //function call to place 'Q'
//                     return true;
//                 }  
//                 board[row][j] = 'x';    //Backtrack to change 'Q' to 'x'
//             }
//         }
//         return false;
//     }
//     public static boolean isSafe(char board[][], int row, int col){
//         //vertical up direction (same col, but row is decreased)
//         for(int i=row-1; i>=0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         //diagonally left up direction (both row and col are decreased by 1 till both are >=0)
//         for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //diagonally right up direction (row is decreased and col is increased by 1 respectively till row>=0 && col<board.length)
//         for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //else if queen can be placed safely, then
//         return true;
//     }
//     public static void printBoard(char board[][]){
//         System.out.println("-----Chess Board-----");
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board.length; j++){
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0;

//     public static void main(String[] args) {
//         int n = 4;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 board[i][j] = 'x';
//             }
//         }

//         if(nQueens(board, 0)){
//             System.out.println("Solution is Possible!");
//             printBoard(board);
//         }
//         else{
//             System.out.println("Solution not Possible!");
//         }
//     }
// }



//5. Grid Ways
// Find number of ways to reach from (0, 0) to (N-1, M-1) in a "N x M" Grid.
// Allowed Moves - right or down.
// Time Complexity = O(2^(n+m))
// Space Complexity = O()

// public class Backtracking
// {
//     public static int gridWays(int row, int col, int n, int m){
//         //Base case
//         if(row==n-1 && col==m-1){   //Condition for last cell
//             return 1;
//         }
//         else if(row==n || col==m){  //Boundary cross condition
//             return 0;
//         }

//         //Move Down
//         int way1 = gridWays(row+1, col, n, m);

//         //Move Right
//         int way2 = gridWays(row, col+1, n, m);

//         //Total Ways
//         return way1 + way2;
//     }
//     public static void main(String[] args) {
//         int n = 3, m = 3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }



//6. Sudoku
// Write a function to complete a Sudoku game
// Time Complexity = O(2^(n+m))
// Space Complexity = O()

public class Backtracking
{
    public static void main(String[] args) {
        
    }
}