package FrequencyAndHashing;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

    public static void main(String[] args) {

        String word = "Athiraa";

        char inputArray[] = word.toCharArray();
        // String is a sequence of characters internally, but Java's for-each loop doesn't work directly on a String
        //for - each only works on arrays and collections.
        // toCharArray() → breaks String INTO individual chars

        Set<Character> linkedHashset = new LinkedHashSet<>();
        // Set-stores unique values and ignores duplicates.
        // Why LinkedHashSet and Not Hashset?  LinkedHashSet preserves insertion order
        // Used character not char as we use non -primitive data type inside collections

        StringBuilder sb = new StringBuilder();

        // Using StringBuilder to build a new string from those unique characters.

        for (char input : inputArray) {
            if (linkedHashset.add(input)) { // just checks if character is unique
                //add() in a Set returns a boolean:
                // add(a) returns true  → character is NEW  → if(true) → append to sb
                // add(a) returns FALSE → character EXISTED → if(false)  → Not append to sb
                sb.append(input);
                //StringBuilder take those characters and build the final result.
            }
        }
        System.out.println(sb);

    }
}

















