package ArraysPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortTwoUnsortedArrays {
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        // Create a HashSet to store unique elements from the first array
        Set<Integer> set = new HashSet<>();
        // Create a list to store the common elements between the two arrays
        List<Integer> common = new ArrayList<>();

        // Add all elements from the first array to the HashSet
        for (int num : array1) {
            set.add(num); // Adding elements to the set ensures uniqueness
        }

        // Iterate through the second array and check for common elements
        for (int num : array2) {
            // If the current element from array2 is in the set, it is a common element
            if (set.contains(num)) {
                common.add(num); // Add the common element to the list
                set.remove(num); // Remove to prevent duplicates in the result
            }
        }

        // Return the list of common elements
        return common;
    }

    public static void main(String[] args) {
        // Define two arrays to find common elements between them
        int[] array1 = {1, 3, 4, 5, 7};
        int[] array2 = {3, 4, 4, 6, 7, 8};

        // Find the common elements using the findCommonElements method
        SortTwoUnsortedArrays finder = new SortTwoUnsortedArrays();
        List<Integer> commonElements = finder.findCommonElements(array1, array2);
        // Print the common elements
        System.out.println("Common Elements: " + commonElements);
    }
}
