package StringManipulation;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicatesFromStringUsingStringBuilder {
    public static void main(String[] args) {
        String name = "I will achieve my dreams";

        // 1. Split the sentence into individual words using spaces
        String[] words = name.split(" ");
        StringBuilder result = new StringBuilder();

        // 2. Loop through each word separately
        for (String word : words) {
            Set<Character> set = new LinkedHashSet<>();

            // Remove duplicates within the current word
            for (char ch : word.toCharArray()) {
                set.add(ch);
            }

            // Build the cleaned word
            for (char ch : set) {
                result.append(ch);
            }

            // 3. Explicitly add a space back after each word is finished
            result.append(" ");
        }

        // trim() cuts off the very last extra space at the end of the sentence
        System.out.println("Removed Duplicates: " + result.toString().trim());
    }
}





