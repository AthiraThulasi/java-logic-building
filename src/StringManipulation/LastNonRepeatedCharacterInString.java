package StringManipulation;
import java.util.HashMap;
import java.util.Map;
public class LastNonRepeatedCharacterInString {
        public static void main(String[] args) {
            String str = "Your life is precious";

            // Convert to character array at the beginning
            char[] characters = str.toCharArray();
            Map<Character, Integer> map = new HashMap<>();

            // Count frequency of each character using your original loop
            for (char ch : characters) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1); // map.get(key) returns the value associated with that key
                } else {
                    map.put(ch, 1); // store the updated count back into the map
                }
            }

            System.out.println("Last non-repeated character is:");

            // Loop backward using the array directly without creating an extra variable
            for (int i = characters.length - 1; i >= 0; i--) {
                if (characters[i] != ' ' && map.get(characters[i]) == 1) {
                    System.out.println(characters[i]);
                    break;
                }
            }
            }

        }




