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
            if (linkedHashset.add(input)) {
                sb.append(input);//We can’t directly print linkedHashset and expect it to look like "Athira".
                //StringBuilder take those characters and build the final result.
            }
        }
        System.out.println(sb);

    }
}

















