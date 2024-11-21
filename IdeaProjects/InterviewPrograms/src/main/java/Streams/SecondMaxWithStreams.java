package Streams;

import Streams.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Find second Max salary
public class SecondMaxWithStreams {

    public static void main(String[] args) {
        int[] salaries = {2000, 3000, 4000, 10000, 5000};

        int secondMaxSalary = firstMaxSalary(salaries);
        if (secondMaxSalary != 1) {
            System.out.println(secondMaxSalary);
        } else System.out.println("not found");
    }

    public static int firstMaxSalary(int[] salaries){
        return Arrays.stream(salaries)
                .distinct() // Remove duplicate salaries
                .boxed()     // Convert IntStream to Stream<Integer>
                .sorted((a, b) -> b - a) // Sort in descending order
                .skip(1)     // Skip the first (maximum) salary
                .findFirst() // Get the second maximum salary
                .orElse(-1); // Return -1 if not found
    }
}