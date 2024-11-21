package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class HighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 50000, "IT"));
        employees.add(new Employee(2, "Jane Doe", 60000, "HR"));
        employees.add(new Employee(3, "Mark Smith", 70000, "IT"));
        employees.add(new Employee(4, "Lucy Brown", 65000, "Finance"));
        employees.add(new Employee(5, "Anna White", 80000, "HR"));
        employees.add(new Employee(6, "Paul Green", 75000, "Finance"));

        Map<String, Optional<Employee>>  highestSalaryByDepartment=employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy((e1,e2)-> Integer.compare(e1.getSalary(), e2.getSalary())))
                );
        highestSalaryByDepartment.forEach((department, employee) -> {
            if (employee.isPresent()) {
                System.out.println("Highest salary in " + department + " department: " + employee.get().getSalary() + " (" + employee.get().getName() + ")");
            }
        });






    }
}
