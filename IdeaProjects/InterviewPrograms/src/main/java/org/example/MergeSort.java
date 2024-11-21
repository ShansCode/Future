package org.example;

public class MergeSort {
    public static void main(String[] args){
        int[] intArray = {20, 30, -15, 7, 55, 1};

        mergeSort(intArray, 0, intArray.length - 1);

        for(int i : intArray){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] input, int start, int end) {
        // Base condition to end recursion
        if (end - start < 1) {
            return;
        }
        // Find the midpoint of the array
        int mid = (start + end) / 2;
        // Recursively sort the left half
        mergeSort(input, start, mid);
        // Recursively sort the right half
        mergeSort(input, mid + 1, end);
        // Merge the sorted halves
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        // Optimization: if the arrays are already sorted, no need to merge
        if(mid < end && input[mid] <= input[mid + 1]){
            return;
        }

        // Initialize pointers for both subarrays
        int i = start;       // Pointer for the left subarray
        int j = mid + 1;     // Pointer for the right subarray
        int tempIndex = 0;   // Pointer for the temp array

        // Temporary array to store merged elements
        int[] temp = new int[end - start + 1];

        // Merge elements from both subarrays into temp[]
        while(i <= mid && j <= end){
            // Compare and copy the smaller element
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // Copy any remaining elements from the left subarray
        while(i <= mid){
            temp[tempIndex++] = input[i++];
        }

        // Copy any remaining elements from the right subarray
        while(j <= end){
            temp[tempIndex++] = input[j++];
        }

        // Copy the merged elements back into the original array
        System.arraycopy(temp, 0, input, start, temp.length);
    }
}
