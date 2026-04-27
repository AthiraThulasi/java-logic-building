package stringprograms;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {



        public static void main(String[] args) {

            String word = "Javaa";
            char inputArray[] = word.toCharArray();
            Set<Character> linkedHashset = new LinkedHashSet<>();
            // It stores only the first occurrence of each character and ignores duplicates.
            StringBuilder sb = new StringBuilder();
            //✅ Using StringBuilder to build a new string from those unique characters.
            //Used character not char as we use non -primitive data type inside collections
            // childclass HashSet<Character> implements set interface
            //noDuplicateString is the parent reference

            for (char input : inputArray) {
                if (linkedHashset.add(input)) {
                    sb.append(input);//We can’t directly print linkedHashset and expect it to look like "Jav".
                    //StringBuilder take those characters and build the final result.
                }
            }
            System.out.println(sb);

        }}
















}
