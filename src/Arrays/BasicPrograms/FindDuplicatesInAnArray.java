package Arrays.BasicPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 20, 10};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            if (!set.add(num)) { // If adding FAILED → it's a duplicate → go inside if block
                System.out.println("Duplicate: " + num);
            }


        }
    }
}