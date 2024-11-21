package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class AvgEmployeeSalary {
//Given a list of Employee objects, how would you use Java 8 Streams
// to find the highest  salary of employees in each department  department?
    public static void main(String[] args){

        List<Employee> emp=new ArrayList<>();
        emp.add(new Employee(1,"santosh",320000,"Associate"));
        emp.add(new Employee(2,"Ram",120000,"Manager"));

        Map<String, Employee> data = emp.stream()
                //Collectors.groupingBy() indeed returns a Map
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get)
                ));

                data.forEach((department,employee) ->
                        System.out.println(department+employee));

    }


}
