package InterviewQuestions;

import java.util.*;

public class DuplicatesInList {
    public List<Integer> findDuplicates(List<Integer> numbers){
        List<Integer> allElements=new ArrayList<>();
        List<Integer> duplicate=new ArrayList<>();

       for(int n:numbers){
           if(allElements.contains(n)){
               if(!duplicate.contains(n)){
                   duplicate.add(n);
                   System.out.println(n);
               }
           }else{
               allElements.add(n);
           }
       }
        return duplicate;
    }

    public List<Integer> qw(List<Integer> numbers){
        Set<Integer> allElements=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();

        for(int n:numbers){
           if(!allElements.add(n)){
               duplicates.add(n);
           }
        }

        List<Integer> duplicateList=new ArrayList<>(duplicates);
        System.out.println(duplicateList);
        return duplicateList;

    }
    public static void main(String[] args){
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,2,3,4);
            DuplicatesInList o=new DuplicatesInList();
            o.findDuplicates(numbers);
            System.out.println("_________________Set________________________");
            o.qw(numbers);
    }
}
