package InterviewQuestions.ArrayPrograms;

public class MinAndMaxInArray {

    public static void main(String[] args){
        int[] arr={1,4,2,7,4,9,3};

        int min=arr[0];
        int max=arr[1];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max ){
                max= arr[i];
            }
        }
        System.out.println(min + " " + max);
    }

}
