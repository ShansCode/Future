package Streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class EvenInStream {
    public static void main(String[] args){
        List<Integer> n= Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> w = n.stream()
                .filter(e -> e % 2 ==0 )
                .collect(Collectors.toList());
        System.out.println(w);

        Random m= new Random();

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

    List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(2,"santosh",320000,"Associate"));
        emp.add(new Employee(1,"Ram",120000,"Manager"));
        emp.add(new Employee(9,"santosh",320000,"Associate"));
        emp.add(new Employee(4,"Ram",120000,"Manager"));
     Comparator<Employee> k= ((a,s) ->
         a.getId() - s.getId()
       );
        Collections.sort(emp,k);
        System.out.println(emp);


        System.out.println(emp);
    }
}
