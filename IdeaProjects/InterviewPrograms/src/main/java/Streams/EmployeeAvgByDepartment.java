package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeAvgByDepartment {
    //Given a list of Employee objects, how would you use Java 8
    // Streams and Lambda expressions to find the average salary of employees in a particular department?

    public static void main(String[] arggs){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1, "John Doe", 50000, "IT"));
        employees.add(new Employee(2, "Jane Doe", 60000, "HR"));
        employees.add(new Employee(3, "Mark Smith", 70000, "IT"));
        employees.add(new Employee(4, "Lucy Brown", 65000, "Finance"));
        employees.add(new Employee(5, "Anna White", 80000, "HR"));
        employees.add(new Employee(6, "Paul Green", 75000, "Finance"));

        String targetDepartment="IT";
        OptionalDouble averageSalary=employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(targetDepartment))
                .mapToDouble(Employee::getSalary)
                .average();

        if (averageSalary.isPresent()) {
            System.out.printf("Average salary in Associate department: %.2f%n", averageSalary.getAsDouble());
        } else {
            System.out.println("No employees found in Associate department.");
        }
    }
}
