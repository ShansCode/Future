package DSA;

public class MergeSort {
     public static void main(String[] args){
          int[] arr={20,30,-15,7,55,1};
          mergeSort(arr,0,arr.length-1);
          for(int i:arr){
               System.out.println(i + " ");
          }
     }
     public static void mergeSort(int[] input,int start,int end){
          if(end - start < 1){
               return;
          }
          int mid = (start + end)/2;
          mergeSort(input, start, mid);
          mergeSort(input, mid, end);
          merge(input,start,mid,start);
     }

     public static void merge(int[] input,int start,int mid,int end){
          if (mid < end && input[mid] <= input[mid+1]) {
               return;
          }
     }
}
