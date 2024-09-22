//1. Merge Sort:
// Time Complexity = O(nlogn)
// Space Complexity = O(n) Extra space for temp array.

// public class DivideAndConquer
// {
//     public static void mergeSort(int arr[], int si, int ei)
//     {
//         //Base case
//         if(si >= ei){
//             return;
//         }
//         //Work to be done
//         int mid = si + (ei - si)/2;
//         mergeSort(arr, si, mid);    //left part
//         mergeSort(arr, mid+1, ei);  //right part
//         merge(arr, si, mid, ei);
//     }
//     public static void merge(int arr[], int si, int mid, int ei)
//     {
//         int temp[] = new int[ei-si+1];
//         int i = si; //iterator for left part
//         int j = mid+1;  //iterator for right part
//         int k=0;    //iterator for temp array

//         while(i<=mid && j<=ei){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//             }
//             else{
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         //left part
//         while(i <= mid){
//             temp[k++] = arr[i++];
//         }
//         //right part
//         while(j <= ei){
//             temp[k++] = arr[j++];
//         }

//         //copy temp to original array
//         for(k=0, i=si; k<temp.length; k++, i++){
//             arr[i] = temp[k];
//         }
//     }
//     public static void printArray(int arr[])
//     {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args)
//     {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         mergeSort(arr, 0, arr.length-1);
//         printArray(arr);
//     }
// }



//2. Quick Sort:
// Time Complexity = O(n^2) Worst Case
// Time Complexity = O(nlogn) Average Case
// Space Complexity = O(1)  Constant, No extra space needed

// public class DivideAndConquer
// {
//     public static void quickSort(int arr[], int si, int ei){
//         //Base case
//         if(si >= ei){
//             return;
//         }

//         //last element
//         int partIndex = partition(arr, si, ei);
//         quickSort(arr, si, partIndex-1);    //left part
//         quickSort(arr, partIndex+1, ei);    //right part
//     }
//     public static int partition(int arr[], int si, int ei){
//         int pivot = arr[ei];
//         int i = si-1;   //to make place for elements smaller than pivot

//         for(int j=si; j<ei; j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         //swap to get correct index for pivot element
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;
//     }
//     public static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {6, 3, 9, 8, 2, 5};
//         quickSort(arr, 0, arr.length-1);
//         printArray(arr);
//     }
// }



//3. Search in Rotated Sorted Array:
// Time Complexity = O(logn)
// Space Complexity = O(1)  Constant
/* Here, Input - sorted, rotated array with distinct numbers(in ascending order). It is rotated at a pivot point. Find the index of given element. */
public class DivideAndConquer
{
    public static int search(int arr[], int tar, int si, int ei){
        //Base case
        if(si > ei){
            return -1;
        }
        //Work to be done
        int mid = si + (ei-si)/2;

        //case Found
        if(arr[mid] == tar){
            return mid;
        }
        //mid on line 1
        if(arr[si] <= arr[mid]){
            //case a: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            //case b: right
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        //mid on line 2
        else{
            //case c: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            //case d: left
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIndex = search(arr, target, 0, arr.length-1);
        System.out.println(tarIndex); 
    }
}