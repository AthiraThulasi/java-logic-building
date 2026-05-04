// Write a Java program to count the frequency of each element in an array.
// Write a Java program to find the most frequent element in an array.

package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCommonOccurrencesInAnArray {
    public static void main(String[] args) {
    int[] arr = {1, 3, 7, 4, 3, 5, 3, 2, 1, 8,8,1};

    Map<Integer,Integer> occurrence = new HashMap<>();
    for(int map : arr){
        occurrence.put(map, occurrence.getOrDefault(map, 0) + 1);
    }
// getOrDefault() is a Map method (works with HashMap, TreeMap, etc.)
// It returns the current value for a key, or a default (like 0) if the key is not present.
// Here, we use it to safely get the count, increment it, and update the map.
// Using get() alone may return null and can lead to NullPointerException.
        System.out.println(occurrence);
}








}
