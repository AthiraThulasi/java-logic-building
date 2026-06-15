package StringManipulation;

public class RemoveTheOccurrenceOfACharacterFromString {
        public static void main(String[] args) {
            String input = "Java Programming";
            char target = 'a';

            StringBuilder result = new StringBuilder();

            // Loop through the string and only keep characters that DO NOT match target
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != target) {
                    result.append(input.charAt(i));
                }
            }

            System.out.println(result.toString()); // Output: Jv Progrmming
        }
    }


/* if (Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(target))
use toLowerCase() on both sides to handle uppercase or lowercase letter as the target*/