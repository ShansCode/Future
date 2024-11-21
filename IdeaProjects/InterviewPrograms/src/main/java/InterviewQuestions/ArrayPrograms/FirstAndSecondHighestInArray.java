package InterviewQuestions.ArrayPrograms;

public class FirstAndSecondHighestInArray {
    public static void main(String[] args) {


        int[] arr = {2, 3, 6, 1, 8, 5,7,10};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

//        int first=arr[0];
//        int second=arr[0];

        for (int i = 0; i < arr.length;i++) {
            if(arr[i] > first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if( arr[i] > second &&  arr[i] < first){
                third=second;
                second=arr[i];
            }
            else if(arr[i] > third && arr[i] < second){
                third=arr[i];
            }
        }
        System.out.println(first +" "+ second +" "+ third);
    }
}
