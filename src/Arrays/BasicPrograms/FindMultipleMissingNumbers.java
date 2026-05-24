package Arrays.BasicPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class FindMultipleMissingNumbers {
        public static void main(String[] args) {
            int[] arr = {5, 1, 9, 2, 7, 4}; // unsorted, 3, 6, 8 are missing

            // Step 1: Sort the array first
            Arrays.sort(arr);

            // Step 2: Now min and max are correct
            int min = arr[0];
            int max = arr[arr.length - 1];

            // Step 3: Add all numbers to a Set
            Set<Integer> numbers = new HashSet<>();
            for (int num : arr) {
                numbers.add(num); // Set has only the numbers that exist-the ones from the array
            }

            // Step 4: Find missing numbers
            System.out.println("Missing numbers:");
            for (int i = min; i <= max; i++) { // Loop checks every number from min to max
                // Min to Max is the range,we know all numbers should exist between min and max
                if (!numbers.contains(i)) { // if number i is NOT in the set, it is not in array, it is  missing
                    System.out.println(i);
                }
            }
        }
    }